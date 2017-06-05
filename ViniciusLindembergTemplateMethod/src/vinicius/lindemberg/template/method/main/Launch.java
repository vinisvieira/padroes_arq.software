package vinicius.lindemberg.template.method.main;

import vinicius.lindemberg.template.method.concrete.FabricaCocaCola;
import vinicius.lindemberg.template.method.concrete.FabricaPepis;

public class Launch {

	/*
	 * Meu tema é uma fabrica de refrigerante nao qual independente da fabrica existe coisas que toda fabrica faz 
	 * e temos a fabrica da coca cola e a fabrica da pepis fabricando refrigerante com o mesmo padrao de formas diferente 
	 * e com custo diferente.
	 * 
	 * 
	 * Porque seu tema precisa seguir esta ordem?
	 * porque é a ordem de fabricação de um refrigerante, se for alterado o processo fica errado.
	*/

	public static void main(String[] args) {

		FabricaCocaCola cocaCola = new FabricaCocaCola();
		FabricaPepis pepis = new FabricaPepis();

		System.out.println(
				"Custo de 100 Coca-Colas, com risco de perde algumas por contaminação: R$" + cocaCola.producao(100));

		System.out.println("");

		System.out.println("Custo Unitario");
		System.out.println("Custo para produção de Coca-Cola: R$" + cocaCola.producao(1));

		System.out.println("");

		System.out.println("Custo Unitario");
		System.out.println("Custo para produção de Pepis: R$" + pepis.producao(1));

		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("Custo para produção de 100 Coca-Cola: R$" + cocaCola.producao(100));
		System.out.println("Custo Unitario: R$" + cocaCola.producao(1));

		System.out.println("");

		System.out.println("Custo para produção de 100 Pepis: R$" + pepis.producao(100));
		System.out.println("Custo Unitario: R$" + pepis.producao(1));

	}

}
