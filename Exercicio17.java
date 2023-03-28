/* 17.	Faça um Programa para uma loja de tintas. 
 * 		O programa deverá pedir o tamanho em metros quadrados da áreaa ser pintada. 
 *  	Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados
 *  	e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00
 *   	ou em galões de 3,6 litros, que custam R$ 25,00.
			o	Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
			o	comprar apenas latas de 18 litros;
			o	comprar apenas galões de 3,6 litros;
			o	misturar latas e galões, de forma que o desperdício de tinta seja menor. 
			o	Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
 */

package ExerciciosJava_EstruturaSequencial;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da área (m2): ");
		double area = scan.nextDouble();
		
		double litrosArea = area / 6; 
		double litros = litrosArea + (litrosArea * 0.10); 
		double qtdLataTinta = (litros / 18);
		double qtdGalaoTinta = litros / 3.6;
	
		
		if(qtdLataTinta % 18 != 0) {
			qtdLataTinta = (int) qtdLataTinta + 1;		
        }
		double precoLata = qtdLataTinta * 80;
		System.out.println("======== LATA DE TINTA =========");		
        System.out.println("Total de " + qtdLataTinta + " Lata de Tinta de 18L ");
        System.out.println("Total a pagar: R$ " + precoLata);  
        System.out.println("================================");		
		
		System.out.println("");
		
		if (qtdGalaoTinta % 3.6 !=0) {
			qtdGalaoTinta = (int)  qtdGalaoTinta + 1;			
        }		
		double precoGalao = qtdGalaoTinta * 25;
		System.out.println("======== GALÃO DE TINTA ========");
        System.out.println("Total de " + qtdGalaoTinta + " Galão de Tinta de 3,6L ");
        System.out.println("Total a pagar: R$ " + precoGalao);
        System.out.println("================================");

		System.out.println("");	
		
		int misturaLata = (int) litros / 18;
		int misturaGalão = (int)((litros - (misturaLata * 18)) / 3.6);		

		if(litros - (misturaLata * 18) % 3.6 != 0) {
				misturaGalão += 1;
		}		
		
		double valorTotalMistura = (misturaGalão * 25) + (misturaLata * 80);   
		
		System.out.println("====== MISTURA DE LATA + GALÃO DE TINTA =======");
		System.out.println("Mistura de " + misturaLata + " latas e " + misturaGalão + " galão de tintas");
		System.out.println("Total a pagar da Mistura de " + valorTotalMistura);
		System.out.println("===============================================");

	}
}
