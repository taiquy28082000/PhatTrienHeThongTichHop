package RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class ChuoiServer {
	public static void main(String[] args) throws MalformedURLException, AlreadyBoundException{
		System.out.println(" Server dang khoi dong");
		int port=9988;
		try {
			LocateRegistry.createRegistry(port);
			Chuoilmpl ch= new Chuoilmpl();
			UnicastRemoteObject.exportObject(ch,port);
			Naming.bind("rmi://localhost:9988/Mychuoi", ch);
			System.out.println(" Server da ket noi ");
			
		}
		catch (RemoteException e) {
			e.printStackTrace();
		}
}
}
