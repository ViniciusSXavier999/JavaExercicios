package exercicio;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
Scanner num = new Scanner (System.in);
		
		float numeroDigitado, elevado;
		
		System.out.print("Digite um numero: ");
		numeroDigitado = num.nextInt();
		
		if(numeroDigitado % 2 == 0) {
			System.out.print("Este numero � par");
			System.out.println(" E sua raiz quadrada � ");
			double raiz = Math.sqrt(numeroDigitado);
			System.out.print("A raiz quadrada �: "+ raiz);
		}else {
			System.out.print("Este numero � impar");
			elevado = numeroDigitado * numeroDigitado;
			System.out.print(" E este numero " +numeroDigitado +" elevado ao quadrado � "+elevado);
		}

	}

}
