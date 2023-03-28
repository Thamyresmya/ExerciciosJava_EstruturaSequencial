// 6.	Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double raio = scan.nextDouble();		

		double area = Math.PI * (raio*raio);		
		
		System.out.println("A area do circulo é: " + area);

	}

}
