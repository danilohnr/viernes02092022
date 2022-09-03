package estructurasdecontrol;

import java.util.Scanner;

public class EstructuraSwitch {

	public static void main(String[] args) {
		//Estructuras condicionales
		//Estructura condicional simple (if)
		//Estructura condicional doble (if else)
		//Estructura condicional anidada (múltiple  - if else if)
		//Para hoy - Estructura condicional múltiple (switch)
		Scanner lector = new Scanner(System.in);
		int op = 5;
		//System.out.print("Ingrese el color del semaforo: ");
		//char car = lector.next().charAt(0);
		System.out.print("Cuál es su nombre: ");
		String nombre = lector.nextLine();
		switch (nombre) {
		//El valor puede ser una variable byte, short, int, char, String
		case "Danilo":
			System.out.println("Hola Danilo");
			break;
		case "Ironman":
			System.out.println("Hola Sr. Stark");
			break;
		case "Wonderwoman":
			System.out.println("Hola Srta. Princess");
			break;
		default:
			System.out.println("Caracter incorrecto");
		}
		System.out.println("Fin del programa.");
	}

}
