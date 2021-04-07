package JavaRMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import InterfaceRMI.IMural;
import InterfaceRMI.Recado;

public class MuralImpl extends UnicastRemoteObject implements IMural{

	protected MuralImpl() throws RemoteException {
		recados = new ArrayList<>();
		
	}
	
	private ArrayList<Recado> recados;

	private static final long serialVersionUID = 6809623903027129623L;

	@Override
	public void registrarRecado(Recado recado) throws RemoteException {
		Recado r = consultarRecado(recado.getCodigo());
		if(r == null) {
			recados.add(recado);
			
		}else {
			r.setCodigo(recado.getCodigo());
			r.setApelido(recado.getApelido());
		}
		
	}
	
	@Override
	public void removerRecado(Recado recado) throws RemoteException {		
		if(!(consultarRecado(recado.getCodigo()) == null)) {
			recados.remove(recado);
			
		}else {
			consultarRecado(recado.getCodigo()).setCodigo(recado.getCodigo());
			consultarRecado(recado.getCodigo()).setApelido(recado.getApelido());
		}
	}

	@Override
	public Recado consultarRecado(int codigo) throws RemoteException {
		for(Recado r : recados) {
			if(r.getCodigo() == codigo) {
				return r;
			}
		}

		return null;
	}

	@Override
	public List<Recado> consultarRecado() throws RemoteException {
		
		return recados;
	}

}
