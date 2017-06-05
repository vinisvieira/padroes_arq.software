package viniciusLindembergAdapterFacade.model;

import viniciusLindembergAdapterFacade.interfaces.PigmentacaoIguanaNormal;

public class IguanaNormal implements PigmentacaoIguanaNormal {

	@Override
	public void pigmentacaoPadrao() {
		System.out.println("Iguana: Na minha pigmentação padrão");

	}

	@Override
	public void tranquiloNaFloresta() {
		System.out.println("Iguana: Estou com fome.. vou atras de comida.");

	}

	@Override
	public void voltaAoNormal() {
		System.out.println("Iguana: Ufaa! Consegui escapar");

	}

}
