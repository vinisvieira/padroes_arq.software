package servidor;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import interfacee.DadosFabricacao;

public class CasaDoCasal {

	public static void main(String[] args) {

		try {
			Donna donna = new Donna();
			Registry r = LocateRegistry.createRegistry(DadosFabricacao.CONTROLE_ID);
			r.bind(DadosFabricacao.MARCA_CONTROLE, donna);
			System.out.println("Donna Chegou em casa");

		} catch (RemoteException | AlreadyBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
