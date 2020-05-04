import java.util.Locale;
import java.util.Scanner;

public class exercicioResumo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 double pi = 3.14159;
		 double raio;
		 raio  = sc.nextDouble();
		 
		 double area = pi * (Math.pow(raio, 2));
		 
		
		 
		 System.out.printf("O valor da area de uma area é: %.4f%n", area);

	}

}
