package Dominio_Eventos;

import java.util.Date;

/**
 * Clase que representa un evento docente
 */
public class EventoDocente {
	/**
	 * Fecha y hora que representan el inicio del evento
	 */
	private Date _inicio;
	/**
	 * Fecha y Hora que representan el final del evento
	 */
	private Date _fin;

	public void setInicio(Date aInicio) {
		// TODO: Test
		if (aInicio.before(new Date())) {
			// TODO: Crear paquete execptions
			throw new RuntimeException("La fecha introducida debe ser posterior al dia actual");
		}
		this._inicio = aInicio;
	}

	public Date getInicio() {
		return this._inicio;
	}

	public void setFin(Date aFin) {
		// TODO: Test
		if (aFin.before(this._inicio)) {
			// TODO: Crear paquete execptions
			throw new RuntimeException("El fin del evento debe ser depues del inicio");
		}
		this._fin = aFin;
	}

	public Date getFin() {
		return this._fin;
	}

}