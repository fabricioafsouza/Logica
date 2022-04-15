package Aula_logica;

public class MatrizIdentidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mi[][] = new int[4][4];
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == j) {
					mi[i][j] = 1;
				}else {
					mi[i][j] = 0;
				}
			}
		}
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				System.out.println("Posição " + "[" + i + "]" + "[" + j + "]" + ", valor digitado: " + mi[i][j]);
			}
		}
	}

}
