import java.util.Locale;
import java.util.Scanner;

public class exercicioResumo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cproduto1, cproduto2 , vproduto1, vproduto2, qproduto1, qproduto2, pagamento;
		
		cproduto1 = sc.nextDouble();
		vproduto1 = sc.nextDouble();
		qproduto1 = sc.nextDouble();
		
		cproduto2 = sc.nextDouble();
		vproduto2 = sc.nextDouble();
		qproduto2 = sc.nextDouble();
		
		
		pagamento = vproduto1 * qproduto1 + vproduto2 * qproduto2;
		
		System.out.printf("O valor total e: %.2f%n ", pagamento);
		
		sc.close();
		
	}

}
