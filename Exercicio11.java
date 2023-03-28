/* 11.	Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
		a.	o produto do dobro do primeiro com metade do segundo .
		b.	a soma do triplo do primeiro com o terceiro.
		c.	o terceiro elevado ao cubo.
*/

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		int numero2 = scan.nextInt();
		
		System.out.println("Digite um numero real: ");
		double numero3 = scan.nextDouble();
		
		int resultado1 = (numero1*2) * (numero2/2);
		double resultado2 = (numero1*3) + (numero3);
		double resultado3 = Math.pow(numero3, 3);	
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resultado1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + resultado2);
		System.out.println("O terceiro elevado ao cubo é: " + resultado3);

	}

}
