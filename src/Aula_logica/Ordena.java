package Aula_logica;
import java.util.Scanner;
public class Ordena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vet[] = new int[4];
		int i, aux;
		
		for (i = 0;i <= 3;i++) {
			System.out.print("Digite um numero.");
			vet[i] = sc.nextInt();
		}
		
		for(i = 0;i <= 3;i++) {
			for(int j=0 ; j <= 3; j++ )
				if (vet[i]<vet[j]) {
					aux = vet[j];
					vet[j] = vet[i];
					vet[i] = aux;
			}
		}
		
		for (i = 0;i <= 3;i++) {
			System.out.print(vet[i]);
		}
	}
}
