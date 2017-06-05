package vinicius.lindemberg.state.context;

import vinicius.lindemberg.state.concreteStates.ChuvaForte;
import vinicius.lindemberg.state.concreteStates.Chuviscando;
import vinicius.lindemberg.state.concreteStates.Nevando;
import vinicius.lindemberg.state.concreteStates.Nublado;
import vinicius.lindemberg.state.concreteStates.SolForte;
import vinicius.lindemberg.state.states.Clima;

public class NewYork {

	private Clima solForte = new SolForte(this);
	private Clima nublado = new Nublado(this);
	private Clima chuviscando = new Chuviscando(this);
	private Clima chuvaForte = new ChuvaForte(this);
	private Clima nevando = new Nevando(this);

	private Clima acao = solForte;

	public Clima getSolForte() {
		return solForte;
	}

	public Clima getNublado() {
		return nublado;
	}

	public Clima getChuviscando() {
		return chuviscando;
	}

	public Clima getChuvaForte() {
		return chuvaForte;
	}

	public Clima getNevando() {
		return nevando;
	}

	public void setAcao(Clima acao) {
		this.acao = acao;
	}

	public void transito() {
		acao.transito();
	}

	public void turismo() {
		acao.turismo();
	}

	public void populacao() {
		acao.populacao();
	}

}
