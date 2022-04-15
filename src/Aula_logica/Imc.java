package Aula_logica;
import java.util.Scanner;
public class Imc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vamos calcular a massa corporea!");
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.print("Agora, digite sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = (peso/(altura*altura));
		
		if (imc < 17) {
			System.out.println("IMC= "+ imc+", muito abaixo do peso!");
		}else if(imc >= 17 && imc <= 18){
			   System.out.println("IMC= "+ imc+", abaixo do peso!");
		}else if(imc >= 18.5 && imc <= 25){
			   System.out.println("IMC= "+ imc+", peso ideal!");
		}else if(imc >= 25 && imc <= 30) {
			   System.out.println("IMC= "+ imc+", sobre peso!");
		}else if(imc >= 30 && imc <= 35) {
			   System.out.println("IMC= "+ imc+", obesidade!");
		}else if(imc >= 35 && imc <= 40) {
			   System.out.println("IMC= "+ imc+", obesidade severa!");
		}else {
			   System.out.println("IMC= "+ imc+", obesidade mórbida!");
		}
		
	}

}
