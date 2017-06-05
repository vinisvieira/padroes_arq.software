package viniciusLindembergStrategy.context;

import viniciusLindembergStrategy.concreteStrategy.FlechaEletrica;
import viniciusLindembergStrategy.concreteStrategy.TiroPerfurante;

public class KatnissEverdeen extends Arqueiro{

	public KatnissEverdeen() {
		super("Katniss Everdeen", new TiroPerfurante(), new FlechaEletrica());
	}
}