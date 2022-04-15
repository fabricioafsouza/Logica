package Aula_logica;

public class Passagem_Parametro {

	static void Soma(int a, int b) {
		System.out.println("Recebi valor " + a);
		System.out.println("Recebi valor " + b);;
		System.out.println("A soma entre os dois é: " + (a+b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 10;
		int d = 5;
		Soma(c,d);
	}

}
;