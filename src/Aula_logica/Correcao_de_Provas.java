package Aula_logica;
import java.util.Scanner;
public class Correcao_de_Provas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String gab[] = new String[6];
		String alu[] = new String[4];
		String n1[] = new String[6];
		String n2[] = new String[6];
		String n3[] = new String[6];
		String n4[] = new String[6];
		String n5[] = new String[6];
		
			
		//Inserindo gabarito
		System.out.println("-------------------------");
		System.out.println(">>CADASTRO DO GABARITO<<");
		System.out.println("-------------------------");
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Resposta da Questão "+ i +": ");
			gab[i] = sc.next();
		}
		
		//Cadastro de aluno e resposta
		System.out.println("--------------------------------");
		System.out.println(">>CADASTRO DO ALUNO E RESPOSTA<<");
		System.out.println("--------------------------------");
		
		
	//	for (int j=1;j <= 3;j++) {
			
			for (int a = 1; a <= 2; a++) {
				
				//@SuppressWarnings("unused")
				//int j = 0;
				
				System.out.println("");
				System.out.print("Nome do aluno: ");
				alu[a] = sc.next();
				System.out.println("");
				if(a==1) {
					for (int resp1 = 1; resp1 <= 5; resp1++) {
						System.out.print("Digite resultado da "+ resp1 + "ª pergunta: ");
						n1[resp1] = sc.next();
					}
				}else if (a==2) {
					for (int resp2 = 1; resp2 <= 5; resp2++) {
						System.out.print("Digite resultado da "+ resp2 + "ª pergunta: ");
						n2[resp2] = sc.next();
					}
				
				}else if (a==3) {
					for (int resp3=1; resp3<=5; resp3++) {
						System.out.print("Digite resultado da "+ resp3 + "ª pergunta: ");
						n3[resp3] = sc.next();
					}
				}else if (a==4) {
					for (int resp4=1; resp4<=5; resp4++) {
						System.out.print("Digite resultado da "+ resp4 + "ª pergunta: ");
						n4[resp4] = sc.next();
					}
				}else if (a==5) {
					for (int resp5=1; resp5<=5; resp5++) {
						System.out.print("Digite resultado da "+ resp5 + "ª pergunta: ");
						n5[resp5] = sc.next();
					}
				}
		   }
	//	}
		
		//Comparar resultado
		System.out.println("--------------------------------");
		System.out.println(">>>>>>CORREÇÃO E RESULTADO<<<<<<");
		System.out.println("--------------------------------");	
		
	//	for (int m = 1; m <= 3; m++) {
			for (int i = 1;i <= 2;i++) {	
				int cont = 0;				
				if( i == 1) {
					for (int resp1 = 1; resp1 <= 5; resp1++) {		
					  if(gab[resp1] != n1[resp1]) {
						 	cont = cont+2;
						}	
	     			}
				}else if(i == 2) {
					for (int resp2 = 1; resp2 <= 5 ; resp2++) {
						if(gab[resp2] != n2[resp2]) {
							cont = cont+2;
						}
					}
				}else if(i == 3) {
					for (int resp3=1; resp3 <= 5; resp3++) {
						if(gab[resp3] != n3[resp3]) {
							cont = cont+2;
						}
					}	
				}else if(i==4) {
					for (int resp4=1; resp4 <= 5; resp4++) {
						if(gab[resp4] != n4[resp4]) {
							cont = cont+2;
						}
					}	
				}else if(i==5) {
					for (int resp5=1; resp5 <= 5; resp5++) {
						if(gab[resp5] != n5[resp5]) {
							cont = cont+2;
						}
					}
					
				}
				System.out.println("O aluno "+ alu[i] + " acertou " + cont + " pontos!");
	        }
			
		}
	}
//}
