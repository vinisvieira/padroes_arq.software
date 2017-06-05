package viniciusLindembergFactory.fabricaComponente;

import viniciusLindembergFactory.componentes.ComponenteEmbalagem;
import viniciusLindembergFactory.componentes.ComponenteInterno;

public abstract class ComponenteFactory {
	
	public abstract ComponenteInterno createInterno();
	
	public abstract ComponenteEmbalagem createEmbalagem();
	
}
