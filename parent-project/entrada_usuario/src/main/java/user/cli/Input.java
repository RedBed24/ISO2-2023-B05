package user.cli;


import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 * Clase Input
 *
 * El objetivo de esta clase es implementar distintos métodos
 * para desarrollar la comunicación y petición de datos
 * con el usuario de la aplicación.
 * IMPORTANTE: Cada método devuelve sí o sí un valor válido.
 */
public class Input {
	private static Scanner TECLADO = new Scanner(System.in);
	private static PrintStream PANTALLA = new PrintStream(System.out);
	
	/**
	 * Leer valor entero. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public static int getInt() {
		while (true) {
			try {
				return TECLADO.nextInt();
			} catch (NumberFormatException e) {
				PANTALLA.println("Error: La cadena no es un valor válido.");
			}
		}
	}
 
	/**
	 * Leer valor double. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public static double getDouble() {
		while (true) {
			try {
				return TECLADO.nextDouble();
			} catch (NumberFormatException e) {
				PANTALLA.println("Error: La cadena no es un valor válido.");
			}
		}
	}
	
	/**
	 * Leer valor double positivo mayor que 0. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public static double getPositiveDouble() {
		while (true) {
			try{
				double x = TECLADO.nextDouble();
				while (x <= 0) {
					PANTALLA.println("Inserte un valor positivo:");
					x = TECLADO.nextDouble();
				}
				return x;
			} catch (NumberFormatException e) {
				PANTALLA.println("Error: La cadena no es un valor válido.");
			}
		}
	}
	
	/**
	 * Leer valor string. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public static String getString(){
		return TECLADO.nextLine();
	} 
	
	/**
	 * Leer número de teléfono (9 dígitos). Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public static int getPhoneNumber() {
		while (true) {
			try {
				int phoneNumber = TECLADO.nextInt();
				/*Control de formato*/
				while(phoneNumber <= 0 && String.valueOf(phoneNumber).length() != 9){
					PANTALLA.println("Inserte un formato válido para el número de teléfono:");
					phoneNumber = TECLADO.nextInt();
				}
				return phoneNumber;
			} catch (NumberFormatException e) {
				PANTALLA.println("Error: La cadena no es un valor válido.");
			}
		}
	}
	
	/**
	 * Leer fecha día/mes/año. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public static LocalDate getDate() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		while (true) {
			try {
				String date = TECLADO.nextLine();
				return LocalDate.parse(date, formatoFecha);
			} catch (Exception e) {
				PANTALLA.println("Error al convertir la fecha. Asegúrate de ingresar el formato correcto.");
			}
		}
	}
	
}
