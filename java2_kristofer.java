package java_kristofer;
//Kristofer Andres IT21 02/10 04:05
public class java2_kristofer {

	public static void main(String[] args) {
		System.out.println(elips(1, 1)); //prindib välja
	}
		static double toll(int a) { //tollide teisenus funktsioon
			double tollid = a /  39.3700787;
			return tollid;
		}
		
	static double elips(int b, int c) { //elipsi pindala funktsioon
		
		double pindala = Math.PI *b *c;  
		return pindala;
				
		
		
	}

	

}
