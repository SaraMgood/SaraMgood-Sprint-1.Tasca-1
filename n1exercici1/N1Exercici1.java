/*En un grup de música hi ha diferents tipus d’instruments musicals. 
Hi ha instruments de vent, de corda i de percussió. Tots els instruments tenen com a atributs el seu nom, i el seu preu. 
A més, tenen un mètode anomenat tocar(). Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles. 
Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent", 
de corda: “Està sonant un instrument de corda” i de percussió: “Està sonant un instrument de percussió”.
El procés de càrrega d'una classe només té lloc una vegada. 
Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta. 
Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.*/

package n1exercici1;

import java.util.Scanner;

public class N1Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciació objectes 
		Instrument Corda = new Corda("Guitarra", 150.50);
		Instrument Vent = new Vent("Flauta", 33.43);
		Instrument Percussio = new Percussio("Tambor", 20);

		Scanner input = new Scanner(System.in);
		System.out.println("quin instrument vols sentir: \n" + "guitarra, flauta, tambor ?" );
		
		String tria = input.next();
	
		
		switch (tria) {
		
		case "guitarra":
			Corda.tocar(); 
		break;
		case "flauta":
			Vent.tocar();
		break;
		case "tambor":
			Percussio.tocar();
		break;	
		
		default: 
			System.out.println("Introdueix de nou l'instrument");
		}
		
		input.close();
	}

}
