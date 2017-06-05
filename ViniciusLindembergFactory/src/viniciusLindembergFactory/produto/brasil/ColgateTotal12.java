package viniciusLindembergFactory.produto.brasil;

import viniciusLindembergFactory.fabricaComponente.ComponenteFactory;
import viniciusLindembergFactory.produto.CremeDental;

public class ColgateTotal12 extends CremeDental {

	ComponenteFactory cf;

	public ColgateTotal12(ComponenteFactory cf) {

		this.name = "Colgate Total 12, dar 12h de proteção";
		this.preco = 5.00;
		this.cf = cf;
	}

	@Override
	public void createCremeDental() {
		System.out.println("Criando Colgate Total 12 no Brasil");

		super.componenteEmbalagem = cf.createEmbalagem();
		super.componenteInterno = cf.createInterno();

	}

	@Override
	public void venda() {

		System.out.println("70% do meu valor é de impostos");

	}
}