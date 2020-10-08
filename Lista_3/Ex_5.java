/**Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
package Lista_3;

import java.util.Scanner;

public class Ex_5 {
	public static void main(String args[])
	{
		int num=0, soma=0;
		Scanner ler = new Scanner(System.in);
		do
		{
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			soma = soma + num;
		}while(num!=0);
		System.out.println("O resultado da soma foi de: "+soma);
	}
}
