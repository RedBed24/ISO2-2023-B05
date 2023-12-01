package Dominio;

import java.util.Date;

public class Evento {
	private Date _inicio;
	private Date _fin;
	private Presencialidad _tipo;

	public Evento(Date aInicio, Date aFin, Presencialidad aPresencialidad) {
		throw new UnsupportedOperationException();
	}

	public void setInicio(Date aInicio) {
		this._inicio = aInicio;
	}

	public Date getInicio() {
		return this._inicio;
	}

	public void setFin(Date aFin) {
		this._fin = aFin;
	}

	public Date getFin() {
		return this._fin;
	}

	public void setTipo(Presencialidad aTipo) {
		this._tipo = aTipo;
	}

	public Presencialidad getTipo() {
		return this._tipo;
	}
}