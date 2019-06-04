public class Character{
  //States variables for everything that extends Character
  String name;
  int ATK;
  int DEF;
  String SP;
  int M1DMG;
}
  class Saiyan extends Character{
    //constructor(input from object made in game, input from object)
    public Saiyan(String saiyanSpecialName, String saiyanName){
      ATK = 95;
      DEF = 90;
      SP = saiyanSpecialName;
      name = saiyanName;
      }
    }
  class Namekian extends Character{
    public Namekian(String namekianSpecialName, String namekianName){
      ATK = 90;
      DEF = 97;
      SP = namekianSpecialName;
      name = namekianName;
    }
  }
