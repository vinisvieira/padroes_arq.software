package viniciusLindembergStrategy.concreteStrategy;

import java.util.Random;

import viniciusLindembergStrategy.context.Arqueiro;
import viniciusLindembergStrategy.context.Hank;
import viniciusLindembergStrategy.strategy.Flecha;

public class FlechaEletrica implements Flecha {

	private Random valor = new Random();
	
	@Override
	public int Flechar(Arqueiro arqueiro) {
		if(arqueiro instanceof Hank) {
			
			return valor.nextInt(51) + 50;
	}
		return valor.nextInt(101);
	}

	@Override
	public int Flechar() {
		// TODO Auto-generated method stub
		return 0;
	}
}