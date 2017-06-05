package viniciusLindembergAdapterFacade.adapter;

public class Launch {
	
	/*no meu tema eu escolhir o camaleao e a iguana,
	 * que se adapta mudando a pigmentação para sobreviver na floresta 
	 * 
	 * Adaptador: as Pigmentaçoes
	 * 
	 * sistema onde o adaptador está inserido: Ecossistema
	 * 
	 * subsistemas adaptados: Camaleão e Iguana
	 * 
	 * Fachada: Barulho
	 * 
	 * sistema que a fachada simplifica: o macaco avisando a Iguana e o Camaleao ao mesmo tempo.
	 * 
	 * para quem simplifica: para o macaco.
	 * */

	public static void main(String[] args) {

		Ecossistema ecossistema = new Ecossistema();

		ecossistema.florestaAmazonica();

	}

}
