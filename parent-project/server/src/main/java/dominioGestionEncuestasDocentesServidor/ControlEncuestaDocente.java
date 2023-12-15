package dominioGestionEncuestasDocentesServidor;

/**
 * Clase de dominio que se encarga de la creación y gestión de eventos como pida el usuario, además de mandar órdenes a la comunicación con el servidor
 */
public class ControlEncuestaDocente {

	public boolean crearEncuestaDocente(String id) {
		throw new UnsupportedOperationException();
	}

	public int añadirValoracion(String idEncuesta, int valoracion) {
		throw new UnsupportedOperationException();
	}

	public int obtenerValoracionMediaEncuesta(String idEncuesta) {
		throw new UnsupportedOperationException();
	}

	public boolean borrarEncuestaDocente(String id) {
		throw new UnsupportedOperationException();
	}

	public EncuestaDocente[] listarEncuestasDocentes(String filtroRegEx) {
		throw new UnsupportedOperationException();
	}
}