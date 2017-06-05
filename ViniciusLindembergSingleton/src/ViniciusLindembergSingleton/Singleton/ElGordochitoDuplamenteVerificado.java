package ViniciusLindembergSingleton.Singleton;

public class ElGordochitoDuplamenteVerificado implements JogadorCsGo {

	private static ElGordochitoDuplamenteVerificado elGordochito;
	private int kills;

	private ElGordochitoDuplamenteVerificado() {

	}

	public static synchronized ElGordochitoDuplamenteVerificado matar() {
		if (elGordochito == null)
			elGordochito = new ElGordochitoDuplamenteVerificado();
		elGordochito.kills++;
		return elGordochito;
	}

	@Override
	public String falandoDoJogo() {

		return "Já Matei mais de " + kills + " no CsGo";
	}
}