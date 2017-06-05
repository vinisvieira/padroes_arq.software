package viniciusLindembergFactory.fabricaComponente;

import viniciusLindembergFactory.componentes.ComponenteEmbalagem;
import viniciusLindembergFactory.componentes.ComponenteInterno;
import viniciusLindembergFactory.componentes.brasil.QuantidadeEmbalagemComponent;
import viniciusLindembergFactory.componentes.usa.EmbalagemPlasticoComponent;

public class BrasilComponenteFactory extends ComponenteFactory {

	@Override
	public ComponenteInterno createInterno() {
		
		return new QuantidadeEmbalagemComponent();
	}

	@Override
	public ComponenteEmbalagem createEmbalagem() {
		
		return new EmbalagemPlasticoComponent();
		
	}
}