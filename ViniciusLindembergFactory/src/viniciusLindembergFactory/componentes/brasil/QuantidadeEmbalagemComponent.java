package viniciusLindembergFactory.componentes.brasil;

import viniciusLindembergFactory.componentes.ComponenteInterno;

public class QuantidadeEmbalagemComponent extends ComponenteInterno {

	public QuantidadeEmbalagemComponent() {

		setComponentName("250ml");
		System.out.println("-" + super.getComponentName());
		
	}
}