package Aula_logica;
import java.util.Scanner;
public class Par_Impar_PassParametro {
	
	static void Par_Impar(int a) {
		
		if ((a%2)==0) {
			System.out.println("O número "+ a + " é par!");
		}else if ((a%2)==1){
			System.out.println("O número "+ a + " é impar!");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int b = sc.nextInt();
		Par_Impar(b);
	}
}