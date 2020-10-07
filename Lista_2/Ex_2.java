/*Faça um programa que entre com três números e coloque em ordem crescente.*/
package Lista_2;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		float n1, n2, n3;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor 1: ");
		n1 = ler.nextFloat();
		System.out.println("Digite o valor 2: ");
		n2 = ler.nextFloat();
		System.out.println("Digite o valor 3: ");
		n3 = ler.nextFloat();
		if(n1>n2 && n2>n3)
		{
			System.out.println("Ordem crescente: "+n3+" "+n2+" "+n1);
		}
		else if(n1>=n3 && n3>=n2)
		{
			System.out.println("Ordem crescente: "+n2+" "+n3+" "+n1);
		}
		else if(n2>=n1 && n1>=n3)
		{
			System.out.println("Ordem crescente: "+n3+" "+n1+" "+n2);
		}
		else if(n2>=n3 && n3>=n1)
		{
			System.out.println("Ordem crescente: "+n1+" "+n3+" "+n2);
		}
		else if(n3>=n1 && n1>=n2)
		{
			System.out.println("Ordem crescente: "+n2+" "+n1+" "+n3);
		}
		else if(n3>=n2 && n2>=n1)
		{
			System.out.println("Ordem crescente: "+n1+" "+n2+" "+n3);
		}
		else
		{
			System.out.println("Valor invalido!");
		}
	}

}
