import java.util.Locale;
import java.util.Scanner;

public class exercicioResumo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
           mostre:
		 * a área do triângulo retângulo que tem A por base e C por altura.
	       a área do círculo de raio C. (pi = 3.14159)
	       a área do trapézio que tem A e B por bases e C por altura.
	       a área do quadrado que tem lado B.
           a área do retângulo que tem lados A e B 8 */
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		double pi = (float) 3.14159;
		
		Locale.setDefault(Locale.US);// Adotando a formatação 
		Scanner sc = new Scanner(System.in); 
		
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		circulo = pi * c;
		triangulo = a * c / 2.0;
		trapezio = (b + b) / 2.0  * c;
		quadrado = b * b;
		retangulo =  a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
		
		
		

	}

}
