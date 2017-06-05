package viniciusLindembergAdapterFacade.model;

import viniciusLindembergAdapterFacade.interfaces.PigmentacaoIguanaEmPerigo;

public class IguanaEmPerigo implements PigmentacaoIguanaEmPerigo {

	@Override
	public void pigmentacaoDePerigo() {
		System.out.println("Iguana: Já sei, vou me pigmetar nesse tronco marron dessa arvore. ");

	}

	@Override
	public void correr() {
		System.out.println("Iguana: Que perigo!! correeeee!!");

	}

}
