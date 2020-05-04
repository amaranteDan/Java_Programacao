package pontoFlutuante;

import java.util.Locale;
import java.util.Scanner;

public class exercicioResumo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D , Diferenca ;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = (A * B - C * D);
		
		System.out.printf("O valor da diferença e: %d", Diferenca);
		sc.close();
		

	}

}
