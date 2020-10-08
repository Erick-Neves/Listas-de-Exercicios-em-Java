/**Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
package Lista_3;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		int idade, sexo, opcao, x=0, pCalma=0, mNervosa=0, hAgressivo=0, oCalmo=0, n40=0, c18=0;
		Scanner ler = new Scanner(System.in);
		while(x <= 2)
		{
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();
			System.out.println("Informe o codigo do sexo[1-feminino 2-masculino 3-outros]: ");
			sexo = ler.nextInt();
			System.out.println("Informe o codigo da opcão[1-calma(o) 2-nervosa(o) 3-agressiva(o)]: ");
			opcao = ler.nextInt();
			if(opcao == 1)
			{
				pCalma++;
			}
			else if(sexo==1 && opcao==2)
			{
				mNervosa++;
			}
			else if(sexo==2 && opcao==3)
			{
				hAgressivo++;
			}
			else if(sexo==3 && opcao==1)
			{
				oCalmo++;
			}
			else if(idade>40 && opcao==2)
			{
				n40++;
			}
			else if(idade<18 && opcao==1)
			{
				c18++;
			}
			x++;
		}
		System.out.println("Numero de pessoas calmas: "+pCalma);
		System.out.println("Numero de mulheres nervosas: "+mNervosa);
		System.out.println("Numero de homens agressivos: "+hAgressivo);
		System.out.println("Numero de outros calmos: "+oCalmo);
		System.out.println("Numero de pessoas nervosas com mais de 40 anos: "+n40);
		System.out.println("Numero de pessoas calmas com menos de 18 anos: "+c18);
	}

}
