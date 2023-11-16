package ejercicio2_3;

import java.util.Random;
import java.util.Scanner;

public class ejer3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definir una variable con un valor aleatorio entre 0 y 100 utilizando la ver
		// aquí, si no abajo:

		// (int)Math.floor(Math.random() * (max - min + 1) + min)

		// Decirle al usuario que diga cuál es el número. Pedir números hasta que
		// acierte,
		// pero hay que darle pistas, diciendo si el número introducido es mayor
		// o menor que el que tiene que acertar. Visualizar el número de veces que ha
		// necesitado para adivinar el número.
		
		Random r = new Random();
		
		int adivina = 0;
		int cont = 0;
		int valorDado = r.nextInt(100) + 1;

		Scanner scan = new Scanner(System.in);

		System.out.println(" Selecciona un número para adivinar el valor dado");
		adivina = scan.nextInt();

		while (adivina != valorDado) {
			cont = cont + 1;
			if (adivina > valorDado) {
				System.out.println("el número seleccionado es mayor al que hay que adivinar, intentelo de nuevo.");
				adivina = scan.nextInt();
			} else if (adivina < valorDado) {
				System.out.println("el número seleccionado es menor al que hay que adivinar, intentelo de nuevo.");
				adivina = scan.nextInt();
			} 
		}
		 if (adivina == valorDado) {
				System.out.println("felicidades has acertado el número, has necesitado "+cont+" intentos.");

			}
		scan.close();
	}
}
