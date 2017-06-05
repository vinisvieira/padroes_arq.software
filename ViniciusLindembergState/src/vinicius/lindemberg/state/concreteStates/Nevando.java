package vinicius.lindemberg.state.concreteStates;

import vinicius.lindemberg.state.context.NewYork;
import vinicius.lindemberg.state.states.Clima;

public class Nevando implements Clima {

	private NewYork ny;

	public Nevando(NewYork ny) {

		this.ny = ny;

	}

	@Override
	public void transito() {
		System.out.println("as pistas estão cobertas de neve, so caminhão passando.");
		ny.setAcao(ny.getSolForte());
	}

	@Override
	public void turismo() {
		System.out.println("com a chegada da neve o turismo volto com tudo.");
		ny.setAcao(ny.getChuviscando());
	}

	@Override
	public void populacao() {
		System.out.println("a populacao fica mais em casa aproveitando o calor da sua lareira");
		ny.setAcao(ny.getChuvaForte());
	}

}