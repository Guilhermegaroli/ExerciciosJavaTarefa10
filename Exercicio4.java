/*4) Elaborar um programa que apresente no final o somatório dos valores pares 
 * existentes na faixa de 1 até 500.*/

package tarefa10;

public class Exercicio4 {

	public static void main(String[] args) {

		int soma = 0;
		int i = 2;
		while (i <= 500) {
			soma = soma + i;
			i += 2;
		}
		System.out.println(soma);
	}

}
