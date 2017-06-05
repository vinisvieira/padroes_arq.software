package viniciusLindembergAdapterFacade.model;

import viniciusLindembergAdapterFacade.interfaces.MacacoBarulhento;

public class Macaco implements MacacoBarulhento {

	@Override
	public void gritar() {
		System.out.println("Macaco: Hu! Hu! Hu! Ha! Ha! Ha!! Hu! Hu! Hu! Ha! Ha! Ha!");

	}
}