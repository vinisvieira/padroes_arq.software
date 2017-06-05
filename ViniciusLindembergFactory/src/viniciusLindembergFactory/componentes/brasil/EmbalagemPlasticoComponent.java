package viniciusLindembergFactory.componentes.brasil;

import viniciusLindembergFactory.componentes.ComponenteEmbalagem;

public class EmbalagemPlasticoComponent extends ComponenteEmbalagem {

	public EmbalagemPlasticoComponent() {

		setComponentName("Embalagem De Plastico");
		System.out.println("-" + super.getComponentName());

	}
}