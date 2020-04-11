import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, average;
		System.out.println("Digite o primeiro numero:");
		x = sc.nextInt();
		System.out.println("Digite o segundo numero:");
		y = sc.nextInt();
		average = (x + y) / 2.0;
		System.out.printf("A media = %.2f%n", average);
		sc.close();

	}

}
