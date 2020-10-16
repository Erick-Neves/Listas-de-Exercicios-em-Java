package Lista_7;

public class Main {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Salsicha", 9, "Au au!", "corre até bem");
		Cavalo cav = new Cavalo("Jebinha", 15,"Iiiiiiirrrrí","corre demaaaaais!");
		Preguica pre = new Preguica("Pancham", 5, "Iiiíííííí(*assovio*)", "escala árvores");
		dog.Mostra();
		cav.Mostra();
		pre.Mostra();
	}

}
