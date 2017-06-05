package viniciusLindembergFactory.componentes.usa;

import viniciusLindembergFactory.componentes.ComponenteEmbalagem;

public class EmbalagemPlasticoComponent extends ComponenteEmbalagem {

	public EmbalagemPlasticoComponent() {

		setComponentName("Embalagem de Plastico");
		System.out.println("-" + super.getComponentName());

	}
}