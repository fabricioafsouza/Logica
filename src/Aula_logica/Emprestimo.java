package Aula_logica;
import java.util.Scanner;
public class Emprestimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double empr = 0.0;
		double calc = 0.0;
		
		
		System.out.print("Digite o valor para empr�stimo: R$ ");
		empr = sc.nextDouble();
		calc = ((empr *20)/100);
		
		System.out.println("O valor do empr�stimo � R$ "+ empr + ", valor dos juros � R$ " + calc + ", valor total do empr�stimo � R$ " + (empr+calc));
		
		System.out.print("Quantas parcelas gostaria de dividir? ");
		int parcelas = 0;
		parcelas = sc.nextInt();
		System.out.print("Valor mensal durante " + parcelas + " meses � R$ " + ((empr+calc)/parcelas));
	}

}
