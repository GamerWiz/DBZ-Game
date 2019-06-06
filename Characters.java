public class Characters{
  //States variables for everything that extends Character
  String name;
  int ATK;
  int DEF;
  int HLTH;
  String SP;
  int M1DMG;
}
  class Saiyan extends Character{
    //variables are from Characters class
    //constructor(input from object made in Game.java, input from object made in Game.java)
    public Saiyan(String saiyanSpecialName, String saiyanName){
      ATK = 95;
      DEF = 90;
      HLTH = 300;
      SP = saiyanSpecialName;
      name = saiyanName;
      }
    }
  class Namekian extends Character{
    public Namekian(String namekianSpecialName, String namekianName){
      ATK = 90;
      DEF = 97;
      HLTH = 500;
      SP = namekianSpecialName;
      name = namekianName;
    }
  }
