package presentacion.encuestas;

import dominio.encuestas.Encuesta;

/**
 * Clase de interfaz con el usuario, se encarga de validar los datos introducidos por el usuario y pedir a dominio la ejecución de las acciones de usuario
 */
public class IOrganizadorInformativoEncuesta {

	public boolean crearEncuesta(String id) {
		throw new UnsupportedOperationException();
	}

	public boolean borrarEncuesta(String id) {
		throw new UnsupportedOperationException();
	}

	public Encuesta[] listarEncuestasInformativas(String filtroRegEx) {
		throw new UnsupportedOperationException();
	}
}