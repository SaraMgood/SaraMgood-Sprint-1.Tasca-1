package n1exercici1;

public class Vent extends Instrument{
	
	public Vent(String nom, double preu) {
		super(nom, preu);
		
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de vent, anomenat: " + super.getNom() + " i té un preu de " + super.getPreu() + " €");
	}
}
