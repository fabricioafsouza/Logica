package Aula_logica;
import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int vet[][]= new int[4][4];
				
		int i, j;
		for(i = 1;i <= 3; i++) {
			for(j = 1;j <= 3; j++) {
				System.out.print("Digite um número para posição "+ "["+i+"]"+"["+j+"]" +". ");
				vet[i][j] = sc.nextInt();
			}
		}
		System.out.println("-----------------------------------------------------------------------");
		int a, b;
		for(a = 1;a <= 3; a++) {
			for(b = 1;b <= 3; b++) {
				if ((vet[a][b]%2==0)){
					System.out.println("Valor " + vet[a][b] + " digitado na posição " + "["+a+"]"+"["+b+"]" + " é par!");
				}else {
					System.out.println("Valor " + vet[a][b] + " digitado na posição " + "["+a+"]"+"["+b+"]" + " é impar!");
				}
				
			}
		}
	}

}
