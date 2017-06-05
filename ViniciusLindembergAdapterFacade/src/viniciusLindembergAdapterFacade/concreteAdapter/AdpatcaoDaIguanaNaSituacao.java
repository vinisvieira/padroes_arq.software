package viniciusLindembergAdapterFacade.concreteAdapter;

import viniciusLindembergAdapterFacade.interfaces.PigmentacaoIguanaNormal;
import viniciusLindembergAdapterFacade.model.IguanaEmPerigo;

public class AdpatcaoDaIguanaNaSituacao implements PigmentacaoIguanaNormal {

	IguanaEmPerigo iguanaEmPerigo;

	public AdpatcaoDaIguanaNaSituacao(IguanaEmPerigo iguanaEmPerigo) {

		this.iguanaEmPerigo = iguanaEmPerigo;

	}

	@Override
	public void pigmentacaoPadrao() {

		this.iguanaEmPerigo.pigmentacaoDePerigo();

	}

	@Override
	public void tranquiloNaFloresta() {

		this.iguanaEmPerigo.correr();

	}

	@Override
	public void voltaAoNormal() {

	}

}