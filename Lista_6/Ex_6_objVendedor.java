package Lista_6;

public class Ex_6_objVendedor {

	public static void main(String[] args) {
		Ex_6_Vendedor Erick = new Ex_6_Vendedor(null, null, null, 0, 0, 0);
		Erick.setNome("Erick Neves");
		Erick.setEndereco("Rua Santa Teresa, onde a felicidade habita!");
		Erick.setTelefone("11 4002-8922");
		Erick.setComissao(0.34);
		Erick.MostraItens();
		Erick.MostraFechamento();
	}

}
