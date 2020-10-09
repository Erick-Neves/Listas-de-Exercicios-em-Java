package Lista_4;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		Scanner ler = new
		int l,c,cont;
		float[][] matriz = new float[3][3];
		for(l=0 ; l<3 ; l++ );
		{
			for(c=0 ; c<3 ; c++)
			{
				System.out.println("Insira o valor da posição ["+l+"] ["+c+"]");
				matriz[l][c]= ler.nextFloat(System.in);
			}
		}
		for(l=0 ; l<3 ; l++ );
		{
			for(c=0 ; c<3 ; c++)
			{
				if(matriz[l][c]>10)
				{
					System.out.println(matriz[l][c]);
					cont++;					
				}
			}
		}
		System.out.println("A quantidades de valores maiores que 10 foi de: "+cont);
	}

}
