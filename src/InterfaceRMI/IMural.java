package InterfaceRMI;

import java.rmi.*;
import java.util.List;

public interface IMural extends Remote{
	
	void registrarRecado(Recado recado) throws RemoteException;
	void removerRecado(Recado recado) throws RemoteException;
	Recado consultarRecado(int codigo) throws RemoteException;
	List<Recado> consultarRecado() throws RemoteException;
	
}
