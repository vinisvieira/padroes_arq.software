package ViniciusLindembergSingleton.Singleton;

public class ElGordochito implements JogadorCsGo {
	
	private static ElGordochito elGordochito;
	private int kills;
	
	private ElGordochito() {
		
	}
	
	public static ElGordochito matar(){
		if(elGordochito == null)
			elGordochito = new ElGordochito();
		elGordochito.kills++;
		return elGordochito;
	}

	@Override
	public String falandoDoJogo() {
		
		return "Já Matei mais de "+kills+" no CsGo";
	}
}