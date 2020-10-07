/**O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
consumidor.*/
package Lista_1;

import java.util.Scanner;

public class Ex_8 {
	public static void main(String args[])
	{
		Scanner ler = new Scanner(System.in);
		double imposto, distribuidor, custoFabrica, custoConsumidor;
		System.out.println("Informe o custo de fabrica: ");
		custoFabrica = ler.nextFloat();
		imposto = custoFabrica*0.45;
		distribuidor = custoFabrica*0.28;
		custoConsumidor = custoFabrica+imposto+distribuidor;
		System.out.println("Custo do Consumidor: "+custoConsumidor);
	}
}
