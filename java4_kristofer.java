package java_kristofer;
//Kristofer Andres IT21 02/10 04:05
import java.util.Scanner;

public class java4_kristofer {

	public static void main(String[] args) {
		System.out.println("Kirjuta s6na v6i lause:");
		Scanner scanner = new Scanner (System.in); // loob scanneri
		String lop = scanner.nextLine(); //paneb rea stringi
		System.out.println(lop.toUpperCase()); //prindib suurte tähtedega
		System.out.println(lop.length()); //prindib pikkuse
		String [] words = lop.split(" "); //paneb loendisse
		System.out.println(words.length); //prindib sõnade koguse
		System.out.printf("esimene sõna: %s",words[0]); //prindib esimese sõna
	}

}
