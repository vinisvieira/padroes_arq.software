package viniciusLindembergStrategy.context;

import viniciusLindembergStrategy.concreteStrategy.FlechaEletrica;
import viniciusLindembergStrategy.concreteStrategy.TiroPerfurante;


public class GaviaoArqueiro extends Arqueiro {

	public GaviaoArqueiro() {

		super("Gaviao Arqueiro", new TiroPerfurante(), new FlechaEletrica());

	}
}