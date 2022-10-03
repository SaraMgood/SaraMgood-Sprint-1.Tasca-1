/*Crea una classe anomenada "Telèfon" amb els atributs marca i model, i el mètode trucar(). 
Aquest mètode ha de rebre un String amb un número de telèfon. 
El mètode ha de mostrar per consola un missatge dient que s’està trucant al número rebut per paràmetre. 

Crea una interfície anomenada "Camera" amb el mètode fotografiar(), 
i una altra interfície anomenada Rellotge amb el mètode alarma().

Crea una classe anomenada "Smartphone" que sigui subclasse de "Telèfon" i que a la vegada implementi les interfícies "Camera" i "Rellotge".
El mètode fotografiar() ha de mostrar per consola: “S’està fent una foto” i el mètode alarma() ha de mostrar: “Està sonant l’alarma”.

Des del main() de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.*/

package n2exercici1;

public class Main {

	public static void main(String[] args) {
		//instanciació objecte telefon de la Class Telefon
		Telefon telefon1 = new Telefon("LG","X45");
		//ús mètode trucar
		System.out.println(telefon1.trucar("934155633"));
		//instanciació objecte 'xiaomi' de la classe Smartphone (la qual hereda de Telefon i implementa interfaces Camera y Rellotge)
		Smartphone xiaomi = new Smartphone ("Xiaomi", "Single");
		// ús mètode fotografiar i alarma 
		xiaomi.fotografiar();
		xiaomi.alarma();
	}

}
