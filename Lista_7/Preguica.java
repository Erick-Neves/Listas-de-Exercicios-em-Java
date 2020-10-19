/*Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio
anterior e invoque o m�todo que emite o som de cada um de forma polim�rfica, isto
�, independente do tipo de animal.*/
package Lista_7;

public class Preguica extends Animal {
	private String mov;	
	public Preguica(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
	}
	public String getAcao()
	{
		return this.mov = "A pregui�a "+super.getAcao()+" !";
	}
	public void Mostra()
	{
		System.out.println("====================================================");
		System.out.println("|                     PREGUI�A                     |");
		System.out.println("====================================================");
		System.out.println("Nome: "+super.getNome());
		System.out.println("Idade: "+super.getIdade());
		System.out.println("Som: "+super.getSom());
		System.out.println("A��o: "+this.getAcao());
	}
}
