package sistema;
import java.util.ArrayList;
import java.util.Scanner;

import aula07_03.Veiculo;
import cadastros.cadastrarCarro;
import cadastros.cadastrarMoto;

public class Sistema {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

		cadastrarCarro cadastrarCarro = new cadastrarCarro();
		cadastrarMoto cadastrarMoto = new cadastrarMoto();

		do {
			int escolha = 0;
			menu();
			try {
				 escolha = sc.nextInt();	
			} catch (Exception e) {
				sc.nextLine();
			}
			

			switch (escolha) {
			case 1: {
				cadastrarCarro.newCadastrarCarro();
				continue;
			}
			case 2: {
				cadastrarMoto.newCadastrarMoto();
				continue;
			}
			case 3: {
				cadastrarCarro.exibirCarro();
				System.out.println("");
				cadastrarMoto.exibirMoto();
				continue;
			}
			}
		} while (true);

	}

	public static void menu() {
		System.out.println("Criar Veiculo ----------------");
		System.out.println("1- Criar Carro");
		System.out.println("2- Criar Moto");
		System.out.println("3- Listar Veiculos");
	}
}
