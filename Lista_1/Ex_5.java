/**Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.*/
package Lista_1;

import java.util.Scanner;

public class Ex_5 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		float n1, n2, n3, media;
		System.out.println("Digite a nota 1: ");
		n1 = ler.nextFloat();
		System.out.println("Digite a nota 2: ");
		n2 = ler.nextFloat();
		System.out.println("Digite a nota 3: ");
		n3 = ler.nextFloat();
		media = ((n1*2) + (n2*3) + (n3*5))/10;
		System.out.println("A m�dia foi de: ");
		System.out.print(media);
	}
}
