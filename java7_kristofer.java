package java_kristofer;
//Kristofer Andres IT21 02/10 04:05
import java.util.Scanner;

public class java7_kristofer {

	public static void main(String[] args) {
		System.out.println("Kirjuta kaks numbrit ja tehakse jagamistehe. sisestusn2ide (5 2)");
		Scanner s = new Scanner (System.in); // loob scanneri
		String lop = s.nextLine(); //paneb rea stringi
		String [] words = lop.split(" "); //teeb loendi
		String esi = words[0]; //võtab loendist esimese elemendi
		String tei = words[1]; //võtab loendist tesie elemendi
		int a = 0;
		int b = 0;
		try { //proovib intiks teha
			 a = Integer.parseInt(esi); //muudab stringi numbriks
			 b = Integer.parseInt(tei); //muudab stringi numbriks
			 try { //proovib arvutust teha
					System.out.println(a /b); //prindib vastuse välja
				} catch(ArithmeticException e) {
					System.out.println("teine arv peab olema nullist erinev");
				} 
		} catch(NumberFormatException e) {
			System.out.println("Sisesta numbrid!!!");
		}
		
		
		
	}

}
