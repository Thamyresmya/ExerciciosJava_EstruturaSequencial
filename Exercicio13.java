/* 13.	Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo 
 * que calcule seu peso ideal, utilizando as seguintes fórmulas:
	a.	Para homens: (72.7*h) - 58
	b.	Para mulheres: (62.1*h) - 44.7 
*/

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a sua altura: ");
		double altura = scan.nextDouble();
		
		double homem = (72.7 * altura) - 58;
		double mulher = (62.1 * altura) - 44.7;
		
		System.out.println("Para homem: O peso ideial é " + homem);
		System.out.println("Para mulher: O peso ideial é " + mulher);

	}

}
