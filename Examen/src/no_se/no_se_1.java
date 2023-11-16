package no_se;

import java.util.Scanner;

public class no_se_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = 0;
		System.out.println("Escribir un número entre 0-100");
		num = scan.nextInt();

		if (num < 60) { 
			System.out.println("F");
		} else if (num >= 60 && num < 70) {
				System.out.println("D");
			} else if (num > 69 && num < 80) {
					System.out.println("C");
				} else if (num > 79 && num < 90) {
						System.out.println("B");
					} else if (num > 89 && num <= 100) {
							System.out.println("A");
						} else {
							System.out.println("no es un numero entre 0-100");
						}
					}
}