package vinicius.lindemberg.state.cliente;

import vinicius.lindemberg.state.context.NewYork;

public class DiaADia {

	private NewYork ny = new NewYork();

	public DiaADia() {

		System.out.println("Situação do Transito:");
		ny.transito();
		ny.transito();
		ny.transito();
		System.out.println("");

		System.out.println("Situação do Turismo:");
		ny.turismo();
		ny.turismo();
		System.out.println();

		System.out.println("Situação da População:");
		ny.populacao();
		System.out.println();

	}

}
