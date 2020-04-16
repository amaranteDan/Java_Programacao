import java.util.Locale;

public class exercicioUdemy1 {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products");
		System.out.printf( "%s  Which price is %.2f ",product1, price1);
		System.out.printf("%s 5.2f%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender %c%n", age, code, gender);
		System.out.printf("Rounded: %.3f%n", measure);
		System.out.printf("Rounded: %.8f%n", measure);
		Locale.setDefault(Locale.US);
		
		

	}

}
