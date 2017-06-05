package viniciusLindembergFactory.produto.usa;

import viniciusLindembergFactory.fabricaComponente.ComponenteFactory;
import viniciusLindembergFactory.produto.CremeDental;

public class ColgateAdvancedFresh extends CremeDental {

	ComponenteFactory cf;

	public ColgateAdvancedFresh(ComponenteFactory cf) {

		this.name = "Colgate Advanced Fresh, h�lito fresco";
		this.preco = 1.00;
		this.cf = cf;

	}

	@Override
	public void createCremeDental() {
		System.out.println("Criando Colgate Advanced Fresh no EUA");

		super.componenteEmbalagem = cf.createEmbalagem();
		super.componenteInterno = cf.createInterno();
	}

	@Override
	public void venda() {

		System.out.println("Em media 8% do valor do produto � de impostos");

	}
}