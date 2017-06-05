package viniciusLindembergFactory.componentes.usa;

import viniciusLindembergFactory.componentes.ComponenteInterno;

public class ComFluorComponente extends ComponenteInterno {

	public ComFluorComponente() {

		setComponentName("Produto Com Fluor");
		System.out.println("-" + super.getComponentName());

	}
}