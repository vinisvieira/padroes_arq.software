package viniciusLindembergFactory.produto.brasil;

import viniciusLindembergFactory.fabricaComponente.ComponenteFactory;
import viniciusLindembergFactory.produto.CremeDental;

public class ColgateSensitive extends CremeDental {

	ComponenteFactory cf;

	public ColgateSensitive(ComponenteFactory cf) {

		this.name = "Colgate Sensitive, Melhora a sua sensibilidade dos dentes";
		this.preco = 7.50;
		this.cf = cf;

	}

	@Override
	public void createCremeDental() {
		System.out.println("Criando Colgate Sensitive");

		super.componenteEmbalagem = cf.createEmbalagem();
		super.componenteInterno = cf.createInterno();

	}

	@Override
	public void venda() {

		System.out.println("70% do valor é de impostos");

	}
}