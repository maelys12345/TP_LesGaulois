package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;
	
	public Personnage(String nom,int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int newForce) {
		force=newForce;
	}
	public void parler(String texte) {
		System.out.println(donnerAuteur() + " : \""+texte+"\"");
	}
	protected abstract String donnerAuteur();
	
	protected void DonnerQuiFrappe(int forcePerso,Personnage adversaire) {
		System.out.println(donnerAuteur()+" donne un grand coup de force "+forcePerso+" à "+adversaire.getNom());
	}
	
	public void frapper(Personnage adversaire) {
		if(!adversaire.estATerre() && !estATerre()) {
			DonnerQuiFrappe(force,adversaire);
			adversaire.recevoirCoup(force);
		}
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
	public boolean estATerre() {
		return force==0;
	}

}
