package viniciusLindembergFactory.fabricaComponente;

import viniciusLindembergFactory.componentes.ComponenteEmbalagem;
import viniciusLindembergFactory.componentes.ComponenteInterno;
import viniciusLindembergFactory.componentes.usa.ComFluorComponente;
import viniciusLindembergFactory.componentes.usa.EmbalagemPlasticoComponent;

public class USAComponenteFactory extends ComponenteFactory {

	@Override
	public ComponenteInterno createInterno() {

		return new ComFluorComponente();
	}

	@Override
	public ComponenteEmbalagem createEmbalagem() {

		return new EmbalagemPlasticoComponent();
		
	}
}