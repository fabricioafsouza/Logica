package Aula_logica;
import java.util.Scanner;
public class Par_Impar_Funcao {

	public static boolean par_impar(int a) {
		
		if((a%2)==0) {
			return true;
		}else
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int b = sc.nextInt();
		System.out.println("O numero "+ b +" � " + par_impar(b));
	}

}
