package Lista_5;

import java.util.Scanner;

public class Ex_1_Cliente {
	public String primeiroNome;
	public String meioNome;
	public String ultimoNome;
	public int idade;
	public int sexo;
	public String eSex;
	public String nomeCompleto;
	Scanner ler = new Scanner(System.in);
	public String Cadastro()
	{
		System.out.println("====================================================");
		System.out.println("               CADASTRO DE CLIENTES                 ");
		System.out.println("====================================================");
		System.out.println("Informe seu primeiro nome: ");
		primeiroNome = ler.nextLine();
		System.out.println("Informe seus nomes do meio: ");
		meioNome = ler.nextLine();
		System.out.println("Informe seu ultimo nome: ");
		ultimoNome = ler.nextLine();
		do {
		System.out.println("Informe sua idade: ");
		idade = ler.nextInt();
		if(idade<=0)
		{
		System.out.println("Idade inválida!");
		}
		}while(idade<=0);
		do {
		System.out.println("Escolha seu sexo- (1)Masculino (2)Feminino (3)Não-binário: ");
		sexo = ler.nextInt();
		switch(sexo)
			{
				case 1: eSex = "Masculino"; break;
				case 2: eSex = "Feminino"; break;
				case 3: eSex = "Não-binário"; break;
				default: System.out.println("Valor inválido!");
			}
		}while(sexo<=0 && sexo>=3);
		this.nomeCompleto = primeiroNome+" "+meioNome+" "+ultimoNome;
		return nomeCompleto; 
	}
	void LimpaConsole()
	{
		for(int x=0; x<=20;x++)
		{
			System.out.println("\n");
		}
	}
	void Mostra()
	{
		System.out.println("====================================================");
		System.out.println("                     CADASTRADO                     ");
		System.out.println("====================================================");
		System.out.println("Nome completo: "+nomeCompleto);
		System.out.println("Idade: "+idade);
		System.out.println("Sexo: "+eSex);
	}

}
