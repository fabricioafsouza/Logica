package Aula_logica;
import java.util.Scanner;
public class Primeira_Funcao {

	public static int soma(int x, int y) {
			return x + y;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int a = sc.nextInt();
		System.out.print("Digite outro número: ");
		int b = sc.nextInt();
		
		System.out.println("Resultado da soma: " + soma(a,b));
	}

}
