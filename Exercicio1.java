/*1) Apresentar os quadrados dos números inteiros de 15 a 200.*/

package tarefa10;

public class Exercicio1 {

	public static void main(String[] args) {
		{
			int i, quadrado;
			for (i = 15; i <= 200; i++) {
				quadrado = i * i;
				System.out.println("O quadrado de " + i + " é " + quadrado);
			}

		}
	}
}
