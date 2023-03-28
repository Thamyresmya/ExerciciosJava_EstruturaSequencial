// 9.	Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius.
// o	C = 5 * ((F-32) / 9).


package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus Fahrenheit: ");
		float graus = scan.nextFloat();
		
		float resultado = 5 * ((graus-32) / 9);
		System.out.println("A temperatura em graus Celsius é: " + resultado + "ºC");

	}

}
