package ViniciusLindembergSingleton.Singleton;

public class ElGordochitoSafe implements JogadorCsGo {
	
	private static ElGordochitoSafe elGordochito;
	private int kills;
	
	private ElGordochitoSafe() {
		
	}
	
	public static synchronized ElGordochitoSafe matar(){
		if(elGordochito == null)
			elGordochito = new ElGordochitoSafe();
		elGordochito.kills++;
		return elGordochito;
	}

	@Override
	public String falandoDoJogo() {
		
		return "Já Matei mais de "+kills+" no CsGo";
	}

}
