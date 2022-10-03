/*En un grup de m�sica hi ha diferents tipus d�instruments musicals. 
Hi ha instruments de vent, de corda i de percussi�. Tots els instruments tenen com a atributs el seu nom, i el seu preu. 
A m�s, tenen un m�tode anomenat tocar(). Aquest, �s abstracte a la classe instrument i, per tant, s�ha d�implementar a les classes filles. 
Si s�est� tocant un instrument de vent, el m�tode ha de mostrar per consola: "Est� sonant un instrument de vent", 
de corda: �Est� sonant un instrument de corda� i de percussi�: �Est� sonant un instrument de percussi�.
El proc�s de c�rrega d'una classe nom�s t� lloc una vegada. 
Demostra que la c�rrega pot ser provocada per la creaci� de la primera inst�ncia d'aquesta classe o per l'acc�s a un membre est�tic d'aquesta. 
Cerca informaci� sobre els blocs d'inicialitzaci� i blocs est�tics en Java.*/

package n1exercici1;

import java.util.Scanner;

public class N1Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciaci� objectes 
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
