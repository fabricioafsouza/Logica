package Aula_logica;

import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int coordX = 1, coordY = 1;
		
		
		while ((coordX != 0) & (coordY != 0)) {
			System.out.print("Digite valor para x: ");
			coordX = sc.nextInt();
			System.out.print("Digite valor para y: ");
			coordY = sc.nextInt();
			
			if ((coordX > 0) & (coordY > 0)) {
				System.out.println("Primeira quadrante.");
			}else if ((coordX < 0) & (coordY > 0)) {
				System.out.println("Segundo quadrante.");
			}else if ((coordX < 0) & (coordY < 0)) {
				System.out.println("Terceiro quadrante.");
			}else if ((coordX > 0) & (coordY < 0)) {
				System.out.println("Quarto quadrante");
			}else {
				System.out.println("Posição zero.");
			}
			System.out.println("");
			sc.close();
		}
	}

}
