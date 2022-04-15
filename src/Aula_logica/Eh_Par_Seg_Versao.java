package Aula_logica;
import java.util.Scanner;
public class Eh_Par_Seg_Versao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int aux = sc.nextInt();
		
		for (int i = 0; i <= aux; i++) {
			if((i % 2) == 0) {
				System.out.println("É par: " + i);
			}else {
				System.out.println("Não é par: " + i);
			}
		}
		//decrescente
		System.out.println("Decrescente");
		for (int i = aux; i >= 0; i--) {
			if((i % 2) == 0) {
				System.out.println("É par: " + i);
			}else {
				System.out.println("Não é par: " + i);
			}
		}
		
	}

}
