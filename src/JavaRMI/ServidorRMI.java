package JavaRMI;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ServidorRMI {
	
	 public static void main(String args[])
	    {
	        try
	        {
	            MuralImpl mural = new MuralImpl();
	            LocateRegistry.createRegistry(2020);
	            Naming.rebind("//localhost:2020/MuralServer", mural);
	            
	            System.out.println("Servidor Mural Ativo");
	        }
	        catch (Exception e)
	        {
	            System.out.println("Servidor Mural Erro: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

}
