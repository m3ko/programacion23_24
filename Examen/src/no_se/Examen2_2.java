package no_se;
import java.util.Scanner;
public class Examen2_2 {

	public static void main(String[] args) {
		// Escribe un programa en Java, que le pida 2 números al usuario y que el programa imprima
		//todos los números que hay entre esos 2 números (incluyendo los números que ha metido el
		//		usuario).
		
		
		int A,B;
		A=0;
		B=0;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("introduce un numeros");
		A = scan.nextInt();
		System.out.println("introduce otro numero");
		B = scan.nextInt();
		
		
		if(A<B) {
		for(int i = A; i < B+1; i ++) {
			
			System.out.println(i);
		
		}
		}
		else {
			for(int i = B; i < A+1; i ++) {
				
				System.out.println(i);
		}
		
		
		
		
	}

}}
