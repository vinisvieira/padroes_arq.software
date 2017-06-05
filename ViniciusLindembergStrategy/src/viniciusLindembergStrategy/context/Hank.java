package viniciusLindembergStrategy.context;

import viniciusLindembergStrategy.concreteStrategy.FlechaEletrica;
import viniciusLindembergStrategy.concreteStrategy.TiroPerfurante;

public class Hank extends Arqueiro {

	public Hank() {
		super("Hank", new TiroPerfurante(), new FlechaEletrica());

	}
}