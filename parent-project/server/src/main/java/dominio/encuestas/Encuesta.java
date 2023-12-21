package dominio.encuestas;

/**
 * Clase de dominio para mantener la información relativa a las encuestas
 */
public class Encuesta {
	private String id;
	private int valoracionMedia;
	private int valoraciones;
	private TIPOENCUESTA tipo;

	public Encuesta(String id) {
		throw new UnsupportedOperationException();
	}

	public void valorar(int valoracion) {
		throw new UnsupportedOperationException();
	}
}