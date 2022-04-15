package Aula_logica;
import java.util.Scanner;
public class Epar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos descobrir se um número é par ou impar.");
		System.out.print("Digite um número: ");
		int num1 = sc.nextInt();
		
		if ((num1%2) == 0)  {
			System.out.println("O número "+ num1 +" é par!");
		}else {
			System.out.println("O número "+ num1 +" é impar!");
				
		}
	}

}
