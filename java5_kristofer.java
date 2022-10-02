package java_kristofer;
//Kristofer Andres IT21 02/10 04:05
import java.util.Scanner;

public class java5_kristofer {

	public static void main(String[] args) {
		System.out.println("Kirjuta kaks numbrit ja tehakse jagamistehe. sisestusn2ide (5 2)");
		Scanner s = new Scanner (System.in); // loob scanneri
		String lop = s.nextLine(); //paneb rea stringi
		String [] words = lop.split(" "); //teeb loendi
		String esi = words[0]; //võtab loendist esimese elemendi
		String tei = words[1]; //võtab loendist tesie elemendi
		int a = Integer.parseInt(esi); //muudab stringi numbriks
		int b = Integer.parseInt(tei); //muudab stringi numbriks
		if (b == 0 ) { // kontrillib kas teine arv on null
			System.out.println("Teine arv peab olema nullist suurem"); 
			
		} else if (a < 0 && b < 0) { //kontrollib kas arvud on positiivsed
			System.out.println("arvud peavad olema positiivsed"); 
		} else {
			System.out.println(a /b); //prindib vastuse välja
		}
		
		

	}

}
