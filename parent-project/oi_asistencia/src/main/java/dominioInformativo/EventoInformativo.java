package dominioInformativo;

/**
 * Clase de dominio que mantiene la información relativa a los eventos informativos
 */
public class EventoInformativo {
	private String id;
	/**
	 * fecha de inicio del evento
	 */
	private Date inicio;
	/**
	 * fecha de fin de evento
	 */
	private Date fin;
	/**
	 * tipo de evento informativo
	 */
	private TipoEventoInformativo tipo;

	public EventoInformativo(String id, Date inicio, Date fin, TipoEventoInformativo tipo) {
		throw new UnsupportedOperationException();
	}
}