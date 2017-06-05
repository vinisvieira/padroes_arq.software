package ViniciusLindembergSingleton.Singleton;

public class Dust2 {

	private CsGo csGo = new CsGo();
	
	public void eoElGordochito(){
		/*ElGordochito.matar();
		ElGordochitoSafe.matar();
		ElGordochitoDuplamenteVerificado.matar();*/
		
		for (int i = 1; i < 1000; i++) {
			ElGordochito.matar();
			ElGordochitoSafe.matar();
			ElGordochitoDuplamenteVerificado.matar();
		}
		
		csGo.jogando(ElGordochito.matar());
		csGo.jogando(ElGordochitoSafe.matar());
		csGo.jogando(ElGordochitoDuplamenteVerificado.matar());
		
	}
}