public class Characters{
  //States variables for everything that extends Character
  String name;
  int ATK;
  int DEF;
  int INTL;
  String SP;
  int M1DMG;
  int HLTH;
}
  class Saiyan extends Character{
    //variables are from Characters class
    //constructor(input from object made in Game.java, input from object made in Game.java)
    public Saiyan(String saiyanSpecialName, String saiyanName){
      ATK = 95;
      DEF = 90;
      SP = saiyanSpecialName;
      name = saiyanName;
      INTL = 50;
      HLTH = 300;
      }
    }
  class Namekian extends Character{
    public Namekian(String namekianSpecialName, String namekianName){
      ATK = 90;
      DEF = 97;
      SP = namekianSpecialName;
      name = namekianName;
      INTL = 70;
      HLTH = 500;
    }
  }
