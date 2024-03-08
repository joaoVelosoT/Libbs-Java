package aula07_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		//Carro carro01 = new Carro("gol", "golf", 214, "gasolina");
		//Moto moto01 = new Moto("cg", "honda", true);

		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

		do {
			int escolha = 0;
			menu();
			try {
				escolha = sc.nextInt();
			} catch (Exception e) {
				System.out.println("escreva numeros");
				sc.nextLine();
			}

			switch (escolha) {
			case 1: {
				sc.nextLine();
				
				System.out.println("Digite a marca do carro");
				String marca = sc.nextLine();

				System.out.println("Digite o modelo do carro");
				String modelo = sc.nextLine();

				System.out.println("Digite quantas portas tem o carro");
				int numPortas = sc.nextInt();

				System.out.println("Digite o tipo do combustivel");
				String combustivel = sc.nextLine();

				Carro veic = new Carro(marca, modelo, numPortas, combustivel);
				veiculos.add(veic);
				System.out.println("Carro criado !!!");

				continue;
			}

			case 2: {
				sc.nextLine();
				System.out.println("Digite a marca da moto");
				String marcaMoto = sc.nextLine();

				System.out.println("Digite o modelo da moto");
				String modeloMoto = sc.nextLine();

				System.out.println("Possui partida eletrica? ");
				boolean partidaEletrica = sc.nextBoolean();

				Moto motoc = new Moto(marcaMoto, modeloMoto, partidaEletrica);
				veiculos.add(motoc);

				System.out.println("Moto criada !!!");
				continue;
			}
			case 3: {
				veiculos.forEach(veiculos2 -> {
					veiculos2.exibirInfo();
					System.out.println("");
				});
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
