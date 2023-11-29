package eval1;

import java.util.Scanner;

public class niko_efrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nombres = { "Mexicano", "Alioli", "CheeseBurger", "BBQ", "Vegetal", "Basica" };
		String[] ingredientes = { "carne, tomate, picante, pimiento", "carne, lechuga, bacon, alioli",
				"carne, cebolla, cheddar, lechuga, tomate, mahonesa",
				"carne, bacon, cebolla, cheddar, lechuga, tomate, mayonesa, barbacoa",
				"carne, cebolla, lechuga, tomate, mayonesa", "carne" };
		double[] precio = { 5.50, 5, 5, 5, 4.50, 3.75 };
		int[] stock = { 12, 8, 23, 15, 20, 25 };

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"1. DINERO NECESARIO: Calcular cuánto nos costaría comprar 3 hamburguesas barbacoa y 2 vegetales.\r\n"
						+ "\r\n"
						+ "2. LAS HAMBURGUESAS MÁS BARATAS: visualizar hamburguesas por debajo del precio medio.\r\n"
						+ "\r\n"
						+ "3. INFORMACIÓN HAMBURGUESA: Pedir el nombre de una hamburguesa y visualizar sus ingredientes y su precio.\r\n"
						+ "\r\n"
						+ "4. SIN LACTOSA: A las hamburguesas que no tienen queso, hay que añadir SIN LACTOSA en los ingredientes. (cadena.contains(“”))\r\n"
						+ "\r\n"
						+ "5. DISMINUIR STOCK: Pedir al usuario el nombre de una hamburguesa y disminuir el stock en 1 si el stock es mayor que 0, si no visualizar que no hay stock suficiente.\r\n"
						+ "\r\n" + "6. SALIR: Visualizar mensaje de salida.");

		int menu = scan.nextInt();

		if (menu == 1) {
			System.out.println("El total sería = "+uno(precio, nombres));
		} else if (menu == 2) {
			dos(precio, nombres);
		} else if (menu == 3) {
			tres(precio, nombres, ingredientes);
		} else if (menu == 4) {
			cuatro(ingredientes);
		} else if (menu == 5) {
			cinco(stock, nombres);
		} else if (menu == 6) {

			System.out.println("Adios");

		}

	}

	public static double uno(double[] precio, String[] nombres) {

		double aux1 = 0;
		double aux2 = 0;
		double resultado = 0;
		for (int i = 0; i < nombres.length; i++) {

			if (nombres[i].contains("BBQ")) {

				aux1 = precio[i];

			}

			if (nombres[i].contains("Vegetal")) {

				aux2 = precio[i];

			}

		}
		
		aux1 = aux1 *3;
		aux2 = aux2 *2;
		
		resultado = aux1 + aux2;
		
		return resultado;
	}

	public static void dos(double[] precio, String[] nombres) {

		double resultado = 0;
		double media = 0;
		String[] debajoMedia = new String[nombres.length];

		for (int i = 0; i < precio.length; i++) {

			media = media + precio[i];

		}

		media = media / precio.length;

		for (int i = 0; i < precio.length; i++) {

			if (precio[i] < media) {

				debajoMedia[i] = nombres[i];

				System.out.print(debajoMedia[i] + " ");

			}

		}

	}

	public static void tres(double[] precio, String[] nombres, String[] ingredientes) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el nombre del producto para visualizar sus precio e ingredientes");
		String nombre = scan.next();

		for (int i = 0; i < nombres.length; i++) {

			if (nombre.equals(nombres[i])) {

				System.out.println(nombres[i] + " " + precio[i] + "€" + " " + ingredientes[i]);

			}
		}

	}

	public static void cuatro(String[] ingredientes) {
		
		
		

		for (int i = 0; i < ingredientes.length; i++) {

			if (!ingredientes[i].contains("cheddar")) {

				ingredientes[i] = ingredientes[i]+", Sin Lactosa";

				System.out.println(ingredientes[i]);

			}
		}

	}

	public static void cinco(int[] stock, String[] nombres) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el nombre del producto");
		String nombre = scan.next();
		int i ;
		int aux=0;
		for ( i = 0; i < nombres.length; i++) {

			if(nombres[i].equals(nombre)) {
				
				aux = i;
				
			}


	}
		if(stock[aux]>0) {
			
			stock[aux] = stock[aux] - 1;
			System.out.println("Se le ha reducido a "+ nombres[aux]+ " el stock a: "+ stock[aux]);
			
		}
		else {
			
			System.out.println("No hay stock suficiente");
		}

}}
