package java_kristofer;
//Kristofer Andres IT21 02/10 04:06
import java.util.Scanner;
import java.util.Random;
public class KT24_kristofer {

	public static void main(String[] args) {
		System.out.println("Leia arv mis on vahemikus 0-100 Kirjuta sisse mitu korda arvata tahad:");
		Scanner s = new Scanner (System.in); // loob scanneri
		Random random = new Random();
		String lop = s.nextLine(); //paneb rea stringi
		int a = Integer.parseInt(lop);
		int lopp = random.nextInt(100); //suvakas number
		for (int i=0;i <a; i++) {
			System.out.println("");
			System.out.println("Arva number:");
			String elu = s.nextLine();
			int b = Integer.parseInt(elu);
			if (b > lopp) {  //kontrollib kuhu su pakkumine läks
				System.out.println("pakkusid yle");
			} else if (b < lopp) {
				System.out.println("pakkusid liiga v2he");
			} else {
				System.out.println("pakkusid 6igesti Number oli t6esti "+lopp);
				break;
			}
			
			
		}

	}

}
