/* Crie uma classe avião e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.*/
package Lista_5;

import java.util.Scanner;

public class Ex_2_objAviao {

	public static void main(String[] args) {
		int distancia, escolha;
		Scanner ler = new Scanner(System.in);
		Ex_2_Aviao viagem = new Ex_2_Aviao();
		System.out.println("====================================================");
		System.out.println("                  VIAGEM DE AVIÃO                   ");
		System.out.println("====================================================");
		System.out.println("Informe a distancia em KM: ");
		distancia = ler.nextInt();
		System.out.println("Informe a linha area- (1)Gol (2)Azul (3)Tam ");
		escolha = ler.nextInt();
		viagem.Previsao(distancia, escolha);
		viagem.Confirmacao();
	}

}
