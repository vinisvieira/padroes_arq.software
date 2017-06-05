package viniciusLindembergCommand.command;

import viniciusLindembergCommand.interfacesCommand.Comandos;
import viniciusLindembergCommand.interfacesCommand.concrete.ComandosDaRochelle;
import viniciusLindembergCommand.interfacesCommand.concrete.ComandosDosFilhos;
import viniciusLindembergCommand.model.Chris;
import viniciusLindembergCommand.model.Drew;
import viniciusLindembergCommand.model.Filhos;
import viniciusLindembergCommand.model.Julius;
import viniciusLindembergCommand.model.Rochelle;
import viniciusLindembergCommand.model.Tonya;

public class Iniciar {

	public static void start() {
		Rochelle rochelle = new Rochelle();
		Filhos chris = new Chris();
		Filhos drew = new Drew();
		Filhos tonya = new Tonya();
		Julius julius = new Julius();

		Comandos comandosDeRochelle = new ComandosDaRochelle(rochelle);
		Comandos comandosDoFilho = new ComandosDosFilhos(chris, drew, tonya);

		julius.setComandos(0, comandosDeRochelle);
		julius.setComandos(1, comandosDoFilho);

		julius.novaTarefaDaRochelle(0);
		System.out.println("");
		julius.novaTarefaDaRochelle(1);

		julius.esquece(chris);
		julius.esquece(drew);
		julius.esquece(tonya);
	}
}