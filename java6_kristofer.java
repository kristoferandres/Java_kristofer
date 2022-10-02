package java_kristofer;
//Kristofer Andres IT21 02/10 04:05
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
public class java6_kristofer {

	public static void main(String[] args) {
		System.out.println("Kirjuta numbreid ja saad summa ja keskmise. Kui oled piisavalt numbreid kirjutanud j2ta tyhjaks ja vajuta enterit.");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner (System.in); // loob scanneri
		int i = 1;
		String nimi = "1";
		while (i == 1) {
			nimi = scanner.nextLine(); //paneb rea stringi
			if (nimi == "") {break;}  //lõpetab kui midagi pole
		
		int a = Integer.parseInt(nimi);
		list.add(a);
		}
		System.out.println(sum(list)); //prindib summa välja
		System.out.println(kesk(list)); //prindib keskmise välja
		int b = sum(list);
		
		 File minuFail = new File("MinuTekstifail.txt"); //teeb faili ja paneb sinna sisse andmed
		 try {
		 PrintWriter bw = new PrintWriter(new FileWriter(minuFail));
		 bw.write(String.valueOf(sum(list)));
		 bw.write("    ");
		 bw.write(String.valueOf(kesk(list)));
		 bw.write("    ");
		 for (int p = 0;p< list.size();p+=1) {
			 bw.write(String.valueOf(list.get(p)));
			 bw.write(" ");
			 System.out.println(list.get(p));
			}
		 
		 bw.close();
		 } catch (IOException e) {
		 e.printStackTrace();
		 }
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
