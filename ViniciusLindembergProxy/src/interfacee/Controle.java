package interfacee;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Controle extends Remote {

	// tempo em minutos
	public int pausaTempo(int tempo) throws RemoteException;

	// tempo em anos
	public int voltaTempo(int tempo) throws RemoteException;

	// tempo em anos
	public int avancaTempo(int tempo) throws RemoteException;

}
