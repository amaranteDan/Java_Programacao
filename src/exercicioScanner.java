import java.util.Locale;
import java.util.Scanner;

public class exercicioScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);// Configurado para usar o ponto como separador.
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.printf("Voce digitou: %s %d %f",  x, y , z);
		
		sc.close();

	}

}
