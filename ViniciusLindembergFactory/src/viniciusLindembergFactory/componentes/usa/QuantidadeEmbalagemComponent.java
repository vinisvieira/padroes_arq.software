package viniciusLindembergFactory.componentes.usa;

import viniciusLindembergFactory.componentes.ComponenteInterno;

public class QuantidadeEmbalagemComponent extends ComponenteInterno {

	public QuantidadeEmbalagemComponent() {

		setComponentName("300ml");
		System.out.println("-" + super.getComponentName());

	}
}