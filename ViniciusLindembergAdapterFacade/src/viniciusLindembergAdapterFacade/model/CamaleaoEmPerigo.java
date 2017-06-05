package viniciusLindembergAdapterFacade.model;

import viniciusLindembergAdapterFacade.interfaces.PigmentacaoCamaleaoEmPerigo;

public class CamaleaoEmPerigo implements PigmentacaoCamaleaoEmPerigo {

	@Override
	public void pigmentacaoDePerigo() {

		System.out.println("Camaleao: vou me pigmentar aqui nessa planta verde para escapar do perigo.");

	}

	@Override
	public void correr() {
		System.out.println("Camaleao: Estou em uma enrascada, vou correr daqui...");

	}

}
