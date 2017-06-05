package viniciusLindembergCommand.interfacesCommand.concrete;

import viniciusLindembergCommand.interfacesCommand.Comandos;
import viniciusLindembergCommand.model.Filhos;

public class ComandosDosFilhos implements Comandos {

	private Filhos chris;
	private Filhos drew;
	private Filhos tonya;

	public ComandosDosFilhos(Filhos chris, Filhos drew, Filhos tonya) {

		this.chris = chris;
		this.drew = drew;
		this.tonya = tonya;

	}

	@Override
	public void novaTarefaDeRochelle() {

		this.chris.dizerSim();
		this.chris.esquecer();
		this.chris.lembrar();
		this.drew.dizerSim();
		this.drew.esquecer();
		this.drew.lembrar();
		this.tonya.dizerSim();
		this.tonya.esquecer();
		this.tonya.lembrar();
	}

	@Override
	public void esquecer() {

		this.chris.desistir();
		this.drew.desistir();
		this.tonya.desistir();
	}

	@Override
	public void esquecer(Filhos filho) {

	}
}