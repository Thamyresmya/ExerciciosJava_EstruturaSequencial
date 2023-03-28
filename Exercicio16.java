/*16.	Faça um programa para uma loja de tintas. O programa deverá pedir o 
 * tamanho em metros quadrados da área a ser pintada. Considere que a 
 * cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
 * tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
 * Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total. 
 */

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da sala: ");
		double tamanho = scan.nextDouble();
		
		double cobertura = tamanho / 3;
		
		double lataTinta = cobertura / 18;
		
		double precoTinta = lataTinta * 80;
		
		System.out.println("A quantidades de latas de tinta a serem compradas é de " + lataTinta
				+ " e o preço total é R$ " + precoTinta);
		

	}

}
