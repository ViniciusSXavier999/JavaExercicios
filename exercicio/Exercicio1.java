package exercicio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
	
	//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um n�mero:");
		int a = ler.nextInt();
		
		System.out.print("Digite um n�mero:");
		int b = ler.nextInt();
		
		System.out.print("Digite um n�mero:");
		int c = ler.nextInt();
		
		if(b>a & b > c) {
			System.out.print("O maior numero � " + b);
		} else if (c > a & c > b) {
			System.out.print("O maior numero � " + c);
		} else  {
			System.out.println("O maior numero � " + a);
		}
	

	}

}
