package ExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int maiorV = 0;
		Scanner ler = new Scanner(System.in);
		
		int vet[] = new int[5];
		
		for(int i = 0;i<5;i++) {
			
			System.out.println("Escreva a pontuação da sua atividade: ");
			vet[i] = ler.nextInt();
			
			
		}  
		for(int i = 0;i<5;i++) {
			if(vet[i]>maiorV) {
				
				maiorV=vet[i];	
			}	
		}
		
		System.out.println("seu maior valor é: " + maiorV);
	
	}

}
