package Aula_logica;
import java.util.Scanner;
public class Rep_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0;
				
		System.out.print("Digite um n�mero para final da intera��o -> ");
		int escolha = sc.nextInt();
		while (cont <= escolha) {
			System.out.println("Itera��o atual: " + cont);
			cont++;
		}
		System.out.println("Fim do la�o! Itera��o " + cont);
	}

}
