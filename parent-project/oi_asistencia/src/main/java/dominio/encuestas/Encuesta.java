package dominio.encuestas;

/**
 * Clase de dominio encargada de mantener información sobre las encuestas
 */
public class Encuesta {
	private String id;
	private int valoracionMedia;
	private TIPOENCUESTA tipo;

	public Encuesta(String id) {
		throw new UnsupportedOperationException();
	}

	public void valorar(int valoracion) {
		throw new UnsupportedOperationException();
	}
}