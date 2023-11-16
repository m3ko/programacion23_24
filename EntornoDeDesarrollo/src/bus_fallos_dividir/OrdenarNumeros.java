package bus_fallos_dividir;

import java.util.Scanner;

public class OrdenarNumeros {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// ordenar 3 números en orden ascendente

		int z1, z2, z3;

		int menor = 0, mediano = 0, mayor = 0;

		System.out.println("Introduce número 1: ");

		z1 = input.nextInt();

		System.out.println("Introduce número 2: ");

		z2 = input.nextInt();

		System.out.println("Introduce número 3: ");

		z3 = input.nextInt();

		if (z1 < z2 && z1 < z3) {

			menor = z1;

			if (z1 < z2 && z2 < z3) {

				mediano = z2;

				mayor = z3;

			}

			else {

				mediano = z3;

				mayor = z2;

			}

		} else {

			if (z2 < z1 && z2 < z3) {

				menor = z2;

				if (z2 < z1 && z1 < z3) {

					mediano = z1;

					mayor = z3;

				} else {

					mediano = z3;

					mayor = z1;

				}
			}

			else {

				if (z3 < z1 && z3 < z2) {

					menor = z3;

					if (z3 < z1 && z2 < z1) {

						mediano = z2;

						mayor = z1;

					} else {

						mediano = z1;

						mayor = z2;

					}

				}

			}

		}
		if (z1 == z2 && z2 == z3) {

			System.out.println("Los numeros son iguales");
		}

		else {
			System.out.println("Ordenados: " + menor + "-" + mediano + "-" + mayor);
		}

	}
}
