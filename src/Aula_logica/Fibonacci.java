package Aula_logica;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;
	
	
		
			for (int i=0;i<=15;i++) {
				if(i<=2) {
					System.out.println(i);
				}else {
					cont = (i-1) + (i + 2);
					System.out.println("Soma= " + cont);
				}
			}
		}
 }
