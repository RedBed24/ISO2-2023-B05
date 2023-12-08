package dominioInformativo;

/**
 * Clase encargada de controlar los eventos de OI
 */
public class ControlEventoInformativo {

	/**
	 * se encarga de comprobar que el identificador de evento enviado como parámetro existe y, de ser así; de borrarlo
	 */
	public boolean borrarEventoInformativo(String id) {
		throw new UnsupportedOperationException();
	}

	/**
	 * se encarga de parsear los atributos del evento a crear y de crear un objeto de la clase EventoInformativo
	 */
	public boolean crearEventoInformativo(String inicio, String fin, String tipo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * se encarga de parsear los atributos del evento a editar y de cambiar los atributos del objeto indicado
	 */
	public boolean editarEventoInformativo(String inicio, String fin, String tipo) {
		throw new UnsupportedOperationException();
	}

	/**
	 * se encarga de devolver una lista de eventos existentes en aplicando un filtro de id enviado como identificador
	 */
	public EventoInformativo[] listarEventosInformativos(String regexFiltro) {
		throw new UnsupportedOperationException();
	}
}