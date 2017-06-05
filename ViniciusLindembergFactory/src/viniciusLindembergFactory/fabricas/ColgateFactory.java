package viniciusLindembergFactory.fabricas;

import viniciusLindembergFactory.main.Tipo;

import viniciusLindembergFactory.produto.CremeDental;

public abstract class ColgateFactory {

	public CremeDental order(Tipo tipo) {
		CremeDental c;

		c = factoryMethod(tipo);

		c.createCremeDental();
		c.calculoValor(c.preco);

		return c;

	}

	public abstract CremeDental factoryMethod(Tipo tipo);

}