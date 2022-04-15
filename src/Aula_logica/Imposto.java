package Aula_logica;
import java.util.Scanner;
public class Imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double compra = 0.0;
		double imposto = 0.0;
		
		System.out.print("Digite valor da compra: R$ ");
		compra = sc.nextDouble();
		imposto = ((compra*60)/100);
		
		System.out.println("O valor comprado foi + R$ "+ compra + ", irá pagar de imposto R$ "+ imposto +". Tento valor total R$ " + (imposto+compra));
	}

}
