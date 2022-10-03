package n1exercici2;

public class Cotxe {

	//Atributs 
	
	private static final String MARCA="Toyota"; //s'inicialitza perqué és una constant estàtica de classe per tant els objectes Cotxe serán Toyota durant tot el programa.
	
	//model i potencia es poden inicialitzar al constructor. Model podrà variar de valor al llarg del programa, a diferencia de Potencia que es una constant d'objecte Cotxe. 
	private static String model;
	private final int POTENCIA;
	
	
	public Cotxe (String model) {
		this.model=model;
		this.POTENCIA=50;
	}
	public String getMARCA() {
		return MARCA;
	}
	public String getModel() {
		return model;
	}
	public int getPOTENCIA() {
		return POTENCIA;
	}
	
	public void setModel(String model) {
		this.model=model;
	}
	
	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	public String toString() {
		return "Marca del cotxe: " + this.getMARCA() + "\n" + "Model del cotxe: " +  this.model + "\n" + "Potencia del cotxe: " + this.POTENCIA;
	}
}


