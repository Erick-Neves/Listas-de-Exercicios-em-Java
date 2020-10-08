/**Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/
package Lista_3;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		int m21=0, m50=0;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma idade: ");
		int idade = ler.nextInt();
		while(idade!=-99)
		{
			if(idade<21)
			{
				m21++;
			}
			else if(idade>50)
			{
				m50++;
			}
			System.out.println("\nDigite uma idade: ");
			idade = ler.nextInt();
		}
		System.out.println("O total de pessoas menores de 21 anos: "+m21);
		System.out.println("O total de pessoas menores de 50 anos: "+m50);
	}

}
