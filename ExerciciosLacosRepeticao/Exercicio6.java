package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 
		 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
           final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
           0(zero).(DO...WHILE)
		 */
			Scanner leia = new Scanner(System.in);
			int num =0, soma = 0;
			float i = 0, media = 0;
			
			System.out.println("Digite um n�mero e para finalizar digite o N�mero 0");
			
			if(num %3 == 0 && num != 0) {
				soma +=num;
				i++;
			}
				do {
					System.out.println("Digite um numero: ");
					num = leia.nextInt();
					if(num %3 ==0 && num != 0) {
						soma +=num;
						i++;
					}
					media = soma /i;
					
					
				} while(num != 0);
				System.out.println("A quantidade de n�meros que voc� digitou foi " +(i)+ " E a m�dia desses n�meros � "+ (media));	
		}
	
	}


