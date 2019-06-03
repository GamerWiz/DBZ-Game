public class Characters{
  static int ATK;
  static int DEF;
  static String M1;
  static int M1DMG;
  class Boxer extends Characters{
    public void Boxer(){
      ATK = 95;
      DEF = 90;
      M1 = "Punch";
      M1DMG = ATK + 5;
      }
    }
}
