package n1exercici1;

public class Vent extends Instrument{
	
	public Vent(String nom, double preu) {
		super(nom, preu);
		
	}

	public void tocar() {
		System.out.println("Est� sonant un instrument de vent, anomenat: " + super.getNom() + " i t� un preu de " + super.getPreu() + " �");
	}
}
