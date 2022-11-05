/*8) Elaborar um programa que apresente como resultado o valor de uma potência de uma 
 * base qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da
 *  base e E o valor do expoente. Observe que neste exercício não pode ser utilizado 
 *  o operador de exponenciação do portuguol (^).*/

package tarefa10;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base, expoente, calculo = 1;
		System.out.println("Digite a base:");
		base = sc.nextInt();
		System.out.println("Digite o expoente:");
		expoente = sc.nextInt();
		while (expoente != 0) {
			calculo = base * calculo;
			expoente--;
		}
		System.out.println(calculo);
		sc.close();
	}

}
