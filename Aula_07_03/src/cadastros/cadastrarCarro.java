package cadastros;

import java.util.ArrayList;
import java.util.Scanner;

import models.Carro;
import aula07_03.Veiculo;

public class cadastrarCarro {

	ArrayList<Carro> veiculos = new ArrayList<Carro>();
	Scanner sc = new Scanner(System.in);

	public void newCadastrarCarro() {

		String marca = "";
		String modelo = "";
		int numPortas = 0;
		String combustivel = "";

		// Inicio do input da marca e da verificacao
		boolean verificarMarca = false;
		while (verificarMarca == false) {
			System.out.println("Digite a marca do carro");
			try {
				marca = sc.nextLine();
				if (marca.length() == 0) {
					System.out.println("não deixe em branco");
				} else {
					verificarMarca = true;
				}
			} catch (Exception e) {

			}
		}

		boolean verificarModelo = false;
		while (verificarModelo == false) {

			System.out.println("Digite o modelo do carro");
			try {
				modelo = sc.nextLine();
				if (modelo.length() == 0) {
					System.out.println("não deixe em branco");
				} else {
					verificarModelo = true;
				}
			} catch (Exception e) {

			}

		}

		boolean verificarNumPortas = false;
		while(verificarNumPortas == false) {
			System.out.println("Digite quantas portas tem o carro");
			try {
				numPortas = sc.nextInt();
				if(numPortas < 1) {
					System.out.println("Não e possivel o carro ter menos de 1 porta");
				}else {
					verificarNumPortas = true;
				}
			} catch (Exception e) {
				System.out.println("Digite um valor numerico");
				sc.nextLine();
			}
			
		}
		
		boolean verificarCombustivel = false;
		while(verificarCombustivel == false) {
			sc.nextLine();
			System.out.println("Digite o tipo do combustivel");
			try {
				combustivel = sc.nextLine();
				if(combustivel.length() == 0) {
					System.out.println("Não deixe em branco");
					
				}else {
					verificarCombustivel = true;
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
	
		}
		
		Carro veic = new Carro(marca, modelo, numPortas, combustivel);
		veiculos.add(veic);
		System.out.println("Carro criado !!!");

	}

	public void exibirCarro() {
		veiculos.forEach(carrosCadastrados -> {
			carrosCadastrados.exibirInfo();
		});
	}
}
