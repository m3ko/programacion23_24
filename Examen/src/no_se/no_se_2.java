package no_se;

import java.util.Scanner;

public class no_se_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		double media = 0;
		double faltas = 0;
		System.out.println("Introduce la media de calificaciones");
		media = scan.nextInt();
		if (media >= 3.5 && media <= 4){
			System.out.println("Introduce la cantidad de faltas");
			faltas = scan.nextInt();
		}
			else if (media<0 || media>4) {
				System.out.println("ERROR, la media debe de estar entre el 0 y el 4");
			}
		if (faltas <= 3 || faltas >= 0 ) {
			System.out.println("Apto para la beca");
		}	
		else if (faltas < 0 ) {
			
		}
			}
}
