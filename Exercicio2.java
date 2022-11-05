/*2) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número 
 * qualquer.*/

package tarefa10;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int entrada;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		entrada = sc.nextInt();

		int multiplicador = 0;
		while (multiplicador <= 10) {
			int resultado = entrada * multiplicador;
			System.out.println(resultado);
			multiplicador++;
			sc.close();
		}
	}

}
