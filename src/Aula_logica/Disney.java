package Aula_logica;
import java.util.Scanner;
public class Disney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos ver se temos dinheiro para ir à Disney!");
		System.out.print("Digite seu saldo: R$ ");
		double saldo = sc.nextDouble();
		
		if(saldo >= 10000) {
			System.out.println("Partiu Disney!");
		}else if(saldo >= 5000 & saldo < 10000) {
			System.out.println("Bora pra praia!");
		}else {
			System.out.println("Vamos ficar em casa.");
		}
	}

}
