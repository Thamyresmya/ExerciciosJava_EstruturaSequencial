// 4.	Faça um Programa que peça as 4 notas bimestrais e mostre a média.

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeira NOTA: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Segunda NOTA: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Terceira NOTA: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Quarta NOTA: ");
		double nota4 = scan.nextDouble();			
		
		System.out.println("A média das notas é: " + ((nota1 + nota2 + nota3 + nota4)/4));

	}

}
