import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Game{

  static void kamehameha(){
    //TimeUnit must be put in a try/catch
    try{
      System.out.println("KAME");
      TimeUnit.SECONDS.sleep(1); //makes it wait for 1 second
      System.out.println("HAME");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("HAAAA");
      TimeUnit.SECONDS.sleep(2);
    }
    catch (InterruptedException e) {
      System.err.format("Error");
    }
  }


  static double attack(double victimHLTH, double attackerATK){
     Random rand = new Random();
     int rand1 = rand.nextInt(100);
     if(rand1 < 98){
      while(rand1<98){             //98-100
        rand1++;                   //if # is less, it adds until 98 and then adds random (1-2) to get btwn 98-100
      }
      int rand2 = rand.nextInt(3);
      rand1 = (rand1 + rand2)/100;
    }
      attackerATK = attackerATK * rand1;
      victimHLTH = victimHLTH - attackerATK;
      return victimHLTH;
    }

  public static void main(String[] args){
    //Initialization of these is needed so they can be read outside of if statements
    String playerSaiyanName = "0";
    String playerSaiyanSpecialName = "0";

    Scanner whatClass = new Scanner(System.in);
    System.out.println("What class would you like?");
    System.out.println("Options:\n (1) Saiyan\n (2) Namekian");
    String chosenClass = whatClass.nextLine();
    if(chosenClass.equals("1")){
      System.out.println("What is the name of your Saiyan?");
      Scanner saiyanNamer = new Scanner(System.in);
      playerSaiyanName = saiyanNamer.nextLine();
      System.out.println("Name its special move");
      Scanner saiyanSpecialNamer = new Scanner(System.in);
      playerSaiyanSpecialName = saiyanSpecialNamer.nextLine();
    }
    if(chosenClass.equals("2")){
      System.out.println("What is the name of your Namekian?");
      Scanner namekianNamer = new Scanner(System.in);
      String playerNamekianName = namekianNamer.nextLine();
      System.out.println("Name its special move");
      Scanner namekianSpecialNamer = new Scanner(System.in);
      String playerNamekianSpecialName = namekianSpecialNamer.nextLine();
      Namekian playerNamekian = new Namekian(playerNamekianSpecialName, playerNamekianName);
      System.out.println("Created " + playerNamekian.name);
      System.out.println("ATK: " + playerNamekian.ATK);
      System.out.println("DEF: " + playerNamekian.DEF);
      System.out.println("INTL: " + playerNamekian.INTL);
      System.out.println("HLTH: " +playerNamekian.HLTH);
      System.out.println("Special Move: " + playerNamekian.SP);
    }

    Saiyan playerSaiyan = new Saiyan(playerSaiyanSpecialName, playerSaiyanName); //Creates custom Saiyan for use in fights
    System.out.println("Main Menu \n (1) Fight");
    Scanner MM = new Scanner(System.in);
    String mainMenuSelect = MM.nextLine();
    if(mainMenuSelect.equals("1")){
      System.out.println("Who would you like to fight? \n (1) Frieza");
      Scanner bossS = new Scanner(System.in);
      String bossSelect = bossS.nextLine();

      if(bossSelect.equals("1")){
        Frieza frieza = new Frieza();
        System.out.println("Fight!");
        while(frieza.HLTH > 0){
          System.out.println(" (1) Attack \n (2) Block \n (3) Ultimate");
          Scanner M = new Scanner(System.in);
          String move = M.nextLine();
          if(move.equals("1")){
            frieza.HLTH = attack(frieza.HLTH, playerSaiyan.ATK);
            if(frieza.HLTH < 0){ //Checks for Boss Death
              frieza.HLTH = 0;
              System.out.println("You attacked " + frieza.name + "! " + frieza.name + ": " + frieza.HLTH);
              System.out.println("You defeated Frieza!");
              break;
            }
            System.out.println("You attacked " + frieza.name + "! " + frieza.name + ": " + frieza.HLTH);
          }
          if(move.equals("2")){
            System.out.println("Blocking...");
          }
          playerSaiyan.HLTH = attack(playerSaiyan.HLTH, frieza.ATK);
          System.out.println("Frieza attacked you!" + " Health: " + playerSaiyan.HLTH);

        }
      }


    }

}
}
