package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	
	private Soldat commandant;
	private Soldat[] soldats=new Soldat [3];
	private int nbSoldats=0;
	
	public Camp(Soldat commandant) {
		this.commandant=commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain");
	}
	public Soldat getCommandant() {
		return commandant;
	}
	public void ajouterSoldat(Soldat soldat) {
		if(nbSoldats<soldats.length) {
			soldats[nbSoldats]=soldat;
			nbSoldats++;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par "+commandant.getNom());
		}
		else {
			commandant.parler("Désolé "+soldat.getNom()+", notre camp est complet !");
		}
	}
	public void afficherCamp() {
		String res=("Le camp dirigé par "+commandant.getNom()+" contient les soldats:");
		for(int i=0;i<nbSoldats;i++) {
			res+=("\n- "+soldats[i].getNom());
		}
		System.out.println(res);
	}
	public void changerCommandant(Soldat nouveauCommandant) {
		if(nouveauCommandant.getGrade()==Grade.CENTURION) {
			commandant=nouveauCommandant;
			commandant.parler("Moi "+commandant.getNom()+" je prends la direction du camp romain");
		}
		else {
			nouveauCommandant.parler("Je ne suis pas suffisamment gradé pour prendre la direction du camp romain");
		}
	}

}
