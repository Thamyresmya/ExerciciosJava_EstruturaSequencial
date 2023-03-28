// 8.	Faça um Programa que pergunte quanto você ganha por hora e o 
// número de horas trabalhadas no mês. Calcule e mostre o total do 
// seu salário no referido mês.

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que recebe por horas trabalhadas: ");
		float valorHora = scan.nextFloat();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		float horas = scan.nextFloat();
		
		System.out.println("O total do seu salário no referido mês é R$ " + (valorHora * horas));	
		

	}

}
