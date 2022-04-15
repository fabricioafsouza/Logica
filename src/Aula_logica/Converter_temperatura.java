package Aula_logica;
import java.util.Scanner;

public class Converter_temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double fahrenheit = 0.0;
		double celsius = 0.0;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		fahrenheit = sc.nextDouble();
		celsius = ((fahrenheit-32)/1.8);
		System.out.println("Temperatura em Celsius é, " + celsius + "º");
	}

}
