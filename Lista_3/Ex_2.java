/**Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.*/
package Lista_3;

import java.util.Scanner;

public class Ex_2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float num;
		int pares=0, impares=0;
		for(int x=0;x<10;x++)
		{
			System.out.println("Digite o valor "+(x+1)+"�:");
			num = ler.nextFloat();
			if(num%2 == 0)
			{
				pares++;
			}
			else
			{
				impares++;
			}
		}
		System.out.println("Pares: "+pares+" �mpares: "+impares);
	}

}
