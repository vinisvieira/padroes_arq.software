package viniciusLindembergStrategy.concreteStrategy;

import java.util.Random;

import viniciusLindembergStrategy.context.Arqueiro;
import viniciusLindembergStrategy.strategy.Flecha;

public class FlechaMagnetica implements Flecha {

	private Random valor = new Random();

	private int decicao = valor.nextInt(1);

	@Override
	public int Flechar() {
		if (decicao == 1) {
			return 100;

		}
		return 0;

	}

	@Override
	public int Flechar(Arqueiro arqueiro) {
		// TODO Auto-generated method stub
		return 0;
	}
}