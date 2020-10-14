package Lista_5;

import java.util.Scanner;

public class Ex_2_Aviao {
	double previsao;
	double gol = 150, azul = 160, tam= 170;
	Scanner ler = new Scanner(System.in);
	
	
	void Previsao(int espaco, int linha)
	{
		switch(linha)
		{
		   	case 1: previsao = espaco/gol; break;
		   	case 2: previsao = espaco/azul; break;
		   	case 3: previsao = espaco/tam; break;
		}
		System.out.println("Você chegará em "+previsao+" horas!");
	}
	
	void Confirmacao()
	{
		System.out.println("Você concorda com o tempo previsto? (s/n)");
		String conf = ler.nextLine();
		if(conf == "s" || conf == "S")
		{
			System.out.println("Boa viagem!");
		}
	}
}
