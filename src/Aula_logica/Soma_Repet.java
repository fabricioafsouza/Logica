package Aula_logica;

public class Soma_Repet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0; 
		int soma = 0;
		while (cont <= 10) {
			System.out.println("Intera��o: " + cont);
			cont++;
			soma = cont + soma;
		}
		System.out.println("Intera��o final: " + cont + ". E a soma acumlada � : " + soma);
		
	}

}
