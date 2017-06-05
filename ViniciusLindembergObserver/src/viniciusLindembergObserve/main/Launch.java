package viniciusLindembergObserve.main;

import viniciusLindembergObserve.park.Park;

public class Launch {

	/*
	 * Meu Padrão Observer estar implementando a brincadeira Meu Mestre Mandou
	 * que funciona da seguinte maneira Tem um mestre, e voce tem que imitar
	 * ou fazer tudo que ele diser.
	 */
	/* Subject : Master | MyMasterOrder */
	/* Observe : Kids | John, Kevin, Oscar */
	/* Acao de Assinar : getInPlay() */
	/* Acao de Cancelar assinatura : getOutPlay() */

	public static void main(String[] args) {

		Park park = new Park();

		park.start();

	}
}