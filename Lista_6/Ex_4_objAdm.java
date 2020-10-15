package Lista_6;

import java.util.Scanner;

public class Ex_4_objAdm {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double estadia = 0;
		Ex_4_Administrador adm = new Ex_4_Administrador(null, null, null, 0, 0);
		adm.setNome("Erick Neves");
		adm.setEndereco("Rua Santa Teresa, onde a felicidade habita!");
		adm.setTelefone("11 4002-8922");
		adm.AjudaDeCusto();
		adm.MostraAjuda();
	}

}
