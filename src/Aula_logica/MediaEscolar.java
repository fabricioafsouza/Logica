package Aula_logica;
import java.util.Scanner;

public class MediaEscolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite primeira nota: ");
		double nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1+nota2)/2;
		
		if (media >= 7) {
			System.out.println("Sua m�dia � "+media+". Aprovado!");
		}else if (media >= 5 && media <= 6.9) {
			  	System.out.println("Sua m�dia � "+media+". Recupera��o");
		}else {
			System.out.println("Sua m�dia � "+media+". Reprovado.");
		}
		
	}

}
