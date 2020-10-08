/**Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
package Lista_3;

import java.util.Scanner;

public class Ex_6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num, media=0, cont=0, soma=0;
		do
		{
			System.out.println("Digite um valor inteiro: ");
			num = ler.nextInt();
			if(num%3==0)
			{
				soma = soma + num;
				cont++;
			}
		}while(num!=0);
		media = soma/cont;
		System.out.println("A media dos numeros foi de: "+media);
	}

}
