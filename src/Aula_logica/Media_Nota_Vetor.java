package Aula_logica;
import java.util.Scanner;
public class Media_Nota_Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String nome[] = new String[4];
		int nota1[] = new int[4];
		int nota2[] = new int[4];
		double media[] = new double[4];
		int i;
		
		for (i=0;i<=3;i++) {
			System.out.println("-------------------------");
			System.out.print("Digite nome do aluno: ");
			nome[i] = sc.next();
			System.out.print("Digite primeira nota: ");
			nota1[i] = sc.nextInt();
			System.out.print("Digite segunda nota: ");
			nota2[i] = sc.nextInt();
			System.out.println("-------------------------");
			media[i] = (nota1[i]+nota2[i])/2;
			System.out.println("Média das notas: " + media[i]);
			System.out.println("-------------------------");
		}

		
		for (i=0;i<=3;i++) {
			System.out.println("Nome: "+ nome[i] + " e a média: " + media[i]);
		}
	}

}
