package personnages;

public enum Equipement {
	CASQUE("casque",2),
	PLASTRON("plastron",3),
	BOUCLIER("bouclier",3);
	
	private String chaine;
	private int protection;
	
	private Equipement(String chaine,int protection) {
		this.chaine=chaine;
		this.protection=protection;
	}
	@Override
	public String toString() {
		return chaine;
	};
	public int getProtection() {
		return protection;
	}

}
