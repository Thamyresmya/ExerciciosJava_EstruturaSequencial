/* 18.	Faça um programa que peça o tamanho de um arquivo para download (em MB)
 *  e a velocidade de um link de Internet (em Mbps), 
 *  	calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). 
 */

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Qual o tamanho do arquivo em MB");
		double tamanho = scan.nextDouble();
		
		System.out.println("Qual a velocidade de um link de Internet (em Mbps)");
		double velocidade = scan.nextDouble();		
		
		double resultado = tamanho / velocidade;
		
		System.out.println("O tempo de download é: " + resultado + " minutos");
		

	}

}
