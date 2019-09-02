package game;


import java.awt.AWTException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import races.Namekian;
import races.Saiyan;



public class DBZGame{
	
	static Scanner scan = new Scanner(System.in);
    static File charFolder = new File("characters");
	static String[] charFiles = charFolder.list();
	
      static String ask(String prompt) {
    	  System.out.println(prompt);
    	  String answer = scan.nextLine();
    	  return answer;
      }

    
    
      static void play(String file) throws FileNotFoundException, JavaLayerException {
    	  FileInputStream fis = new FileInputStream(file);
    	  Player player = new Player(fis);
    	  player.play();
      }
	 

	  



	  static double attack(double victimHLTH, double attackerATK){
	     Random rand = new Random();
	     double initRand = rand.nextInt(3) + 98;
	     double rand1 = initRand/100d;
	     attackerATK = attackerATK * rand1;
	     victimHLTH = victimHLTH - attackerATK;
	     return victimHLTH;
	    }


	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, JavaLayerException, AWTException{
	
		  
  	boolean running = true;  
	while (running) {
		
		System.out.println("Main Menu \n (1) Character Creation \n (2) Characters \n (3) Fight");
	    String mainMenuSelect = scan.nextLine();

	    while (mainMenuSelect.equals("1")){
	    	Menu.CharacterCreation();
	    }
	    
	    
	    
	    while(mainMenuSelect.equals("2")) {
	    	Menu.showStats();
	    }
	    
	    
	    
	    while(mainMenuSelect.equals("3")){
	        Menu.bossFightSelect();	
	      }
	    
	    
	    
}
	  }
}
	