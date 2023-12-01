package Dominio_Eventos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

/**
 * Unit test for EventoDocente
 */
public class EventoDocenteTest
{

	@SuppressWarnings("deprecation")
	@Test
    public void testCrearEvento_FechaFinAntesDelInicio() throws InterruptedException {
		Date inicio = new Date(2023, 12, 30);
		Date fin = new Date(2023, 12, 31);
        
        // Intentar establecer una fecha de fin anterior a la fecha de inicio
        try {
        	EventoDocente evento = new EventoDocente(inicio, fin, Presencialidad.PRESENCIAL);
            evento.setFin(new Date(evento.getInicio().getTime() - 86400000)); // Restar un dia a la fecha de inicio
            fail("Debería haber lanzado una excepción");
        } catch (RuntimeException e) {
            assertEquals("El fin del evento debe ser despues del inicio", e.getMessage());
        }
    }

    @SuppressWarnings("deprecation")
	@Test
    public void testCrearEvento_FechaFinDespuesDelInicio() {
    	Date inicio = new Date(2023, 12, 30);
		Date fin = new Date(2023, 12, 31);
		
        EventoDocente evento = new EventoDocente(inicio, fin, Presencialidad.PRESENCIAL);

        // Establecer una fecha de fin posterior a la fecha de inicio
        evento.setFin(new Date(evento.getInicio().getTime() + 86400000)); // Sumar un dia a la fecha de inicio

        // No deberia lanzar excepciones
        assertEquals(evento.getInicio().getTime() + 86400000, evento.getFin().getTime());
    }
	
    
}
