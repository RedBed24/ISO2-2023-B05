package user.cli;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class InputTest {

	/* 
	 * Este test comprueba el método getString de la clase Input.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getString coincida con la salida esperada.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getString() {
		String entrada = "Hola\n";
		String salida_esperada = "Hola";

		try { 
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			assertEquals(salida_esperada, input.getString());

			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	/* 
	 * Este test comprueba el método getString de la clase Input cuando se espera que falle.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getString coincida con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getString_falla() {
		String entrada = "\nHola\n";
		String salida_esperada = "Hola";

		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			assertEquals(salida_esperada, input.getString());

			Scanner salida_errores = new Scanner(f);

			assertEquals("Error: La cadena debe tener al menos un caracter.", salida_errores.nextLine());

			salida_errores.close();

			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test comprueba el método getInt de la clase Input.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getInt coincida con la salida esperada.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getInt() {
		String entrada = "1\n";
		int salida_esperada = 1;
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getInt());
		
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test comprueba el método getInt de la clase Input cuando se espera que falle.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getInt coincida con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getInt_falla() {
		String entrada = "Hola\n1\n";
		int salida_esperada = 1;

		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			assertEquals(salida_esperada, input.getInt());

			Scanner salida_errores = new Scanner(f);

			assertEquals("Error: La cadena no es un valor válido.", salida_errores.nextLine());

			salida_errores.close();

			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test comprueba el método getDouble de la clase Input.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getDouble coincida con la salida esperada.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getDouble() {
		String entrada = "1.0\n";
		double salida_esperada = 1.0;
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getDouble());
		
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test comprueba el método getDouble de la clase Input cuando se espera que falle.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getDouble coincida con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getDouble_falla() {
		String entrada = "Hola\n1.0\n";
		double salida_esperada = 1.0;

		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			assertEquals(salida_esperada, input.getDouble());

			Scanner salida_errores = new Scanner(f);

			assertEquals("Error: La cadena no es un valor válido.", salida_errores.nextLine());

			salida_errores.close();

			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test comprueba el método getPositiveDouble de la clase Input.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getPositiveDouble coincida con la salida esperada.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getPositiveDouble() {
		String entrada = "1.0\n";
		double salida_esperada = 1.0;
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getPositiveDouble());
		
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test comprueba el método getPositiveDouble de la clase Input cuando se espera que falle.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getPositiveDouble coincida con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getPositiveDouble_falla() {
		String entrada = "-1.0\n1.0\n";
		double salida_esperada = 1.0;

		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			assertEquals(salida_esperada, input.getPositiveDouble());
			
			Scanner salida_errores = new Scanner(f);

			assertEquals("Inserte un valor positivo:", salida_errores.nextLine());

			salida_errores.close();

			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test comprueba el método getPhoneNumber de la clase Input.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getPhoneNumber coincida con la salida esperada.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getPhoneNumber() {
		String entrada = "644206378\n";
		int salida_esperada = 644206378;
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getPhoneNumber());
		
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	/* 
	 * Este test comprueba el método getPhoneNumber de la clase Input cuando se espera que falle debido a un valor nulo.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getPhoneNumber coincida con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getPhoneNumber_fallaValorNulo() {
		String entrada = "-1\n644206378\n";
		int salida_esperada = 644206378;
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getPhoneNumber());
			
			Scanner salida_errores = new Scanner(f);

			assertEquals("Inserte un formato válido para el número de teléfono:", salida_errores.nextLine());

			salida_errores.close();
		
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	/* 
	 * Este test comprueba el método getPhoneNumber de la clase Input cuando se espera que falle debido a un tamaño incorrecto.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se verifica que el resultado obtenido del método getPhoneNumber coincida con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	
	public void test_getPhoneNumber_fallaTamañoIncorrecto() {
		String entrada = "644\n644206378\n";
		int salida_esperada = 644206378;
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getPhoneNumber());
			
			Scanner salida_errores = new Scanner(f);

			assertEquals("Inserte un formato válido para el número de teléfono:", salida_errores.nextLine());

			salida_errores.close();
		
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	/* 
	 * Este test verifica el método getDate de la clase Input.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se compara el resultado obtenido del método getDate con la salida esperada.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getDate() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String entrada = "01/07/2003\n";
		LocalDate salida_esperada = LocalDate.parse("01/07/2003", formatoFecha);
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getDate());
			
	
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	/* 
	 * Este test verifica el método getDate de la clase Input cuando se espera que falle.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se compara el resultado obtenido del método getDate con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getDate_fallo() {
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String entrada = "011/007/203\n01/07/2003\n";
		LocalDate salida_esperada = LocalDate.parse("01/07/2003", formatoFecha);
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			assertEquals(salida_esperada, input.getDate());
			
			Scanner salida_errores = new Scanner(f);

			assertEquals("Error al convertir la fecha. Asegúrate de ingresar el formato correcto (dd/MM/yyyy).", salida_errores.nextLine());

			salida_errores.close();
		
			f.delete();
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
	/* 
	 * Este test verifica el método getMail de la clase Input.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se compara el resultado obtenido del método getMail con la salida esperada.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getMail() {
		String entrada = "noelia.diaz14@alu.uclm.es\n";
		String salida_esperada = "noelia.diaz14@alu.uclm.es";
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			
			assertEquals(salida_esperada, input.getMail());
			
	
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}

	/* 
	 * Este test verifica el método getMail de la clase Input cuando se espera que falle.
	 * Se crea un archivo temporal, se instancia un objeto Input con una cadena de entrada y un PrintStream,
	 * y se compara el resultado obtenido del método getMail con la salida esperada.
	 * Luego se verifica que el archivo de errores contiene el mensaje de error esperado.
	 * Finalmente, se elimina el archivo temporal.
	 */
	public void test_getMail_fallo() {
		String entrada = "noelia.diaz14alu.uclm.es\nnoelia.diaz14@alu.uclm.es\n";
		String salida_esperada = "noelia.diaz14@alu.uclm.es";
		
		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));
			
			assertEquals(salida_esperada, input.getMail());
			
			Scanner salida_errores = new Scanner(f);

			assertEquals("Inserte un formato válido para el correo:", salida_errores.nextLine());

			salida_errores.close();
	
			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}


}



