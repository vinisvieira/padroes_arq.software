package viniciusLindembergFactory.main;

import viniciusLindembergFactory.fabricas.BrasilColgateFactory;
import viniciusLindembergFactory.fabricas.ColgateFactory;
import viniciusLindembergFactory.fabricas.USAColgateFactory;
import viniciusLindembergFactory.produto.CremeDental;

public class MainFactory {

	public static void iniciarFactory() {

		CremeDental cd;

		ColgateFactory cf;

		cf = new BrasilColgateFactory();

		cd = cf.order(Tipo.COLGATE_24H);

		System.out.println("Produto: " + cd.name + "," + cd.fabrica + ", Preço: " + cd.preco);

		System.out.println("--------------------------------------------");

		cf = new USAColgateFactory();

		cd = cf.order(Tipo.COLGATE_ADVANCED_FRESH);

		System.out.println("Produto: " + cd.name + "," + cd.fabrica + ", Preço: " + cd.preco);

		System.out.println("--------------------------------------------");

		cf = new BrasilColgateFactory();

		cd = cf.order(Tipo.COLGATE_TOTAL_12);

		System.out.println("Produto: " + cd.name + "," + cd.fabrica + ", Preço: " + cd.preco);

		System.out.println("--------------------------------------------");

		cf = new USAColgateFactory();

		cd = cf.order(Tipo.COLGATE_LUMINOUS_WHITE);

		System.out.println("Produto: " + cd.name + "," + cd.fabrica + ", Preço: " + cd.preco);

		System.out.println("--------------------------------------------");

		cf = new BrasilColgateFactory();

		cd = cf.order(Tipo.COLGATE_SENSITIVE);

		System.out.println("Produto: " + cd.name + "," + cd.fabrica + ", Preço: " + cd.preco);
	}

}
