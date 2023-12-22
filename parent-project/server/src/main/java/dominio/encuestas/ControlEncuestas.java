package dominio.encuestas;

/**
 * Clase de dominio que se encarga de la creación y gestión de eventos como pida el usuario, además de mandar órdenes a la comunicación con el servidor
 */
public class ControlEncuestas {

	public boolean crearEncuesta(String id) {
		throw new UnsupportedOperationException();
	}

	public int añadirValoracion(String idEncuesta, int valoracion) {
		throw new UnsupportedOperationException();
	}

	public int obtenerValoracionMediaEncuesta(String idEncuesta) {
		throw new UnsupportedOperationException();
	}

	public boolean borrarEncuesta(String id) {
		throw new UnsupportedOperationException();
	}

	public Encuesta[] listarEncuestas(String filtroRegEx, String tipo) {
		throw new UnsupportedOperationException();
	}
}