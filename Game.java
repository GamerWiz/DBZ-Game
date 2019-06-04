import java.util.Scanner;

public class Game{
  public static void main(String[] args){
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
      System.out.println("You created " + playerSaiyan.name + "!" + " His special move is " + playerSaiyan.SP + "!");
    }
    if(chosenClass.equals("Namekian")){
      System.out.println("What is the name of your Namekian?");
      Scanner namekianNamer = new Scanner(System.in);
      String playerNamekianName = namekianNamer.nextLine();
      System.out.println("Name its special move");
      Scanner namekianSpecialNamer = new Scanner(System.in);
      String playerNamekianSpecialName = namekianSpecialNamer.nextLine();
      Namekian playerNamekian = new Namekian(playerNamekianSpecialName, playerNamekianName);
      System.out.println("You created " + playerNamekian.name + "!" + " His special move is " + playerNamekian.SP + "!");
    }
  }
}
