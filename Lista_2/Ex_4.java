/**Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
package Lista_2;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		double valor, res;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor: ");
		valor = ler.nextDouble();
		if(valor%2==0)
		{
			res = Math.sqrt(valor);
			System.out.println("O valor: "+valor+" e seu sua raiz quadrada: "+res);
		}
		else
		{
			res = Math.pow(valor, 2);
			System.out.println("O valor: "+valor+" e seu quadrado: "+res);
		}
	}

}
