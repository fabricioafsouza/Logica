//digitado um n�mero e ser� comparado se esta entre o intervalo de 0 a 10
package Aula_logica;
import java.util.Scanner;
public class Intervalo_zero_dez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cont = 0, Simpar=0;
		System.out.println("Antes do la�o");
		for (int i=1; i<=6; i++) {
			
			System.out.print("Digite um n�mero: ");
			int aux = sc.nextInt();
			if((aux>=0) && (aux<=10)) {
				cont = cont +1;
				if((aux%2)==1) {
					Simpar = Simpar + aux;
			    }
			}
		}
		System.out.println("Ao todo foram " + cont + " entre 0 e 10.");
		System.out.println("No intervalo a soma de numeros impares �: " + Simpar);
	}

}
