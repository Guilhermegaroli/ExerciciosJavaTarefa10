/*7) Apresentar os resultados das potências de 3, variando do expoente 0 até o 
 * expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e elevado
 *  a 1 é ele próprio. Observe que neste exercício não pode ser utilizado o operador
 *   de exponenciação do portuguol (^).*/

package tarefa10;

public class Exercicio7 {

	public static void main(String[] args) {
		String total = "";
		int i;
		int n3 = 3;

		for (i = 1; i <= 15; i++) {
			n3 = n3 * 3;
			total = total + n3 + ",";
			System.out.println(total);
		}

	}

}
