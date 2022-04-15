package Aula_logica;
import java.util.Scanner;
public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int aux=0, soma=0;
		int par=0, cinco=0, global=0, nulo=0;
		for (int i = 1; i<=5; i++) {
				System.out.print("Digite o "+ i + "° número: ");
				aux = sc.nextInt();
				
				soma = soma + aux;
				
				if((i % 2) == 0){
					par = par + i;
				}else if ((i % 5) == 0) {
					cinco = cinco + 1;
				}
				
				if (i == 0){
					nulo = nulo + 1;
				}
				global = i;
		}
		System.out.println("-------------------------");
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + (soma/global));
		System.out.println("Quantidade de divisiveis por cinco: " + cinco);
		System.out.println("Quantidade de nulos: " + nulo);
		System.out.println("Quantidade da soma dos pares: " + par);
		System.out.println("-------------------------");
	}
		
}

		/*int aux1, aux2, aux3, aux4, aux5;
		System.out.print("Digite primeiro valor: ");
		aux1=sc.nextInt();
		System.out.print("Digite segundo valor: ");
		aux2=sc.nextInt();
		System.out.print("Digite terceiro valor: ");
		aux3=sc.nextInt();
		System.out.print("Digite quarto valor: ");
		aux4=sc.nextInt();
		System.out.print("Digite quinto valor: ");
		aux5=sc.nextInt();
		
		System.out.println("-----------------------------------");
		System.out.println("Cálculo da soma e média dos valores");
		System.out.println("-----------------------------------");
		int soma = aux1+aux2+aux3+aux4+aux5;
		int media=(soma/5);
		System.out.println("Valor da somda: " + soma);
		System.out.println("Valor da média: " + media);
		for (int i = 1; i <= 5; i++) {
			int soma2 = 0;
			if*/ 
		
			
	
