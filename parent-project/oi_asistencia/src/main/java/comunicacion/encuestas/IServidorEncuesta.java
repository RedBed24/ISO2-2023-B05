package comunicacion.encuestas;

/**
 * Clase encargada de mantener la comunciación con el servidor
 */
public class IServidorEncuesta {

	public void iniciarConexionServidor(String host, int port) {
		throw new UnsupportedOperationException();
	}

	public void enviarDatos(socket socketObj, String token) {
		throw new UnsupportedOperationException();
	}

	public String recibirDatos(socket socketObj) {
		throw new UnsupportedOperationException();
	}

	public void cerrarConexion(socker socketObj) {
		throw new UnsupportedOperationException();
	}
}