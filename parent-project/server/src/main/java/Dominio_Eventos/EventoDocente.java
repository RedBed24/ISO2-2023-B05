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
	private Presencialidad _tipo;
	
	public EventoDocente(Date ainicio, Date afin, Presencialidad atipo) {
		super();
		this.setInicio(ainicio);
		this.setFin(afin);
		this.setTipo(atipo);
	}

	public void setInicio(Date ainicio) {
		if (ainicio.before(new Date())) {
			throw new RuntimeException("La fecha introducida debe ser posterior al dia actual");
		}
		this._inicio = ainicio;
	}

	public Date getInicio() {
		return this._inicio;
	}

	public void setFin(Date afin) {
		if (afin.before(this._inicio)) {
			throw new RuntimeException("El fin del evento debe ser despues del inicio");
		}
		this._fin = afin;
	}

	public Date getFin() {
		return this._fin;
	}

	public Presencialidad getTipo() {
		return _tipo;
	}

	public void setTipo(Presencialidad atipo) {
		this._tipo = atipo;
	}

}