package Aula_logica;
import java.util.Scanner;
public class Contagem_inteligente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int var1, var2;
		
		System.out.println("-------------------------------------");
		System.out.print("Início: ");
		var1 = sc.nextInt();
		System.out.print("Fim: ");
		var2 = sc.nextInt();
		System.out.println("-------------------------------------");
		System.out.println("CONTANDO!!");
		
		if (var1 <= var2) {
			while (var1 <= var2) {
				System.out.println(var1);
				var1++;
			}
		}else if(var1 > var2){
			
			while (var1 >= var2) {
				System.out.println(var1);
				var1--;
			}
		}
		System.out.println("FIM!");
	}

}
