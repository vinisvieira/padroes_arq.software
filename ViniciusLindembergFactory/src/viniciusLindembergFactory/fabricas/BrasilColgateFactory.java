package viniciusLindembergFactory.fabricas;

import viniciusLindembergFactory.fabricaComponente.BrasilComponenteFactory;
import viniciusLindembergFactory.fabricaComponente.ComponenteFactory;
import viniciusLindembergFactory.main.Tipo;
import viniciusLindembergFactory.produto.CremeDental;
import viniciusLindembergFactory.produto.brasil.Colgate24h;
import viniciusLindembergFactory.produto.brasil.ColgateSensitive;
import viniciusLindembergFactory.produto.brasil.ColgateTotal12;

public class BrasilColgateFactory extends ColgateFactory {

	ComponenteFactory cf = new BrasilComponenteFactory();

	@Override
	public CremeDental factoryMethod(Tipo tipo) {

		CremeDental cd = null;

		if (tipo == Tipo.COLGATE_24H) {
			cd = new Colgate24h(cf);
		} else if (tipo == Tipo.COLGATE_SENSITIVE) {
			cd = new ColgateSensitive(cf);
		} else if (tipo == Tipo.COLGATE_TOTAL_12) {
			cd = new ColgateTotal12(cf);
		}

		cd.fabrica = "Fabricado no Brasil";

		return cd;
	}
}