package n2exercici1;

public class Telefon {
	//atributs
	private String marca;
	private String model;
	//constructor
	public Telefon (String marca, String model) {
		this.marca=marca;
		this.model=model;
	}
	//getters i setters
	public String getMarca() {
		return marca;
	}
	public String getModel() {
		return model;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public void setModel(String model) {
		this.model=model;
	}
	//mètode propi
	public String trucar(String num) {
		return "S'està trucant al número: " + num;
	}
	
	
}
