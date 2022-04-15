package Aula_logica;
import java.util.Scanner;
public class Tabela_vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String time[] = new String[3];
		
		for (int i=0; i <= 2;i++) {
			System.out.print("Escreva nome de um time! ");
			time[i] = sc.next();
		}
		System.out.println("-----------------------------------------------------");
		System.out.println(">>>>>>>>>>>>>>>TABELA DE JOGOS<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("-----------------------------------------------------");
		for (int i=0; i <= 2;i++) {
			for (int j=0; j <= 2; j++) {
				if (time[i]!=time[j]){
					System.out.println( time[i] + "[ ] X [ ]"+ time[j]);
				}
			}
		}
	}

}
