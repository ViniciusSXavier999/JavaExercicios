package exercicio;

import java.util.Scanner;


public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
           categoria ela se encontra:
           10-14 infantil
           15-17 juvenil
           18-25 adulto
		 */
		int idade; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade <=14) {
			System.out.println("Você é infantil!!");
			
		}else if(idade>=15 && idade <=17) {
			System.out.println("Você é Juvenil!!");
		
		}else if(idade>18) {
			System.out.println("Você é adulto");
		}
		
			
			
          
	}

}
