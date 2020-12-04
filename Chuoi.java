package RMI;

import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Chuoi extends Remote {
	public String chuoihoa(String s) throws RemoteException;
	public String chuoithuong(String s) throws RemoteException;
	public String daochuoi(String s) throws RemoteException;
	public int demkitu(String s) throws RemoteException;
	

}
