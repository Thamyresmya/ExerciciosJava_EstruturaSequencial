// 2.	Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		
		System.out.println("O número informado foi: " + numero);

	}

}
