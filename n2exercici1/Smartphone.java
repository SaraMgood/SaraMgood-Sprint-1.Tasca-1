package n2exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge{
	
	//constructor
	public Smartphone  (String marca, String model) {
		super(marca, model);
		
	}
	
	@Override
	public void fotografiar() {
		System.out.println("S'est? fent una foto");
		
	}

	@Override
	public void alarma() {
		System.out.println("Est? sonant l'alarma");
		
	}

	
}	


