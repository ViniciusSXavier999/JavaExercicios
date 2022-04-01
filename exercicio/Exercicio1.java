package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
	//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número:");
		int a = ler.nextInt();
		
		System.out.print("Digite um número:");
		int b = ler.nextInt();
		
		System.out.print("Digite um número:");
		int c = ler.nextInt();
		
		if(b>a & b > c) {
			System.out.print("O maior numero é " + b);
		} else if (c > a & c > b) {
			System.out.print("O maior numero é " + c);
		} else  {
			System.out.println("O maior numero é " + a);
		}
	

	}

}
