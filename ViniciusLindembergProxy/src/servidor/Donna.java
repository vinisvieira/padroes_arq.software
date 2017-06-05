package servidor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import interfacee.Controle;

public class Donna extends UnicastRemoteObject implements Controle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Donna() throws RemoteException {
		super();
	}

	@Override
	public int pausaTempo(int tempo) throws RemoteException {

		if (tempo <= 30) {
			return tempo * 1;
		} else {
			return tempo * 2;
		}

	}

	@Override
	public int voltaTempo(int tempo) throws RemoteException {

		if (tempo <= 10) {
			return tempo * 1;
		} else {
			return tempo * 2;
		}

	}

	@Override
	public int avancaTempo(int tempo) throws RemoteException {

		if (tempo <= 10) {
			return tempo * 1;
		} else {
			return tempo * 2;
		}

	}

}
