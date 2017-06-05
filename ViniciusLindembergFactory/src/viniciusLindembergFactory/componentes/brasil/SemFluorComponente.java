package viniciusLindembergFactory.componentes.brasil;

import viniciusLindembergFactory.componentes.ComponenteInterno;

public class SemFluorComponente extends ComponenteInterno {

	public SemFluorComponente() {

		setComponentName("Produto Sem Fluor");
		System.out.println("-" + super.getComponentName());

	}
}