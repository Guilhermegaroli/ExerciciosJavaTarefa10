/*9) Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo. 
 * A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., 
 * etc. Esta série se caracteriza pela soma de um termo atual com o seu anterior 
 * subseqüente, para que seja formado o próximo valor da seqüência. Portanto começando 
 * com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, 
 * o próximo 3+5=8, etc.*/

package tarefa10;

public class Exercicio9 {

	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;

		int proximo = 0;

		for (int i = 0; i < 15; i++) {
			if (i == 0) {
				System.out.println("1");
			} else {
				System.out.println("" + atual);
			}

			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
		}

	}

}
