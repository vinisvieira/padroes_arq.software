package viniciusLindembergFactory.fabricas;

import viniciusLindembergFactory.fabricaComponente.ComponenteFactory;
import viniciusLindembergFactory.fabricaComponente.USAComponenteFactory;
import viniciusLindembergFactory.main.Tipo;
import viniciusLindembergFactory.produto.CremeDental;
import viniciusLindembergFactory.produto.usa.ColgateAdvancedFresh;
import viniciusLindembergFactory.produto.usa.ColgateLuminousWhite;

public class USAColgateFactory extends ColgateFactory {

	ComponenteFactory cf = new USAComponenteFactory();

	@Override
	public CremeDental factoryMethod(Tipo tipo) {

		CremeDental cd = null;

		if (tipo == Tipo.COLGATE_ADVANCED_FRESH) {
			cd = new ColgateAdvancedFresh(cf);
		} else if (tipo == Tipo.COLGATE_LUMINOUS_WHITE) {
			cd = new ColgateLuminousWhite(cf);
		}

		cd.fabrica = "Made In USA";

		return cd;
	}
}