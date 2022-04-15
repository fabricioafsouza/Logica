package Aula_logica;
import java.util.Scanner;
public class Emprestimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double empr = 0.0;
		double calc = 0.0;
		
		
		System.out.print("Digite o valor para empréstimo: R$ ");
		empr = sc.nextDouble();
		calc = ((empr *20)/100);
		
		System.out.println("O valor do empréstimo é R$ "+ empr + ", valor dos juros é R$ " + calc + ", valor total do empréstimo é R$ " + (empr+calc));
		
		System.out.print("Quantas parcelas gostaria de dividir? ");
		int parcelas = 0;
		parcelas = sc.nextInt();
		System.out.print("Valor mensal durante " + parcelas + " meses é R$ " + ((empr+calc)/parcelas));
	}

}
