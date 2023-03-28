// 5.	Faça um Programa que converta metros para centímetros.

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor em metros: ");
		float valor = scan.nextFloat();
		
		System.out.println("O valor em cm é: " + (valor*100));

	}

}
