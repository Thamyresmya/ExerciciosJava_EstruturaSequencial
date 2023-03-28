// 10.	Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.


package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Celsius: ");
		double graus = scan.nextDouble();
		
		double resultado = (graus * 1.8) + 32;
		
		System.out.println("A temperatura em graus Fahrenheit é: " + resultado + "F");


	}

}
