package n1exercici1;

public class Percussio extends Instrument {
	public Percussio(String nom, double preu) {
		super(nom, preu);
		
	}

	public void tocar() {
		System.out.println("Est� sonant un instrument de percussi�, anomenat: " + super.getNom() + " i t� un preu de " + super.getPreu() + " �");
	}
}
