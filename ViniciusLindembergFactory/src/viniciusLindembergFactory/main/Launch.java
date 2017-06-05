package viniciusLindembergFactory.main;

public class Launch {
	
	/**
	 * Este projeto mostra a aplicação do padrão de projeto Factory no contexto onde
	 * a produção de um Creme Dental que é feita no Brasil com componentes internos e
	 * externos e o preço é diferente da produção do mesmo Creme Dental construído nos
	 * Estados Unidos. Eles são fabricados de formas diferentes para cada pais.
	 * 
	 * @author Vinícius Lindemberg.
	 * 
	 * Produto : Creme Dental
	 * 
	 * Quem é o comportamento (verbo) Method Factory do seu tema?
	 * é o Metodo --> order() na class abstract ColgateFactory
	 * 
	 * ConcreteFactory : BrasilColgateFactory e USAColgateFactory
	 *
	 */

	public static void main(String[] args) {

		MainFactory.iniciarFactory();

	}
}