import java.util.Scanner;
import java.util.Date;
import java.util.concurrent.TimeUnit;

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
  public static void main(String[] args){
    System.out.println("Main Menu:\n Character Creation");
    Scanner MM = new Scanner(System.in);
    String mainMenuSelect = MM.nextLine();
    if(mainMenuSelect.equals)
    Scanner whatClass = new Scanner(System.in);
    System.out.println("What class would you like?");
    System.out.println("Options:\n Saiyan\n Namekian");
    String chosenClass = whatClass.nextLine();
    if(chosenClass.equals("Saiyan")){
      System.out.println("What is the name of your Saiyan?");
      Scanner saiyanNamer = new Scanner(System.in);
      String playerSaiyanName = saiyanNamer.nextLine();
      System.out.println("Name its special move");
      Scanner saiyanSpecialNamer = new Scanner(System.in);
      String playerSaiyanSpecialName = saiyanSpecialNamer.nextLine();
      Saiyan playerSaiyan = new Saiyan(playerSaiyanSpecialName, playerSaiyanName);
      System.out.println("Created " + playerSaiyan.name);
      System.out.println("ATK: " + playerSaiyan.ATK);
      System.out.println("DEF: " + playerSaiyan.DEF);
      System.out.println("INTL: " + playerSaiyan.INTL);
      System.out.println("HLTH: " + playerSaiyan.HLTH);
      System.out.println("Special Move: " + playerSaiyan.SP);
    }
    if(chosenClass.equals("Namekian")){
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
      System.out.println("Special Move: " + playerNamekian.SP);    }

  }
}
