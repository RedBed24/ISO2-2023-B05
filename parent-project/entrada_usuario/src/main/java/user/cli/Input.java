package user.cli;


import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 * Clase Input
 *
 * El objetivo de esta clase es implementar distintos métodos
 * para desarrollar la comunicación y petición de datos
 * con el usuario de la aplicación.
 * IMPORTANTE: Cada método devuelve sí o sí un valor válido.
 *
 * Sirve como entrada interactiva con el usuario
 */
public class Input {
	private Scanner teclado;
	private PrintStream pantalla;

	/**
	 * Crea una instancia a la que se le podrán pedir los valores
	 * @param entrada Proveedor de datos
	 * @param salida_errores Dónde se mostrarán los errores
	 */
	public Input(Scanner entrada, PrintStream salida_errores) {
		teclado = entrada;
		pantalla = salida_errores;
	}

	/**
	 * Leer valor string. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public String getString(){
		String cadena;
		do {
			cadena = getString();
			if (cadena.length() < 1) {
				pantalla.println("Error: La cadena debe tener al menos un caracter.");
			}
		} while (cadena.length() < 1);
		return cadena;
	}

	/**
	 * Leer valor entero. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public int getInt() {
		while (true) {
			try {
				return Integer.parseInt(getString());
			} catch (NumberFormatException e) {
				pantalla.println("Error: La cadena no es un valor válido.");
			}
		}
	}
 
	/**
	 * Leer valor double. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public double getDouble() {
		while (true) {
			try {
				return Double.parseDouble(getString());
			} catch (NumberFormatException e) {
				pantalla.println("Error: La cadena no es un valor válido.");
			}
		}
	}

	/**
	 * Leer valor double positivo mayor que 0. Si se introduce mal el valor por consola, se vuelve a pedir hasta
	 * que se devuelve un valor válido.
	 * @return
	 */
	public double getPositiveDouble() {
		double x = getDouble();
		while (x <= 0) {
			pantalla.println("Inserte un valor positivo:");
			x = getDouble();
		}
		return x;
	}

	/**
	 * Leer número de teléfono (9 dígitos). Si se introduce mal el valor por consola, se vuelve a pedir hasta
	 * que se devuelve un valor válido.
	 * @return
	 */
	public int getPhoneNumber() {
		int phoneNumber = getInt();
		/*Control de formato*/
		while(phoneNumber <= 0 && String.valueOf(phoneNumber).length() != 9){
			pantalla.println("Inserte un formato válido para el número de teléfono:");
			phoneNumber = getInt();
		}
		return phoneNumber;
	}

	/**
	 * Leer fecha día/mes/año. Si se introduce mal el valor por consola, se vuelve a pedir hasta 
	 * que se devuelve un valor válido.
	 * @return 
	 */
	public LocalDate getDate() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		while (true) {
			try {
				String date = getString();
				return LocalDate.parse(date, formatoFecha);
			} catch (IllegalArgumentException e) {
				pantalla.println("Error al convertir la fecha. Asegúrate de ingresar el formato correcto (dd/MM/yyyy).");
			}
		}
	}

	/**
	 * Leer un correo electrónico válido
	 * @return 
	 */
	public String getMail() {
		while (true) {
			try {
				String mail = getString();
				/*Control de formato*/
				while(mail.indexOf('@') == -1){
					pantalla.println("Inserte un formato válido para el correo:");
					mail = getString();
				}
				return mail;
			} catch (Exception e) {
				pantalla.println("Error: La cadena no es un valor válido.");
			}
		}
	}
}

