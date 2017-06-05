package viniciusLindembergDecorator.main;

import viniciusLindembergDecorator.classificacaoLutadores.ClassificacaoLutadores;

/* Quem é o Component no seu tema?
 * LutadorUFC
 * Quem é o Decorator no seu tema?
 * Habilidades
 * Qual é o comportamento decorado?
 * O lutador tem as habilidades de lutas para ser um lutador de ufc
 * e dependendo da habilidade ele fica mais habilidoso que os outros.  
 */

public class Launch {

	public static void main(String[] args) {

		ClassificacaoLutadores classificacaoLutadores = new ClassificacaoLutadores();
		
		classificacaoLutadores.lutadores();
		
	}
}