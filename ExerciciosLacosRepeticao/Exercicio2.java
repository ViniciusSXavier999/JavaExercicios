package ExerciciosLacosRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 *2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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
		 System.out.println("Foram Digitados " + par + " Números Pares!!");
  	   System.out.println("Foram Digitados " + impar + " Números ímpares!!");
	} 

}
