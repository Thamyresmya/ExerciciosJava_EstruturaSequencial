/* 15.	Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 *  Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados
 *  11% para o Imposto de Renda,
 *  8% para o INSS
 *  5% para o sindicato,
 *  faça um programa que nos dê:
		a.	salário bruto.
		b.	quanto pagou ao INSS.
		c.	quanto pagou ao sindicato.
		d.	o salário líquido.
		e.	calcule os descontos e o salário líquido, conforme a tabela abaixo:
		f.	+ Salário Bruto : R$
		g.	- IR (11%) : R$
		h.	- INSS (8%) : R$
		i.	- Sindicato ( 5%) : R$
		= Salário Liquido : R$
		Obs.: Salário Bruto - Descontos = Salário Líquido. 
 */

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor que recebe por horas trabalhadas: ");
		double valorHora = scan.nextFloat();
		
		System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
		double horas = scan.nextFloat();
		
		double salarioBruto = valorHora * horas;
		double inss = salarioBruto * 0.08;
		double sindicato = salarioBruto * 0.05;
		double impostoRenda = salarioBruto * 0.11;
		double descontos = (inss + sindicato + impostoRenda);
		double salarioLiquido = salarioBruto - descontos;
	
		
		System.out.println("+ Salário Bruto : R$ " + salarioBruto);
		System.out.println("	- IR(11%) R$ " + impostoRenda);
		System.out.println("	- INSS (8% R$ " + inss);
		System.out.println("	- Sindicato (5%) " + sindicato);	
		System.out.println("Total descontos R$ " + descontos);
		System.out.println("= salario liquido R$ " + salarioLiquido);


	}

}
