package n1exercici1;

public class Corda extends Instrument   {

	public Corda(String nom, double preu) {
		super(nom, preu);
		
	}

	public void tocar() {
		System.out.println("Està sonant un instrument de corda, anomenat: " + super.getNom() + " i té un preu de " + super.getPreu() + " €");
	}
}	
