package test_fonctionnel;

import personnages.*;

public class TestGaulois {
	public static void main(String[] args) {
		Druide panoramix=new Druide("Panoramix",2);
		Gaulois abraracourcix=new Gaulois("Abraracourcix",5);
		Gaulois agecanonix=new Gaulois("Agecanonix",1);
		Gaulois assurancetourix=new Gaulois("Assurancetourix",2);
		Gaulois asterix=new Gaulois("Asterix",5);
		Gaulois obelix=new Gaulois("Obelix",15);
		Soldat minus=new Soldat("Minus",6,Grade.SOLDAT);
		minus.equiper(Equipement.CASQUE);
		minus.equiper(Equipement.BOUCLIER);
		minus.equiper(Equipement.PLASTRON);
		panoramix.fabriquerPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(agecanonix);
		while(!asterix.estATerre() && !minus.estATerre()) {
			asterix.frapper(minus);
			minus.frapper(asterix);
		}
	}
}
