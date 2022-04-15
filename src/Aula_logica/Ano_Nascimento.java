package Aula_logica;
import java.util.Scanner;
public class Ano_Nascimento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite ano atual: ");
		int ano_atual = sc.nextInt();
		
		System.out.println("Digite seu ano de nascimento: ");
		int ano_nasc = sc.nextInt();
		int idade = ano_atual-ano_nasc;
		System.out.println("Sua idade é: "+ idade + " anos!");
		
		if (idade >= 21) {
			System.out.println("Voçê nasceu em " + ano_nasc + ", já tem "+ idade +" anos e atingiu a maioridade!");
		}else {
			System.out.println("Voçê nasceu em " + ano_nasc + ", já tem "+ idade +" anos e não atingiu a maioridade!");
		}
	}

}
