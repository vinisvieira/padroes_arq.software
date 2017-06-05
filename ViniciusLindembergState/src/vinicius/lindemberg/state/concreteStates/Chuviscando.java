package vinicius.lindemberg.state.concreteStates;

import vinicius.lindemberg.state.context.NewYork;
import vinicius.lindemberg.state.states.Clima;

public class Chuviscando implements Clima {

	private NewYork ny;

	public Chuviscando(NewYork ny) {

		this.ny = ny;
		
	}

	@Override
	public void transito() {
		System.out.println("o transito ficou um pouco engarrafado");
		ny.setAcao(ny.getNevando());
	}

	@Override
	public void turismo() {
		System.out.println("a cidade esta menos movimentada hoje, o movimento que tem esta em shoppings e lojas.");
		ny.setAcao(ny.getSolForte());
	}

	@Override
	public void populacao() {
		System.out.println("maioria ficou em casa, os que sairam foi pra shopping ou cinema");
		ny.setAcao(ny.getNublado());
	}

}