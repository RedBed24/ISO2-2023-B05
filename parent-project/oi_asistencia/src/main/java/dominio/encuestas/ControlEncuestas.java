package dominio.encuestas;

/**
 * Clase de control para las encuestas, se encarga de llevar a cabo las peticiones de usuario y pedir comunicación con el servidor
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

	public Encuesta listarEncuestas(String filtroRegEx, String tipo) {
		throw new UnsupportedOperationException();
	}
}