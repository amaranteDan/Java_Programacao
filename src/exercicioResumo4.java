import java.util.Locale;
import java.util.Scanner;

public class exercicioResumo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nfuncionario, qtdH, valorhora, salario;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		nfuncionario = sc.nextDouble();
		qtdH = sc.nextDouble();
		valorhora = sc.nextDouble();
		
		salario = qtdH * valorhora;
		
		System.out.printf("O Numero do funcionario e: %.2f%n  e o salario a receber e: U$ %.2f%n", nfuncionario, salario);
		
		sc.close();

	}

}
