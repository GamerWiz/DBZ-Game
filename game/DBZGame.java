package game;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;



public class DBZGame{
	
    static File charFolder = new File("characters");
	

	
      static void play() throws FileNotFoundException, JavaLayerException {
    	  FileInputStream fis = new FileInputStream("finalflash.mp3");
    	  Player player = new Player(fis);
    	  player.play();
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
	  





	  static double attack(double victimHLTH, double attackerATK){
	     Random rand = new Random();
	     double initRand = rand.nextInt(3) + 98;
	     double rand1 = initRand/100d;
	     attackerATK = attackerATK * rand1;
	     victimHLTH = victimHLTH - attackerATK;
	     return victimHLTH;
	    }


	  @SuppressWarnings("resource")
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, JavaLayerException{
	
		  
  	boolean running = true;  
	while (running) {
		
		System.out.println("Main Menu \n (1) Character Creation \n (2) Characters \n (3) Fight");
	    Scanner MM = new Scanner(System.in);
	    String mainMenuSelect = MM.nextLine();
	    
	    CharacterCreation:
	    while (mainMenuSelect.equals("1")){
			System.out.println("What race is your character?");
			Scanner r = new Scanner(System.in);
			String race = r.nextLine();
			System.out.println("Name your character");
			Scanner n = new Scanner(System.in);
			String name = n.nextLine();
			System.out.println("What is your character's super attack?");
			Scanner s = new Scanner(System.in);
			String superName = s.nextLine();
			createChar(race, name, superName);
			Scanner again = new Scanner(System.in);
			System.out.println("Would you like to make another character? [Y] [N]");
			if (again.hasNext("N")) {
				break CharacterCreation;
			} 
			else if(again.hasNext("Y")) {
				continue CharacterCreation;
			}
			
	    }
	    
	    
	    
	    while(mainMenuSelect.equals("2")) {
	    	String[] charFiles = charFolder.list();
	    	System.out.println("Select character");
	    	System.out.println("---------");
	        for (String i : charFiles) {
	        	System.out.print(i + "    ");
		      }
	        System.out.println("\n");
	        Scanner wc = new Scanner(System.in);
	        String whichChar = wc.nextLine();
	        for (String i : charFiles) {
	        	if(whichChar.equals(i)) {
	        		showStats(i);
	        	}
		      }
	    }
	    
	    
	    
	    Fight:
	    while(mainMenuSelect.equals("3")){
	      System.out.println("Select your character:");	
	      String[] charFiles = charFolder.list();
	      for (String i : charFiles) {
	    	  System.out.print(i + "    ");
	      }
	    }
		}
		



	  }
}