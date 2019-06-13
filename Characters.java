public class Characters{
  //States variables for everything that extends Character
  String name;
  double ATK;
  double DEF;
  double SPD;
  String SP;
  double M1DMG;
  double HLTH;
}
  class Saiyan extends Characters{
    //variables are from Characters class
    //constructor(input from object made in Game.java, input from object made in Game.java)
    public Saiyan(String saiyanSpecialName, String saiyanName){
      ATK = 95;
      DEF = 90;
      SP = saiyanSpecialName;
      name = saiyanName;
      SPD = 50;
      HLTH = 300;
      }
    }
  class Namekian extends Characters{
    public Namekian(String namekianSpecialName, String namekianName){
      ATK = 90;
      DEF = 97;
      SP = namekianSpecialName;
      name = namekianName;
      SPD = 70;
      HLTH = 500;
    }
  }
