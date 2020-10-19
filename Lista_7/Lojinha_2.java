package Lista_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Lojinha_2 {

	public static void main(String[] args) {
		int ok = 1;
		int escolha = 0;
		Scanner ler = new Scanner(System.in);
		Collection<Estoque> estoque = new ArrayList();
		Map<String,Estoque> mapa = new TreeMap<String,Estoque>();
		Estoque item1 = new Estoque("Shampoo", 2, 23);
		Estoque item2 = new Estoque("Bolacha", 2, 23);
		Estoque item3 = new Estoque("Salgadinho", 2, 23);
		Estoque item4 = new Estoque("Escova", 2, 23);
		Estoque item5 = new Estoque("Refrigerante", 2, 23);
		Estoque item = new Estoque(null, escolha, escolha);
		mapa.put("Shampoo", item1);
		mapa.put("Bolacha", item2);
		mapa.put("Salgadinho", item3);
		mapa.put("Escova", item4);
		mapa.put("Refrigerante", item5);
		
		do {
		System.out.println("========================================");
		System.out.println("/          CONTROLE DE ESTOQUE         /");
		System.out.println("========================================");
		System.out.println("O que deseja fazer? Digite o codigo correspondente:\n \n(1)Adicionar itens ao estoque.\n(2)Remover itens do estoque.\n(3)Atualizar os itens do estoque.\n(4)Mostrar os itens do estoque.\n");
		escolha = ler.nextInt();
		switch(escolha)
		{
			case 1:	item.setItem();
					item.setQuantidade();
					item.setValor();
					mapa.put(item.getItem(), item);					
					break;
					
			case 2: item.setItem();
					mapa.remove(item.getItem());
					break;
					
			case 3: estoque = mapa.values();
					for(Estoque e : estoque)
					{
						System.out.println(e);
					}
					break;
			
			case 4: for(Estoque e : estoque)
					{
						System.out.println(e);
					}
					break;
			default: System.out.println("Opção inválida!");	
		}		
		System.out.println("Deseja continuar? 1(s)/2(n)");
		ok = ler.nextInt();
		}while(ok==1);
		System.exit(0);

	}

}
