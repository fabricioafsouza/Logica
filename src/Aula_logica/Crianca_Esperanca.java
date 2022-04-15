package Aula_logica;
import java.util.Scanner;
public class Crianca_Esperanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("--------------------------------------------");
		System.out.println("          Doação Criança Esperança.         ");
		System.out.println("--------------------------------------------");
		System.out.println("Digite 1 para doar R$ 10,00.");
		System.out.println("Digite 2 para doar R$ 20,00.");
		System.out.println("Digite 3 para doar R$ 30,00.");
		System.out.println("Digite 4 para doar R$ 40,00.");
		System.out.println("Digite 5 para doar qualquer valor.");
		System.out.print("Digite sua escolha -> ");
		int escolha = sc.nextInt();
		double doacao = 0.0;
				
		switch (escolha){
		case 1:
			doacao = 10.00;
			break;			
		case 2:
			doacao = 20.00;
			break;
		case 3:
			doacao = 30.00;
			break;
		case 4:
			doacao = 40.0;
			break;
		case 5:
			System.out.print("Digite qualquer valor para doação! ");
			doacao = sc.nextDouble();
			break;
		}
		System.out.println("O valor doado foi R$ " + doacao);
	}

}
