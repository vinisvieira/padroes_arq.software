package viniciusLindembergCommand.model;

public class Drew extends Filhos {

	@Override
	public void dizerSim() {
		System.out.println("Drew: ha mãe manda o chris.");

	}

	@Override
	public void esquecer() {
		System.out.println("Drew: vou jogar basquete.");

	}

	@Override
	public void lembrar() {
		System.out.println("Drew: eita, era pra eu ter lavado a louça, esqueci ");

	}

	@Override
	public void desistir() {
		System.out.println("Drew: vou ficar jogando basquete mesmo, quem vai levar a culpa é o chris mesmo.");

	}
}