package vinicius.lindemberg.state.concreteStates;

import vinicius.lindemberg.state.context.NewYork;
import vinicius.lindemberg.state.states.Clima;

public class ChuvaForte implements Clima {

	private NewYork ny;

	public ChuvaForte(NewYork ny) {

		this.ny = ny;

	}

	@Override
	public void transito() {
		System.out.println("o transito parado, congestionamento forte");
		ny.setAcao(ny.getChuviscando());
	}

	@Override
	public void turismo() {
		System.out.println("turismo fraco, pouco movimento na cidade");
		ny.setAcao(ny.getNevando());
	}

	@Override
	public void populacao() {
		System.out.println("população fica em casa, pouco movimento nas praças e parques");
		ny.setAcao(ny.getNublado());

	}

}