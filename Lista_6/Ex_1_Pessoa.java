/*Cria uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores
(getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas
opções de construtores conforme sua percepção. Atributos: String nome; String endereço;
String telefone;*/
package Lista_6;

public class Ex_1_Pessoa {
	 private String nome;
	 private String endereco;
	 private String telefone;
	 
	public Ex_1_Pessoa(String nome, String endereco, String telefone)
	{
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	 
	public void Mostra()
	{
		System.out.println("====================================================");
		System.out.println("              	 USUÁRIO CADASTRADO                 ");
		System.out.println("====================================================");
		System.out.println("Nome: "+this.nome);
		System.out.println("Endereço: "+this.endereco);
		System.out.println("Telefone: "+this.telefone);
	}
}
