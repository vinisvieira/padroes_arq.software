package cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfacee.Controle;
import interfacee.DadosFabricacao;

/*O que tem haver o seu tema com o conceito do padrão?
 * o que tem haver é que no filme click o personagem Michael encontra o controle,
 * e começa a controlar a esposa(Donna) com ele. 
 * 
 * Qual o motivo de ter um proxy no seu tema?
 * para poder ter controle sobre a esposa(Donna)
 * 
 * Quem é o proxy no seu tema?
 * Controle
 * 
 * */
public class Michael {

	public static void main(String[] args) {

		try {
			Registry r = LocateRegistry.getRegistry(DadosFabricacao.CONTROLE_ID);
			Controle controle = (Controle) r.lookup(DadosFabricacao.MARCA_CONTROLE);
			System.out.println(controle.pausaTempo(10));
			System.out.println("+");
			System.out.println(controle.avancaTempo(5));
			System.out.println("+");
			System.out.println(controle.voltaTempo(6));
			int tempoPerdido = controle.pausaTempo(10) + controle.avancaTempo(20) + controle.voltaTempo(155);
			System.out.println("Tempo que Michael perdeu tentando mudar presente, passado e futuro: " + tempoPerdido);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
