package viniciusLindembergFactory.main;

public class Launch {
	
	/**
	 * Este projeto mostra a aplica��o do padr�o de projeto Factory no contexto onde
	 * a produ��o de um Creme Dental que � feita no Brasil com componentes internos e
	 * externos e o pre�o � diferente da produ��o do mesmo Creme Dental constru�do nos
	 * Estados Unidos. Eles s�o fabricados de formas diferentes para cada pais.
	 * 
	 * @author Vin�cius Lindemberg.
	 * 
	 * Produto : Creme Dental
	 * 
	 * Quem � o comportamento (verbo) Method Factory do seu tema?
	 * � o Metodo --> order() na class abstract ColgateFactory
	 * 
	 * ConcreteFactory : BrasilColgateFactory e USAColgateFactory
	 *
	 */

	public static void main(String[] args) {

		MainFactory.iniciarFactory();

	}
}