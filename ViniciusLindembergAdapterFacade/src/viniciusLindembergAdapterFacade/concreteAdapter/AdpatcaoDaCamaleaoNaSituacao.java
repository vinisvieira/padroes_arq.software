package viniciusLindembergAdapterFacade.concreteAdapter;

import viniciusLindembergAdapterFacade.interfaces.PigmentacaoCamaleaoNormal;
import viniciusLindembergAdapterFacade.model.CamaleaoEmPerigo;

public class AdpatcaoDaCamaleaoNaSituacao implements PigmentacaoCamaleaoNormal {

	CamaleaoEmPerigo camaleaoEmPerigo;

	public AdpatcaoDaCamaleaoNaSituacao(CamaleaoEmPerigo camaleaoEmPerigo) {

		this.camaleaoEmPerigo = camaleaoEmPerigo;

	}

	@Override
	public void pigmentacaoPadrao() {

		this.camaleaoEmPerigo.pigmentacaoDePerigo();

	}

	@Override
	public void tranquiloNaFloresta() {

		this.camaleaoEmPerigo.correr();

	}

	@Override
	public void voltaAoNormal() {

	}

}
