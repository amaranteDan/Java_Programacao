
public class baskara {

	public static void main(String[] args) {
		//Ideia de como criar formula de Baskara.
		
		int a = 4;
		int b = 42;
		int c = 6;
		
		
		int delta = (int) (Math.pow(b, 2.0) - 4*a*c);
		
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("o valor de x1 = "+x1+"O valor de x2 e igual = "+ x2);
		

	}

}
