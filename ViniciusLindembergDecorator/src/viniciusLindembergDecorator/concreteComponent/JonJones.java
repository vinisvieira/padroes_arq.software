package viniciusLindembergDecorator.concreteComponent;

import java.util.Random;

import viniciusLindembergDecorator.component.LutadorUFC;

public class JonJones extends LutadorUFC {
	
	private Random habilidade = new Random();

	public JonJones() {
		
		super("Jon Jones", 82);
	}

	@Override
	public double habilidadeLuta() {

		return getOverall() * (habilidade.nextInt(3) + 1);
	}

	@Override
	public String configuracao() {

		return " || " + getNome()+ " || " + getOverall() + " || ";
	}
}