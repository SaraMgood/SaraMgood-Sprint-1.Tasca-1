/*Crea una classe "Cotxe" amb els atributs: marca, model i pot�ncia. 
La marca ha de ser est�tic final, el model est�tic i la pot�ncia final. 
Demostra la difer�ncia entre els tres. N�hi ha algun que es pugui inicialitzar al constructor de la classe?
Afegeix dos m�todes a la classe "Cotxe". Un m�tode est�tic anomenat frenar() i un altre no est�tic anomenat accelerar(). 
El m�tode accelerar ha de mostrar per consola: �El vehicle est� accelerant� i el m�tode frenar() ha de mostrar: �El vehicle est� frenant�. 

Demostra com invocar el m�tode est�tic i el no est�tic des del main() de la classe principal.*/

package n1exercici2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cotxe Cotxe1 = new Cotxe("Model X");
	System.out.println(Cotxe1.toString());
		
		Cotxe.frenar();
		Cotxe1.accelerar();
	}

}
