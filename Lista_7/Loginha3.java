package Lista_7;

import java.util.ArrayList;
import java.util.Collection;

public class Loginha3 {
	public static void main(String args[])
	{
		Collection<Estoque> estoque = new ArrayList();
		Estoque item1 = new Estoque("Shampoo", 2, 23);
		Estoque item2 = new Estoque("Bolacha", 2, 23);
		Estoque item3 = new Estoque("Salgadinho", 2, 23);
		Estoque item4 = new Estoque("Escova", 2, 23);
		Estoque item5 = new Estoque("Refrigerante", 2, 23);
		estoque.add(item1);
		for(Estoque e : estoque)
		{
			System.out.println(e);
		}
	}
}
