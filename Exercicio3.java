/*3) Apresentar o total da soma obtida dos cem primeiros números inteiros 
(1+2+3+4+...+98+99+100).*/

package tarefa10;

public class Exercicio3 {

	public static void main(String[] args) {
		int soma = 0, i = 0;

		System.out.print("O total da soma dos 100 primeiros números é: ");

		while (i <= 100) {
			soma += i;
			i++;

		}
		System.out.println(soma);

	}
}