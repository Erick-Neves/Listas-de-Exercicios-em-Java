/**Faça um programa que receba três inteiros e diga qual deles é o maior.*/
package Lista_2;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		int n1, n2, n3;
		Scanner ler =  new Scanner(System.in);
		System.out.println("Digite o valor 1: ");
		n1 = ler.nextInt();
		System.out.println("Digite o valor 2: ");
		n2 = ler.nextInt();
		System.out.println("Digite o valor 3: ");
		n3 = ler.nextInt();
		if(n1!=n2 && n1!=n3)
		{
			if(n1>n2 && n1>n3)
			{
				System.out.println("O maior valor foi: "+n1);
			}
		}
		else if(n2!=n1 && n2!=n3)
		{
			if(n2>n1 && n2>n3)
			{
				System.out.println("O maior valor foi: "+n2);
			}
		}
		else if(n3!=n2 && n3!=n1)
		{
			if(n3>n2 && n3>n1)
			{
				System.out.println("O maior valor foi: "+n3);
			}
		}
		else
		{
			System.out.println("Valor inválido!");
		}
	}

}
