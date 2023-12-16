package entrada_usuario.src.main/java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


/**
 * Clase Interface
 *
 * El objetivo de esta clase es implementar distintos métodos
 * para desarrollar la comunicación y petición de datos
 * con el usuario de la aplicación.
 * IMPORTANTE: Cada método devuelve sí o sí un valor válido
 * o salta excepción.
 */
public class Interface {
    public static Scanner TECLADO = new Scanner(System.in);
    
/**
 * Leer valor entero
     * @return 
 */
    public static int getInt(){
	try{
	    return TECLADO.nextInt();
	}catch(NumberFormatException e){
	    System.out.println("Error: La cadena no es un valor válido.");
	}
	return getInt();
    }
 
    
    
/**
 * Leer valor double
     * @return 
 */
    public static double getDouble(){
	try{
	    return TECLADO.nextDouble();
	}catch(NumberFormatException e){
	    System.out.println("Error: La cadena no es un valor válido.");
	}
	return getDouble();
    }
    
    
    
/**
 * Leer valor double positivo mayor que 0
     * @return 
 */
    public static double getPositiveDouble(){
	try{
	    double x = TECLADO.nextDouble();
	    while(x <= 0){
		System.out.println("Inserte un valor positivo:");
		x = TECLADO.nextDouble();
	    }
	    return x;
	}catch(NumberFormatException e){
	    System.out.println("Error: La cadena no es un valor válido.");
	}
        return getPositiveDouble();
    }
    
    
    
/**
 * Leer valor string
     * @return 
 */
    public static String getString(){
	return TECLADO.nextLine();
    }

    
    
/**
 * Leer número de teléfono (9 dígitos)
     * @return 
 */
    public static int getPhoneNumber(){	
	 try {
	    int phoneNumber = TECLADO.nextInt();
	    /*Control de formato*/
	    while(phoneNumber <= 0 && String.valueOf(phoneNumber).length() != 9){
		System.out.println("Inserte un formato válido para el número de teléfono:");
		phoneNumber = TECLADO.nextInt();
	    }
	
	    return phoneNumber;
            
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena no es un valor válido.");
        }
	return getPhoneNumber();
    }
    
    
    
/**
* Leer fecha día/mes/año 
     * @return 
*/
    public static LocalDate getDate() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            String date = TECLADO.nextLine();
            return LocalDate.parse(date, formatoFecha);
        } catch (Exception e) {
            System.out.println("Error al convertir la fecha. Asegúrate de ingresar el formato correcto.");
        }
	return getDate();
    }
    
}
