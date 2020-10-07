/**Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
package Lista_1;

import java.util.Scanner;

public class Ex_3 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		int tempo, min, seg, hora, minutosTotal;
		System.out.println("Tempo de duração do evento em segundos: ");
		tempo = ler.nextInt();
		minutosTotal = tempo/60;
		hora = minutosTotal/60;
		min = ((hora*60)-minutosTotal)*-1;
		seg = ((minutosTotal*60)-tempo)*-1;
		System.out.printf("Horas: %d ",hora);
		System.out.printf("Minutos: %d ",min);
		System.out.printf("Segundos: %d",seg);
	}
}
