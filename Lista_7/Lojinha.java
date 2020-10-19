package Lista_7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Lojinha {

	public static void main(String[] args) {
		Collection<Estoque> att = new ArrayList();
		Scanner ler = new Scanner(System.in);
		Set<Estoque> lista = new HashSet();
		Map<String, Estoque> org = new TreeMap<String,Estoque>();
		Estoque estoque = new Estoque(null, 0, 0);
		int ok = 1;
		int escolha;
		do {
		System.out.println("========================================");
		System.out.println("/          CONTROLE DE ESTOQUE         /");
		System.out.println("========================================");
		System.out.println("O que deseja fazer? Digite o codigo correspondente:\n \n(1)Adicionar itens ao estoque.\n(2)Remover itens do estoque.\n(3)Atualizar os itens do estoque.\n(4)Mostrar os itens do estoque.\n");
		escolha = ler.nextInt();
		switch(escolha)
		{
			case 1:	estoque.setItem();
					estoque.setQuantidade();
					estoque.setValor(); 
					Estoque item = new Estoque(estoque.getItem(),estoque.getQuantidade(),estoque.getValor());
					lista.add(item);
					org.put(estoque.getItem(), item);
					break;
					
			case 2: estoque.setItem();
					lista.remove(estoque.getItem());
					break;
					
			case 3: att = org.values();
					break;
						
		}		
		System.out.println("Deseja continuar? 1(s)/2(n)");
		ok = ler.nextInt();
		}while(ok==1);
		System.exit(0);
	}

}
