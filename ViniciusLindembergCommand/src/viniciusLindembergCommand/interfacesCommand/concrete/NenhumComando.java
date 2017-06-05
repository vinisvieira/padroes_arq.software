package viniciusLindembergCommand.interfacesCommand.concrete;

import viniciusLindembergCommand.interfacesCommand.Comandos;
import viniciusLindembergCommand.model.Filhos;

public class NenhumComando implements Comandos {

	@Override
	public void novaTarefaDeRochelle() { }

	@Override
	public void esquecer() { }

	@Override
	public void esquecer(Filhos filho) { }

}
