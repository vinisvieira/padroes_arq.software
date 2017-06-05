package viniciusLindembergStrategy.concreteStrategy;

import java.util.Random;

import viniciusLindembergStrategy.strategy.Tiro;

public class TiroDuplo implements Tiro {
	
	private Random valor = new Random();

	@Override
	public int atirar() {
		
		return valor.nextInt(51) + 50 ;
	}
}