package Aula_logica;
import java.util.Scanner;
public class Epar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos descobrir se um n�mero � par ou impar.");
		System.out.print("Digite um n�mero: ");
		int num1 = sc.nextInt();
		
		if ((num1%2) == 0)  {
			System.out.println("O n�mero "+ num1 +" � par!");
		}else {
			System.out.println("O n�mero "+ num1 +" � impar!");
				
		}
	}

}
