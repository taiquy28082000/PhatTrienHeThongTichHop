package RMI;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;


public class ChuoiClient {
	public static void menu() {
		System.out.println("1. Viet hoa chuoi");
		System.out.println("2. Viet thuong chuoi");
		System.out.println("3. Dao chuoi");
		System.out.println("4. Dem chuoi");
		System.out.println("0. Ket thuc chuong trinh");
		
      }
	public static void main(String[] args) {
		System.out.println("Client dang khoi dong");
		Scanner scn= new Scanner(System.in);
		try {
			Chuoi ch= (Chuoi) Naming.lookup("rmi://localhost:9988/Mychuoi");
			
			menu();
			System.out.println("Nhap thao tac can thuc hien");
			int chon=scn.nextInt();
			System.out.println("-------------------------");
			while(chon>0) {
				switch(chon) {
				case 1:
					System.out.println("Nhap chuoi can viet hoa: ");
					scn.nextLine();
					String s=scn.nextLine();
					System.out.println("Chuoi viet hoa la: "+ ch.chuoihoa(s));
					break;
				case 2:
					System.out.println("Nhap chuoi can viet thuong: ");
					scn.nextLine();
					String s1=scn.nextLine();
					System.out.println("Chuoi viet thuong la: "+ ch.chuoithuong(s1));	
					break;
					
				case 3:
					System.out.println("Nhap chuoi can dao nguoc: ");
					scn.nextLine();
					String s2=scn.nextLine();
					System.out.println("Chuoi bi dao nguoc la: "+ ch.daochuoi(s2));
					break;
				case 4:
					System.out.println("Nhap chuoi can dem ki tu: ");
					scn.nextLine();
					String s3=scn.nextLine();
					System.out.println("So ki tu co trong chuoi: "+ ch.demkitu(s3));
					break;
				case 0:
					System.out.println("Ket thuc chuong trinh:) ");
					break;
				default:
					System.err.println("Nhap thao tac sai :( ");
					break;
				}
				System.out.println("-------------------------");
				menu();
				System.out.println("Nhap thao tac can thuc hien: ");
				chon=scn.nextInt();
			}
		}
		catch(MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}

}
