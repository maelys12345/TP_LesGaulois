package test_fonctionnel;

import personnages.*;

public class TestGaulois {
public static void main(String[] args) {
	Gaulois asterix=new Gaulois("Asterix",8);
	asterix.parler("Bonjour à tous");
	Romain minus=new Romain("Minus",6);
	minus.parler("UN GAU... UN GAUGAU...");
	for(int i=0;i<3;i++) {
		//minus.recevoirCoup(3);
		asterix.frapper(minus);
	}
}
}
