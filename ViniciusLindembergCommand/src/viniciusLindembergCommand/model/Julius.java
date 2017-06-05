package viniciusLindembergCommand.model;

import viniciusLindembergCommand.interfacesCommand.Comandos;
import viniciusLindembergCommand.interfacesCommand.concrete.NenhumComando;

public class Julius {

	private Comandos[] comandosRochelleEFilhos;
	private Comandos[] desfazerComandos;
	private int contador = -1;

	public Julius() {
		this.comandosRochelleEFilhos = new Comandos[4];
		for (int i = 0; i < comandosRochelleEFilhos.length; i++) {
			comandosRochelleEFilhos[i] = new NenhumComando();
		}
		this.desfazerComandos = new Comandos[4];
	}

	public void setComandos(int posicao, Comandos comandos) {
		this.comandosRochelleEFilhos[posicao] = comandos;
	}

	public void novaTarefaDaRochelle(int posicao) {
		this.contador++;
		desfazerComandos[posicao] = comandosRochelleEFilhos[posicao];
		this.comandosRochelleEFilhos[posicao].novaTarefaDeRochelle();

	}

	public void esquece(Filhos filho) {
		for (int i = this.contador; i > -1; i--) {
			this.desfazerComandos[i].esquecer(filho);
		}
	}
}