/**Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
package Lista_1;

import java.util.Scanner;

public class Ex_1 {
	public static void main(String args[])
	{
		int anos, mes, dia, res;
		Scanner ler = new Scanner(System.in);
		System.out.println("Quantos anos você tem: ");
		anos = ler.nextInt();
		System.out.println("Digite o mês: ");
		mes = ler.nextInt();
		System.out.println("Digite o dia: ");
		dia = ler.nextInt();
		res = (anos*365) + (mes*30) + dia;
		System.out.println("Sua idade em dias é: ");
		System.out.print(res);
	}
}
