package viniciusLindembergAdapterFacade.model;

import viniciusLindembergAdapterFacade.interfaces.PigmentacaoCamaleaoNormal;

public class CamaleaoNormal implements PigmentacaoCamaleaoNormal {

	@Override
	public void pigmentacaoPadrao() {

		System.out.println("Camaleao: Na minha pigmentação natural");

	}

	@Override
	public void tranquiloNaFloresta() {
		System.out.println("Camaleao: Mais um dia lindo por aqui, vou dar uma volta...");

	}

	@Override
	public void voltaAoNormal() {
		System.out.println("Camaleao: Nossa... essa foi por pouco.");
	}

}
