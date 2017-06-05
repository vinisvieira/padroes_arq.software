package viniciusLindembergFactory.produto.brasil;

import viniciusLindembergFactory.fabricaComponente.ComponenteFactory;
import viniciusLindembergFactory.produto.CremeDental;

public class Colgate24h extends CremeDental {

	ComponenteFactory cf;

	public Colgate24h(ComponenteFactory cf) {
		this.name = "Colgate 24h, da 24h de Proteção";
		this.preco = 10.00;
		this.cf = cf;

	}

	@Override
	public void createCremeDental() {
		System.out.println("Criando Colgate 24h no Brasil");

		super.componenteEmbalagem = cf.createEmbalagem();
		super.componenteInterno = cf.createInterno();
	}

	@Override
	public void venda() {

		System.out.println("70% do meu valor é de impostos");

	}
}