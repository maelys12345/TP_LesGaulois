package personnages;

public class Gaulois extends Personnage {
	private float forcePotion;
	
	public Gaulois(String nom,int force) {
		super(nom,force);
	}
	public void setForcePotion(int newForcePotion) {
		forcePotion=(float)newForcePotion;
	}
	@Override
	protected String donnerAuteur() {
		return("Le gaulois "+getNom());
	}
	@Override
	public void frapper(Personnage adversaire) {
		if(!adversaire.estATerre() && !estATerre()) {
			if(forcePotion<1) {
				forcePotion=1;
			}
			DonnerQuiFrappe((int)(getForce()*forcePotion),adversaire);
			adversaire.recevoirCoup((int)(getForce()*forcePotion)/3);
			forcePotion-=0.5;
		}
	}

}
