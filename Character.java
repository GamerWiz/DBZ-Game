public class Character{
  //States variables for everything that extends Character
  String name;
  int ATK;
  int DEF;
  String SP;
  int M1DMG;
}
  class Saiyan extends Character{
    public Saiyan(String x, String y){
      ATK = 95;
      DEF = 90;
      SP = x;
      name = y;
      }
    }
  class Namekian extends Character{
    public Namekian(String a, String b){
      ATK = 90;
      DEF = 97;
      SP = a;
      name = b;
    }
  }
