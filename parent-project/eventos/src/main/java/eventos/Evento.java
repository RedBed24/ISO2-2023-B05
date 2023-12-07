package eventos;

import java.time.LocalDateTime;

/**
 * Clase de dominio que mantiene información sobre la fecha y hora de inicio y fin de un evento
 */
public abstract class Evento {
	/**
	 * Fecha y Hora local que representan el inicio de un evento
	 */
	private LocalDateTime inicio;
	/**
	 * Fecha y Hora que marcan el final de un Evento
	 */
	private LocalDateTime fin;

	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}

	public LocalDateTime getInicio() {
		return this.inicio;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public LocalDateTime getFin() {
		return this.fin;
	}
}
