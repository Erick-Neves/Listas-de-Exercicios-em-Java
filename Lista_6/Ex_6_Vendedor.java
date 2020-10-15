/*Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que será adicionado ao vencimento base do Vendedor).*/
package Lista_6;

import java.util.Scanner;

public class Ex_6_Vendedor extends Ex_1_Pessoa{
	private double valorVendas=0;
	private int itens;
	private int qntItem;
	private double comissao= 0.34;
	private double comissaoSoma;
	private double valorProduto;
	private String ok= "s";
	private String okItem= "s";
	private int codigoItem;
	Scanner ler = new Scanner(System.in);
	public Ex_6_Vendedor(String nome, String endereco, String telefone, double valorVendas, int itens, double comissao)
	{
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.itens = itens;
		this.comissao = comissao;
	}
	public void MostraFechamento()
	{
		System.out.println("====================================================");
		System.out.println("               	FECHAMENTO DE CAIXA                 ");
		System.out.println("====================================================");
		System.out.println("Atendente: "+getNome());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Vendeu hoje: "+getValorVendas());
		System.out.println("E recebeu comissão de: "+getComissaoSoma());
	}
	public void MostraItens()
	{
		System.out.println("====================================================");
		System.out.println("                VENDAS REALIZADAS                   ");
		System.out.println("====================================================");
		System.out.println("  1- Bolacha		2-Refrigerante      3-Arroz     ");
		System.out.println("  4- Salsicha		5-Pão               6-Chinelo   ");
		System.out.println("  7- Feijão             8-Nuggets           9-Shampoo   ");
		do
		{
			do
			{
			System.out.println("Informe o codigo do produto: ");
			this.codigoItem = ler.nextInt();
			if(codigoItem>=1 && codigoItem<=9)
			{
				switch(codigoItem)
				{
					case 1:	this.valorProduto=3; break;
					case 2:	this.valorProduto=5; break;
					case 3:	this.valorProduto=20; break;
					case 4:	this.valorProduto=15; break;
					case 5:	this.valorProduto=1; break;
					case 6:	this.valorProduto=16; break;
					case 7:	this.valorProduto=7; break;
					case 8:	this.valorProduto=12; break;
					case 9:	this.valorProduto=25; break;
					default: this.valorProduto=0;
				}
				okItem="s";
			}
			else
			{
				System.out.println("Código inválido!");
				okItem="n";
			}
			}while(okItem=="n");
			System.out.println("Informe a quantidade do produto: ");
			this.qntItem = ler.nextInt();
			this.valorVendas += valorProduto*qntItem;
			this.comissaoSoma+= valorProduto*comissao;
			System.out.println("Deseja continuar adicionando itens? (s/n)");
			this.ok = ler.next();
		}while(ok=="s" || ok=="S");
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public int getItens() {
		return itens;
	}
	public void setItens(int itens) {
		this.itens = itens;
	}
	public int getQntItem() {
		return qntItem;
	}
	public void setQntItem(int qntItem) {
		this.qntItem = qntItem;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getValorProduto() {
		return valorProduto;
	}
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	public String getOk() {
		return ok;
	}
	public void setOk(String ok) {
		this.ok = ok;
	}
	public String getOkItem() {
		return okItem;
	}
	public void setOkItem(String okItem) {
		this.okItem = okItem;
	}
	public int getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	public Scanner getLer() {
		return ler;
	}
	public void setLer(Scanner ler) {
		this.ler = ler;
	}
	public double getComissaoSoma() {
		return comissaoSoma;
	}
	public void setComissaoSoma(double comissaoSoma) {
		this.comissaoSoma = comissaoSoma;
	}
	
}
