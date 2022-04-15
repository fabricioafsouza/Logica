package Aula_logica;
import java.util.Scanner;
public class Aula_Vetor_1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		int n[] = new int[5];
		for(i = 0;i <= 4;i++) {
			System.out.print("Digite um número para posição " + "["+ i +"]: ");
			n[i]=sc.nextInt();
		}	
		System.out.println("---------------------------------------");
		for(i=0;i<=4;i++) {
			System.out.println("Numero digitado na posição " + "["+ i +"]: " + n[i]);
		}
	}
}
