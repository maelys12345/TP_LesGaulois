package personnages;

public class Soldat extends Romain {
	
	private Grade grade;
	private Equipement[] tabEquipement=new Equipement[3];
	private int nbEquipement=0;
	
	public Soldat(String nom,int force,Grade grade) {
		super(nom,force);
		this.grade=grade;
	}
	public Grade getGrade() {
		return grade;
	}
	@Override
	protected String donnerAuteur() {
		return "Le "+grade.toString()+" "+getNom();
	}
	public void equiper(Equipement armure) {
		boolean dejaEquipe=false;
		for(int i=0;i<3;i++) {
			if(armure.equals(tabEquipement[i])) {
				dejaEquipe=true;
			}
		}
		if(!dejaEquipe) {
			tabEquipement[nbEquipement]=armure;
			nbEquipement++;
			System.out.println(donnerAuteur()+" s'équipe avec un "+armure.toString());
		}
	}
	@Override
	public void recevoirCoup(int forceCoup) {
		for(int i=0;i<nbEquipement;i++) {
			forceCoup-=tabEquipement[i].getProtection();
			if(forceCoup<=0) {
				forceCoup=0;
			}
			System.out.println("Le "+tabEquipement[i].toString()+" absorbe "+tabEquipement[i].getProtection()+" du coup");
		}
		force-=forceCoup;
		if(force<=0) {
			force=0;
			parler("J'abandonne...");
		}else {
			parler("Aïe!");
		}
	}

}
