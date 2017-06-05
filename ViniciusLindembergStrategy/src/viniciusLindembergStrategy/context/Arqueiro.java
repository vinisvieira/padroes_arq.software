package viniciusLindembergStrategy.context;

import viniciusLindembergStrategy.strategy.Tiro;
import viniciusLindembergStrategy.strategy.Flecha;

public abstract class Arqueiro {

	String nome;
	Tiro tipoTiro;
	Flecha tipoFlecha;

	public Arqueiro(String nome, Tiro tipoTiro, Flecha tipoFlecha) {
		super();
		this.nome = nome;
		this.tipoTiro = tipoTiro;
		this.tipoFlecha = tipoFlecha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tiro getTipoTiro() {
		return tipoTiro;
	}

	public void setTipoTiro(Tiro tipoTiro) {
		this.tipoTiro = tipoTiro;
	}

	public Flecha getTipoFlecha() {
		return tipoFlecha;
	}

	public void setTipoFlecha(Flecha tipoFlecha) {
		this.tipoFlecha = tipoFlecha;
	}

	public int flecha() {
		return tipoFlecha.Flechar();
	}

	public int flecha(Arqueiro arqueiro) {
		return tipoFlecha.Flechar();
	}

	public int tiro() {
		return tipoTiro.atirar();
	}

	@Override
	public String toString() {
		return "Arqueiro [nome=" + nome + ", tipoTiro=" + tipoTiro + ", tipoFlecha=" + tipoFlecha + "]";
	}
}