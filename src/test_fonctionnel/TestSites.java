package test_fonctionnel;

import personnages.*;
import sites.*;

public class TestSites {

	public static void main(String[] args) {
		Gaulois vercingetorix=new Gaulois("Vercingetorix",5);
		Gaulois agecanonix=new Gaulois("Agecanonix",1);
		Gaulois assurancetourix=new Gaulois("Assurancetourix",2);
		Gaulois asterix=new Gaulois("Asterix",5);
		Gaulois obelix=new Gaulois("Obelix",15);
		Gaulois prolix=new Gaulois("Prolix",2);
		Soldat minus=new Soldat("Minus",2,Grade.CENTURION);
		Soldat brutus=new Soldat("Brutus",5,Grade.CENTURION);
		Soldat milexcus=new Soldat("Milexcus",2,Grade.SOLDAT);
		Soldat tullius=new Soldat("Tullius Octopus",2,Grade.TESSERARIUS);
		Soldat ballondebaudrus=new Soldat("Ballondebaudrus",3,Grade.OPTIO);
		Village village=new Village(vercingetorix);
		Camp camp=new Camp(minus);
		camp.ajouterSoldat(brutus);
		camp.ajouterSoldat(milexcus);
		camp.ajouterSoldat(tullius);
		camp.ajouterSoldat(ballondebaudrus);
		village.ajouterVillageois(agecanonix);
		village.ajouterVillageois(assurancetourix);
		village.ajouterVillageois(asterix);
		village.ajouterVillageois(obelix);
		village.ajouterVillageois(prolix);
		village.afficherVillage();
		camp.afficherCamp();
		Gaulois abraracourcix=new Gaulois("Abraracourcix",4);
		village.changerChef(abraracourcix);
		Soldat briseradius=new Soldat("Briseradius",2,Grade.SOLDAT);
		Soldat chorus=new Soldat("Chorus",5,Grade.CENTURION);
		camp.changerCommandant(briseradius);
		camp.changerCommandant(chorus);
		

	}

}
