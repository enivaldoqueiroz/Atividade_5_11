package RMIUsuario;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.List;

import InterfaceRMI.IMural;
import InterfaceRMI.Recado;

public class MuralUsuario {

	public static void main(String[] args) {
		
		try {
			IMural mural = (IMural) Naming.lookup("//localhost:2020/MuralServer");
			Recado r0 = new Recado();
			r0.setCodigo(1);
			r0.setApelido("Enivaldo");
			r0.setTexto("Hello World Lana");
			mural.registrarRecado(r0);
			
			Recado r1 = new Recado();
			r1.setCodigo(2);
			r1.setApelido("Lana");
			r1.setTexto("Hello World Enivaldo");
			mural.registrarRecado(r1);
			
			List<Recado> recados = mural.consultarRecado();
			for(Recado cont : recados) {
				System.out.println(cont.getApelido() + " " + cont.getTexto());
			}
			
			mural.removerRecado(r1);

			for(Recado cont : recados) {
				System.out.println(cont.getApelido() + " " + cont.getTexto());
			}
			
		} catch (Exception e) {
			System.out.println("Hello Usuario exception: " + e.getMessage());
	        e.printStackTrace();
		}

	}

	
}
