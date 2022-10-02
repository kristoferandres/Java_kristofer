package java_kristofer;
//Kristofer Andres IT21 02/10 04:05
import java.util.Scanner;
public class KT1_kristofer {

	public static void main(String[] args) {
		System.out.println("Kirjuta kaks numbrit ja tehakse liitmistehe. sisestusn2ide (5 2)");
		Scanner scanner = new Scanner (System.in); // loob scanneri
		String lop = scanner.nextLine(); //paneb rea stringi
		String [] words = lop.split(" ");
		String esi = words[0];
		String tei = words[1];
		int a = Integer.parseInt(esi);
		int b = Integer.parseInt(tei);
		System.out.println(a+b); //prindib välja

	}

}
