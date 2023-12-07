package eventos;

/**
 * Clase de dominio especializada para eventos docentes tales como clases de teoría, asistencia a laboratorios, asistencias a tutorías personalizadas, asistencias a tutorías docentes, o asistencia a exámenes
 */
public class EventoDocente extends Evento {
	/**
	 * Indica el tipo de presencialidad que tiene este evento
	 */
	private Presencialidad presencialidad;

	public void setPresencialidad(Presencialidad presencialidad) {
		this.presencialidad = presencialidad;
	}

	public Presencialidad getPresencialidad() {
		return this.presencialidad;
	}
}
