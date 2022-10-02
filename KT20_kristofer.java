package java_kristofer;
//Kristofer Andres IT21 02/10 04:06
import java.util.Scanner;
public class KT20_kristofer {

	public static void main(String[] args) {
		System.out.println("Kirjuta binaarkoodis number ja saad kymnendsüsteemis vastuse: ");
		Scanner s = new Scanner (System.in); // loob scanneri
		String lop = s.nextLine(); //paneb rea stringi
		System.out.println(Integer.parseInt(lop,2));  //muudab decimaliks
	}

}
