package java_kristofer;
//Kristofer Andres IT21 02/10 04:06
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class KT16_kristofer {

	public static void main(String[] args) {
		System.out.println("Kirjuta numbreid ja saad summa ja keskmise. Kui oled piisavalt numbreid kirjutanud j2ta tyhjaks ja vajuta enterit.");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner (System.in); // loob scanneri
		int i = 1;
		String nimi = "1";
		while (i == 1) {
			nimi = scanner.nextLine(); //paneb rea stringi
			if (nimi == "") {break;}
		
		int a = Integer.parseInt(nimi);
		list.add(a); 
		}
		System.out.println("Summa: "+sum(list)); //prindib välja
		System.out.println("Keskmine: "+kesk(list)); //prindib välja
	}
		static int sum(ArrayList<Integer> list) { //summa funktsioon
			int i = 0;
			for (int p = 0;p< list.size();p+=1) {
				
				i += list.get(p);
			}
			return i;
		}
       static int kesk(ArrayList<Integer> list) { //keskmise funktsioon
    	   int i = 0;
			for (int p = 0;p< list.size();p+=1) {
				
				i += list.get(p);
			}
			i = i/list.size();
			return i;
		}
	

}
