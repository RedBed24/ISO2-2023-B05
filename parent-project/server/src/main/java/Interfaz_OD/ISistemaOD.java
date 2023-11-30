package Interfaz_OD;

import java.net.Socket;

/**
 * Interfaz del servidor que trata mensajes del cliente OD
 */
public class ISistemaOD {

	/**
	 * Escucha conexiones TCP y crea un hilo para tratar esta petición
	 * @param aPort Puerto por el que se esperan las nuevas conexiones
	 */
	public void WaitNewConnection(int aPort) {
		// TODO: Test
		if (aPort < 0 || aPort < 65535) {
			throw new RuntimeException("El puerto no está en el rango válido");
		}
		throw new UnsupportedOperationException();
	}

	/**
	 * Trata nuevas conexiones, se asegura que se siga la secuencia correcta y los mensajes recibidos cumplan los formatos
	 * @param aConnection Socket abierto por el que ser reciben los mensajes
	 */
	private void TreatNewConnection(Socket aConnection) {
		throw new UnsupportedOperationException();
	}
}