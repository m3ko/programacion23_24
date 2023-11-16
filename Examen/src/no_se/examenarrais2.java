package no_se;
import java.util.Scanner;
public class examenarrais2 {

	public static void main(String[] args) {
		// //2- Escribe un programa que cree un array del tamaño que se le indique, 
		//y que pida llenarlo con nombres de alumnos. 
		//Ante un nombre que se introduzca por pantalla, el programa 
		//debe indicar si el nombre está en el array o no.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int aux = scan.nextInt();
		
		String nombres[]=new String[aux];
		
		
		for(int i = 0; i < aux; i++) {
			
			System.out.println("Introduzca nombre para llenar le array");
			double aux2 = scan.nextDouble();
			num[i]=aux2;	
		
		
	}

}
