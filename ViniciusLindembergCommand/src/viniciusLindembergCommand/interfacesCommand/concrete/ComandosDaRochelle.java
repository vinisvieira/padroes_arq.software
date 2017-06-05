package viniciusLindembergCommand.interfacesCommand.concrete;

import viniciusLindembergCommand.interfacesCommand.Comandos;
import viniciusLindembergCommand.model.Chris;
import viniciusLindembergCommand.model.Drew;
import viniciusLindembergCommand.model.Filhos;
import viniciusLindembergCommand.model.Rochelle;
import viniciusLindembergCommand.model.Tonya;

public class ComandosDaRochelle implements Comandos {

	private Rochelle rochelle;

	public ComandosDaRochelle(Rochelle rochelle) {

		this.rochelle = rochelle;

	}

	@Override
	public void novaTarefaDeRochelle() {
		this.rochelle.lavarLouca();

	}

	@Override
	public void esquecer(Filhos filho) {

		if (filho instanceof Chris) {
			this.rochelle.lembrarChris();
		} else if (filho instanceof Drew) {
			this.rochelle.lembrarDrew();
		} else if (filho instanceof Tonya) {
			this.rochelle.lembrarTonya();
		}

	}

	@Override
	public void esquecer() {

	}

}
