package vinicius.lindemberg.state.concreteStates;

import vinicius.lindemberg.state.context.NewYork;
import vinicius.lindemberg.state.states.Clima;

public class SolForte implements Clima {

	private NewYork ny;

	public SolForte(NewYork ny) {

		this.ny = ny;

	}

	@Override
	public void transito() {
		System.out.println("o transito esta livre e bem tranquilo");
		ny.setAcao(ny.getChuvaForte());
	}

	@Override
	public void turismo() {
		System.out.println("Turismo esta forte e a cidade esta bem movimentada");
		ny.setAcao(ny.getNevando());
	}

	@Override
	public void populacao() {
		System.out.println("a população aproveito o dia para sair, os parques e praças estão cheios");
		ny.setAcao(ny.getNublado());
	}

}