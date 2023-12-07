package presentacionInformativo;

/**
 * Clase de interfaz de usuario que se encarga de recibir las peticiones del usuario pedir operaciones al control de eventos
 */
public class IOrganizadorInformativo {

	/**
	 * asegurar que los datos de entrada para la creación del evento sean válidos y mandar a gestor de eventos la tarea de crear el evento
	 */
	public boolean crearEventoInformativo(String inicio, String fin, String tipo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * asegurar que los datos de entrada para la edición del evento sean válidos y mandar a gestor de eventos la tarea de editar el evento
	 */
	public boolean editarEventoInformativo(String id, String inicio, String fin, String tipo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * asegurar que el evento asociado al identificador indicado como parámetro es adecuado y delegar la tarea de borrar el evento al gestor
	 */
	public boolean borrarrEventoInformativo(String id) {
		throw new UnsupportedOperationException();
	}
}