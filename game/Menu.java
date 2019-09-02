package game;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import races.Namekian;
import races.Saiyan;

public class Menu extends DBZGame  {

      static HashMap<String, Character> charInstantiation = new HashMap<String, Character>();
	  
      static Character playerInit(String race, String name, String SPname) {
		  charInstantiation.put("Saiyan", new Saiyan(name, SPname));
		  charInstantiation.put("Namekian", new Namekian(name, SPname));
	      return charInstantiation.get(race);
	  }


	  static void createChar(String race, String name, String SPname) throws IOException, ClassNotFoundException {
		  FileWriter wr = new FileWriter("characters/" + name);
		  BufferedWriter writer = new BufferedWriter(wr); 
    	  writer.write(race + System.lineSeparator());
    	  writer.write(name + System.lineSeparator());
    	  writer.write(SPname);
    	  System.out.println("Character created!");
    	  writer.close();
	  }
	  
	  static void showStats(String name) throws IOException, ClassNotFoundException {
		  File sheet = new File("characters/" + name);
		  @SuppressWarnings("resource")
		Scanner reader = new Scanner(sheet);
		  System.out.print(reader.nextLine() + " "); //race
    	  System.out.println(reader.nextLine());     //name
    	  System.out.println("---------");
    	  System.out.println("Special Move: " + reader.nextLine());
    	  System.out.println("\n \n \n");
	  }
	
	  
	  //MENU METHODS
	  
	  
	  //1			1			1			1			1			1
	static void CharacterCreation() throws ClassNotFoundException, IOException{
		boolean inCharCreation = true;
		CharacterCreation:
			while (inCharCreation) {
						String race = ask("What race is your character?");
				String name = ask("Name your character");
				  	for (String p : charFiles) {
						if(name.equals(p)) {
							System.out.println("Already a character! Choose another name or edit the duplicate character's name \n");
							break CharacterCreation;
						}
					}
				String superName = ask("What is your character's super attack?");
				createChar(race, name, superName);
				System.out.println("Would you like to make another character? [Y] [N]");
				if (scan.hasNext("N")) {
					break CharacterCreation;
				} 
				else if(scan.hasNext("Y")) {
					continue CharacterCreation;
					}
				}
		}	
	
	
	//2 			2			2			2			2			2
	static void showStats() throws ClassNotFoundException, IOException {
    	System.out.println("Select character:");
        for (String j : charFiles) {
        	System.out.print(j + "    ");
	      }
        System.out.println("\n");
        String whichChar = scan.nextLine();
        for (String i : charFiles) {
        	if(whichChar.equals(i)) {
        		showStats(i);
        	}
	      }
	}
	
	//3 			3			3			3			3			3
	
	static void bossFightSelect() throws FileNotFoundException {
	    Character playerChar = null;  

		
		System.out.println("Select your character:");	
	      String[] charFiles = charFolder.list();
	      for (String i : charFiles) {
	    	  System.out.println(i + "    ");
	      }
	      String whichChar = scan.nextLine(); 
	      for (String i : charFiles) {
	    	  if(whichChar.equals(i)) {
	    		  File sheet = new File("characters/" + i);
	    		  Scanner r = new Scanner(sheet);
	    		  String race = r.nextLine();
	    		  String name = r.nextLine();
	    		  String SPname = r.nextLine();
	    		  playerChar = playerInit(race, name, SPname);
	    	  }
	      }
	      System.out.println(whichChar + " was selected!");
	      
	      System.out.println("Who would you like to fight? \n (1) Frieza");
	      String bossSelect = scan.nextLine();	   
	      bossFight(bossSelect, playerChar);
	}
	
	static void bossFight(String bossSelect, Character playerChar) {
	      if(bossSelect.equals("1")){
	          Frieza frieza = new Frieza();
	          System.out.println("Fight!");
	          while(frieza.HLTH > 0){
	              System.out.println(" (1) Attack \n (2) Block \n (3) Ultimate");
	              String move = scan.nextLine();
	              if(move.equals("1")){
	                frieza.HLTH = attack(frieza.HLTH, playerChar.ATK);
	                if(frieza.HLTH < 0){ //Checks for Boss Death
	                  frieza.HLTH = 0;
	                  System.out.println("You attacked " + frieza.name + "! " + frieza.name + ": " + frieza.HLTH);
	                  System.out.println("You defeated Frieza!");
	                  break;
	                }
	                System.out.println("You attacked " + frieza.name + "! " + frieza.name + ": " + Math.round(frieza.HLTH));
	              }
	              if(move.equals("2")){
	                System.out.println("Blocking...");
	              }
	              if(move.equals("3")){
	                System.out.println(playerChar.SPname + "!");
	              }
	              
	              playerChar.HLTH = attack(playerChar.HLTH, frieza.ATK);
	              if(playerChar.HLTH < 0){
	                playerChar.HLTH = 0;
	                System.out.println("Frieza attacked you!" + " Health: " + Math.round(playerChar.HLTH));
	                System.out.println("You lost!");
	                break;
	              }
	              System.out.println("Frieza attacked you!" + " Health: " + Math.round(playerChar.HLTH));

	          }
	      }
	}
	
	
	
}
