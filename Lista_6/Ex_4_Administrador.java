/*Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias).*/
package Lista_6;

import java.util.Scanner;

public class Ex_4_Administrador extends Ex_1_Pessoa{
	private double estadia;
	private double ajudaDeCusto;
	private double voo;
	Scanner ler = new Scanner(System.in);
	public Ex_4_Administrador(String nome, String endereco, String telefone, double estadia, double voo) {
		super(nome, endereco, telefone);
		this.estadia = estadia;
		this.voo = voo;
	}
	public double AjudaDeCusto()
	{
		System.out.println("Qual o valor do vôo escolhida: ");
		voo = ler.nextDouble();
		System.out.println("Qual o valor da hospedagem escolhida: ");
		estadia = ler.nextDouble();
		ajudaDeCusto = estadia + voo;
		return ajudaDeCusto;
	}
	public void MostraAjuda()
	{
		System.out.println("====================================================");
		System.out.println("              	    ADMINISTRADOR                   ");
		System.out.println("====================================================");
		System.out.println("Nome: "+getNome());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("Solicita ajuda de custo de: "+getAjudaDeCusto());
	}
	public double getEstadia() {
		return estadia;
	}
	public void setEstadia(double estadia) {
		this.estadia = estadia;
	}
	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	public double getVoo() {
		return voo;
	}
	public void setVoo(double voo) {
		this.voo = voo;
	}
	
}
