package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 *2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 */
		Scanner leia = new Scanner(System.in);
		int par = 0, impar = 0, numero;
		
		for(int i = 1; i <= 10; i++) {
        	   System.out.println("Digite " + i + " numero: ");
        	   numero = leia.nextInt();
        	   
        	   if(numero % 2 == 0){
        		   par++;
        		   }
        	   if(numero % 2 == 1 ) {
        		   impar++;
        	   }
           }
		 System.out.println("Foram Digitados " + par + " N�meros Pares!!");
  	   System.out.println("Foram Digitados " + impar + " N�meros �mpares!!");
	} 

}
