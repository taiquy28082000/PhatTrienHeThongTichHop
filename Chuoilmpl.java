package RMI;

import java.rmi.*;

public class Chuoilmpl implements Chuoi {
       
	public static final char SPACE =' ';
	public static final char TAB ='\t';
	public static final char BREAK_LINE ='\n';
	
	 public String chuoihoa(String s) throws RemoteException {
		return s.toUpperCase();
	}
	 public String chuoithuong(String s) throws RemoteException {
		 return s.toLowerCase();
	 }
	 public String daochuoi(String s) throws RemoteException {
		 String dc= new StringBuffer(s).reverse().toString();
		 return dc;
	 }
	 public int demkitu(String s) throws RemoteException {
		    if(s==null) {
		    	return -1;
		    }
		    int count =0;
		    int size=s.length();
		    boolean notCounted = true;
		    for (int i=0; i < size; i++) {
		    	if(s.charAt(i) != SPACE && s.charAt(i) != TAB
		    			&& s.charAt(i) != BREAK_LINE ) {
		    		if(notCounted) {
		    			count++;
		    			notCounted = false ;
		    		}
		    	} else {
		    		notCounted =true;
		    	}
		    }
		    
		   return count;
	 }
	
}
