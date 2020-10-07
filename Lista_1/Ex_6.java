/**Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles.*/
package Lista_1;

import java.util.Scanner;

public class Ex_6 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float y1, y2, x1, x2;
		double res, d;
		System.out.println("Digite o valor de x1: ");
		x1 = ler.nextFloat();
		System.out.println("Digite o valor de x2: ");
		x2 = ler.nextFloat();
		System.out.println("Digite o valor de y1: ");
		y1 = ler.nextFloat();
		System.out.println("Digite o valor de y2: ");
		y2 = ler.nextFloat();
		res = (Math.pow(x2-x1,2))+(Math.pow(y2-y1,2));
		d = Math.sqrt(res);
		System.out.println("O resultado foi de: "+d);
	}
}
