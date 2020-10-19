package Lista_7;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Estoque {
	private String item="Batata";
	private int quantidade=0;
	private double valor= 2.3;
	private int verifica;
	Scanner ler = new Scanner(System.in);
	Set<Estoque> estoque = new HashSet<Estoque>();
			
	public Estoque(String item, int quantidade, int valor)
	{
		this.item = item;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public void Adicionar(Estoque e)
	{
		estoque.add(e);
	}
	public void MostraEstoque()
	{
		System.out.println("Temos os seguintes itens: \n");
		for(Estoque e: estoque)
		{
			System.out.println(e);
		}
	}
	public String getItem() {
		return item;
	}
	public void setItem() {
		System.out.println("Informe o nome do item: ");
		String item = ler.nextLine();
		this.item = item;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade() {
		System.out.println("Informe a quantidade do item: ");
		int quantidade = ler.nextInt();
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor() {
		System.out.println("Informe o valor do item: ");
		double valor = ler.nextDouble();
		this.valor = valor;
	}
	public int getVerifica() {
		return verifica;
	}
	public void setVerifica(int verifica) {
		this.verifica = verifica;
	}
	public Set<Estoque> getEstoque() {
		return estoque;
	}
	public void setEstoque(Set<Estoque> estoque) {
		this.estoque = estoque;
	}
}
