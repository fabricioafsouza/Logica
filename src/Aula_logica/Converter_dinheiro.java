package Aula_logica;
import java.util.Scanner;
public class Converter_dinheiro {
	
	static double dolar_comercial = 5.05;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double real = 0.0;
		double convertido = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor a ser convertido em dolar. ");
		real = sc.nextDouble();
		convertido = (real/dolar_comercial);
		System.out.println("O valor em dolar é $ " + convertido);
	}

}
