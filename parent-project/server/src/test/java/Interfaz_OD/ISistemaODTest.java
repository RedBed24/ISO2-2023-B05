package Interfaz_OD;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for ISistemaOD
 */
public class ISistemaODTest { // Clases de equivalencia: (-infinito, 0), [0, 65536), [65536, infinito)

	@Test
    public void testWaitNewConnection_PuertoValido() {
		UnsupportedOperationException thrown = assertThrows(  // Excepcion Unsupported
				UnsupportedOperationException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						ISistemaOD sistemaOD = new ISistemaOD();
						sistemaOD.WaitNewConnection(8000); // [0, 65536)
						}
				}
        );
		assertNull(thrown.getMessage());
		
    }
	
    @Test
    public void testWaitNewConnection_PuertoInvalido_LimiteInferior() {
    	
    	RuntimeException thrown = assertThrows(  // Excepcion Runtime
        		RuntimeException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						ISistemaOD sistemaOD = new ISistemaOD();
						sistemaOD.WaitNewConnection(-1); // (-infinito, 0)
						}
				}
        );

        assertTrue(thrown.getMessage().contains("El puerto no está en el rango válido"));
    }
    
    @Test
    public void testWaitNewConnection_PuertoInvalido_LimiteSuperior() {
    	
    	RuntimeException thrown = assertThrows( // Excepcion Runtime
        		RuntimeException.class, new Executable() {
					@Override
					public void execute() throws Throwable {
						ISistemaOD sistemaOD = new ISistemaOD();
						sistemaOD.WaitNewConnection(65536); // [65536, infinito)
						}
				}
        );

        assertTrue(thrown.getMessage().contains("El puerto no está en el rango válido"));
    }
}