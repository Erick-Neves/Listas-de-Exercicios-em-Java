/**Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
package Lista_1;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int anos, mes, dia, idade;
		System.out.println("Digite sua idade em dias: ");
		idade = ler.nextInt();
		anos = idade/365;
		mes = idade/30;
		dia = idade;
		System.out.printf("Sua idade em anos é: %d",anos);
		System.out.printf("\nSua idade em meses é: %d",mes);
		System.out.printf("\nSua idade em dias é: %d",dia);
	}
}
