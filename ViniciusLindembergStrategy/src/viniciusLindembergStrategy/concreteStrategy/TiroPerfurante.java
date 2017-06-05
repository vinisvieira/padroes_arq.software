package viniciusLindembergStrategy.concreteStrategy;

import java.util.Random;

import viniciusLindembergStrategy.strategy.Tiro;

public class TiroPerfurante implements Tiro {
	
	private Random valor = new Random();

	@Override
	public int atirar() {
		return valor.nextInt(101);
	}
}