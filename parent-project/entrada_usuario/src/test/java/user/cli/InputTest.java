package user.cli;

import java.util.Scanner;
import java.io.File;
import java.io.PrintStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InputTest {

	@Test
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

	/**
	 * Comprueba que el primer salto de linea muestra un error (escrito en el fichero tmp.txt)
	 * Comprueba que ese error es "Error: La cadena ..."
	 * Comprueba que el siguiente intento (realizado en la llamada de getString) sí es correcto y devuelve "Hola"
	 */
	@Test
	public void test_getString_falla1() {
		String entrada = "\nHola\n";
		String salida_esperada = "Hola";

		try {
			File f = new File("tmp.txt");
			f.createNewFile();

			Input input = new Input(new Scanner(entrada), new PrintStream(f));

			assertEquals(salida_esperada, input.getString());

			Scanner salida_errores = new Scanner(f);

			assertEquals("Error: La cadena debe tener al menos un caracter.", salida_errores.nextLine());

			f.delete();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
	}
	
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
	
	
}



