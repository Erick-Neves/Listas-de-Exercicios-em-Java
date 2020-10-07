/**Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
calcule a seguinte expressão: D = (R + S)/2, onde R = (A+B)² e S = (B+C)²*/
package Lista_1;

import java.util.Scanner;

public class Ex_4 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, s, r;
		System.out.println("Digite o valor de A: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de B: ");
		b = ler.nextInt();
		System.out.println("Digite o valor de C: ");
		c = ler.nextInt();
		r = (a+b)*(a+b);
		s = (b+c)*(b+c);
		d = (r+s)/2;
		System.out.println("O resultado da expressão foi de: ");
		System.out.print(d);
	}
}
