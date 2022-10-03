package n1exercici1;

abstract class Instrument {
	
	static {
		System.out.println("*** Benvinguda al grup d'Instruments ***");
	}
	//atributs 
	
	private  String nom;
	private  double preu;

	//constructor 
	
	public Instrument (String nom, double preu) {
		this.nom=nom;
		this.preu=preu;
	}
	
	//getters i setters
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom=nom;
	}
	
	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
	//mètode abstract --> cada classe filla l'implementará diferent. 
	public abstract void tocar();
}
