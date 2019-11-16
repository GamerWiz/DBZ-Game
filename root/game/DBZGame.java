package game;


import java.awt.AWTException;
import java.awt.Menu;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
import java.util.Scanner;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;





public class DBZGame{
	
	static Scanner scan = new Scanner(System.in);
    static File charFolder = new File("characters");
	static String[] charFiles = charFolder.list();
	
      static String ask(String prompt) {
    	  System.out.println(prompt);
    	  String answer = scan.nextLine();
    	  return answer;
      }
      

    
    
      static void play(String file) throws FileNotFoundException {
    	  Media sound = new Media(new File(file).toURI().toString());
    	  MediaPlayer mediaPlayer = new MediaPlayer(sound);
    	  mediaPlayer.play();
      }
	 

	  



	  static double attack(double victimHLTH, double attackerATK){
	     Random rand = new Random();
	     double initRand = rand.nextInt(3) + 98;
	     double rand1 = initRand/100d;
	     attackerATK = attackerATK * rand1;
	     victimHLTH = victimHLTH - attackerATK;
	     return victimHLTH;
	    }
	  
	  static void run() throws ClassNotFoundException, IOException {
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


	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, AWTException{
	
		  
	  }
}
	