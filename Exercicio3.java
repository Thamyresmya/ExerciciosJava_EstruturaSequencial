// 3.	Faça um Programa que peça dois números e imprima a soma.

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma dos numeros é: " + (numero1 + numero2));

	}

}
