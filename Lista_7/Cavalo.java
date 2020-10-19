/*Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.*/
package Lista_7;

public class Cavalo extends Animal{
	private String mov;	
	public Cavalo(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
	}
	public String getAcao()
	{
		return this.mov = "O cavalo "+super.getAcao()+" !";
	}
	public void Mostra()
	{
		System.out.println("====================================================");
		System.out.println("|                      CAVALO                      |");
		System.out.println("====================================================");
		System.out.println("Nome: "+super.getNome());
		System.out.println("Idade: "+super.getIdade());
		System.out.println("Som: "+super.getSom());
		System.out.println("Ação: "+this.getAcao());
	}

}
