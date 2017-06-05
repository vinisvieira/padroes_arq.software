package viniciusLindembergFactory.produto.usa;

import viniciusLindembergFactory.fabricaComponente.ComponenteFactory;
import viniciusLindembergFactory.produto.CremeDental;

public class ColgateLuminousWhite extends CremeDental {

	ComponenteFactory cf;

	public ColgateLuminousWhite(ComponenteFactory cf) {

		this.name = "Colgate Luminous White, deixa seus dentes brancos";
		this.preco = 2.00;
		this.cf = cf;

	}

	@Override
	public void createCremeDental() {
		System.out.println("Criando Colgate Luminous White no EUA");

		super.componenteEmbalagem = cf.createEmbalagem();
		super.componenteInterno = cf.createInterno();

	}

	@Override
	public void venda() {

		System.out.println("Em media 8% do valor do produto é de impostos");

	}
}