package viniciusLindembergCommand.model;

public class Tonya extends Filhos {

	@Override
	public void dizerSim() {
		System.out.println("Tonya: não quero lavar, manda o Chris");
	}

	@Override
	public void esquecer() {
		System.out.println("Tonya: vou brincar com minhas bonecas");
	}

	@Override
	public void lembrar() {
		System.out.println("Tonya: era pra eu lavar a louça...");

	}

	@Override
	public void desistir() {
		System.out.println("Tonya: mais não vou so pra o Chris se ferrar :)");

	}
}