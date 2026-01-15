package personnages;

public abstract class Personnage {
	private String nom;
	private int force;
	
	public Personnage(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(donnerAuteur() + " : \""+texte+"\"");
	}
	protected abstract String donnerAuteur();
	
	public void frapper(Personnage adversaire) {
		System.out.println(donnerAuteur()+" donne un grand coup à "+adversaire.getNom());
		adversaire.recevoirCoup(force/3);
	}
	public void recevoirCoup(int forceCoup) {
		force-=forceCoup;
		if(force<=0) {
			force=0;
			parler("J'abandonne...");
		}else {
			parler("Aïe!");
		}
	}

}
