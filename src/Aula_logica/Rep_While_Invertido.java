package Aula_logica;

public class Rep_While_Invertido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		int contador = 10;
		
		while (contador >= 0 ) {
			System.out.println("Interação: "+contador);
			contador--;
		}
		System.out.println("Fim de loop! Interação: " +contador);
	}

}
