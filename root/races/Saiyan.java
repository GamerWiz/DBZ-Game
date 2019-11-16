package races;

import game.Character;
import game.ID;

public class Saiyan extends Character {

	public Saiyan(String name, String SPname) {
		super(name, SPname);
		 id = ID.Saiyan;
		 ATK = 90;
	     DEF = 97;
	     SPD = 95;
	     HLTH = 100;
	}
   
}