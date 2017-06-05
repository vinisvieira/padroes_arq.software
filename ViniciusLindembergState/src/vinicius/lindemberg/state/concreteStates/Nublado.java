package vinicius.lindemberg.state.concreteStates;

import vinicius.lindemberg.state.context.NewYork;
import vinicius.lindemberg.state.states.Clima;

public class Nublado implements Clima {

	private NewYork ny;

	public Nublado(NewYork ny) {

		this.ny = ny;

	}

	@Override
	public void transito() {
		System.out.println(
				"o transito esta normal, porem os motoristas estão correndo mais que o normal com medo da chuva que pode vir");
		ny.setAcao(ny.getChuviscando());
	}

	@Override
	public void turismo() {
		System.out.println("Turismo ok, so aparece quem nao tem medo de uma possivel chuva.");
		ny.setAcao(ny.getChuvaForte());
	}

	@Override
	public void populacao() {
		System.out.println("maioria fica em casa, os que saem não fica muito tempo fora.");
		ny.getSolForte();
	}

}