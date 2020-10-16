package Lista_7;

public class Cachorro extends Animal{
	private String mov;	
	public Cachorro(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
	}
	public String getAcao()
	{
		return this.mov = "O cachorro "+super.getAcao()+" !";
	}
	public void Mostra()
	{
		System.out.println("====================================================");
		System.out.println("|                     CACHORRO                     |");
		System.out.println("====================================================");
		System.out.println("Nome: "+super.getNome());
		System.out.println("Idade: "+super.getIdade());
		System.out.println("Som: "+super.getSom());
		System.out.println("Ação: "+this.getAcao());
	}
}
