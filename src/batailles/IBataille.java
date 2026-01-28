package batailles;

public interface IBataille {
	
	public String decrireContexte();
	
	public void choisirCombattants();
	
	public void preparerCombat();
	
	public void decrireCombat();
	
	public void donnerResultat();
}
