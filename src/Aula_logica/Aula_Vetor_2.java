package Aula_logica;
import java.util.Scanner;
public class Aula_Vetor_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] v = new int[7];
		int i, total = 0;
		
		for(i=0;i<=6;i++) {
			System.out.print("Digite um valor para posição "+"["+ i +"]: ");
			v[i]=sc.nextInt();
		}
		
		System.out.println("-------------------------------------------------");
		System.out.println(">>>>>>>>>>Quantidade de números pares.<<<<<<<<<<");
		System.out.println("-------------------------------------------------");
		
		for(i=0;i<=6;i++) {
			
			if((v[i]%2)==0) {
				total = total +1;
			}
		}
		System.out.println("Total de números pares é: " + total);
		System.out.println("--------------------------------------------------");
		System.out.println(">>>>>>>>>>>>Mostra qual posição é par.<<<<<<<<<<<<");
		System.out.println("--------------------------------------------------");
		for(i=0;i<=6;i++) {
			if((v[i]%2)==0) {
				System.out.println("Posição "+ v[i] + " é par!");
			}
		}
	}

}
