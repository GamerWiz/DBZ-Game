package game;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import characters.*;



public class DBZGame{
	
	
	
	 static void play(String name){
	    try {
	      File audioFile = new File(name + ".wav"); //gets File (based off of string given in method in args)
	      Clip clip = AudioSystem.getClip(); //gets clip to use for File
	      clip.open(AudioSystem.getAudioInputStream(audioFile)); //Opens stream of audioFile to clip
	      clip.start(); //Starts clip
	    }catch(Exception e){
    	  e.printStackTrace();
	    	}
	      
	 	} 
	

	 
	  static void createChar(String race, String name, String SPname) throws IOException, ClassNotFoundException {
		  FileWriter writer = new FileWriter("CharacterSheets/" + name);
    	  writer.write(race);
    	  writer.write(name);
    	  writer.write(SPname);
    	  System.out.println("Character created!");
    	  writer.close();
	  }
	  
	  static void showStats(String name) throws IOException, ClassNotFoundException {
		  File sheet = new File("CharacterSheets/" + name);
		  @SuppressWarnings("resource")
		Scanner reader = new Scanner(sheet);
		  System.out.print(reader.nextLine() + " "); //race
    	  System.out.println(reader.nextLine());     //name
    	  System.out.println("---------");
    	  System.out.println("Special Move: " + reader.nextLine());
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
	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		  
		  
		System.out.println("Main Menu \n (1) Character Creation \n (2) Fight");
	    Scanner MM = new Scanner(System.in);
	    String mainMenuSelect = MM.nextLine();
	    
	    
	    if (mainMenuSelect.equals("1")){
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
	    	System.out.println("Would you like to make another character");

	    }
	    
	    
	    
	    
	    if(mainMenuSelect.equals("2")){
	      System.out.println("Select your character:");	
	      File charFolder = new File("CharacterSheets");
	      String[] charFiles = charFolder.list();
	      for (String i : charFiles) {
	    	  System.out.println(i);
	      }
	      

    	 
    	 
	    }



	  }
}