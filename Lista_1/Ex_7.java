/**Escreva um sistema que l� os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.*/
package Lista_1;

import java.util.Scanner;

public class Ex_7 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		float a, b, c, d, e, f, x, y;
		System.out.println("Digite o valor de A: ");
		a = ler.nextFloat();
		System.out.println("Digite o valor de B: ");
		b = ler.nextFloat();
		System.out.println("Digite o valor de C: ");
		c = ler.nextFloat();
		System.out.println("Digite o valor de D: ");
		d = ler.nextFloat();
		System.out.println("Digite o valor de E: ");
		e = ler.nextFloat();
		System.out.println("Digite o valor de F: ");
		f = ler.nextFloat();
		x = ((c*e)-(b*f))/((a*e)-(b*d));
		y = ((a*f)-(c*d))/((a*e)-(b*d));
		System.out.println("X: "+x+" Y: "+y);
	}
}
