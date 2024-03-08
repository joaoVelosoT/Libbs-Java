package cadastros;

import java.util.ArrayList;
import java.util.Scanner;

import aula07_03.Moto;
import aula07_03.Veiculo;

public class cadastrarMoto {

	ArrayList<Moto> veiculos = new ArrayList<Moto>();
	Scanner sc = new Scanner(System.in);

	public void newCadastrarMoto() {

		String marcaMoto = "";
		String modeloMoto = "";
		int numPortasMoto = 0;
		String combustivelMoto = "";

		boolean verificarMarcaMoto = false;
		while (verificarMarcaMoto == false) {
			System.out.println("Digite a marca da moto");
			try {
				marcaMoto = sc.nextLine();
				if (marcaMoto.length() == 0) {
					System.out.println("não deixe em branco");
				} else {
					verificarMarcaMoto = true;
				}
			} catch (Exception e) {

			}
		}

		boolean verificarModeloMoto = false;
		while (verificarModeloMoto == false) {

			System.out.println("Digite o modelo da moto");
			try {
				modeloMoto = sc.nextLine();
				if (modeloMoto.length() == 0) {
					System.out.println("não deixe em branco");
				} else {
					verificarModeloMoto = true;
				}
			} catch (Exception e) {

			}

		}
		boolean partidaEletrica = false;
		boolean verificarPartidaEletrica = false ;
		while(verificarPartidaEletrica == false) {
			System.out.println("Possui partida eletrica? ");
			try {
				partidaEletrica = sc.nextBoolean();
				verificarPartidaEletrica = true;
			} catch (Exception e) {
				System.out.println("Digite true ou falso");
				sc.nextLine();
			}
			 }
		
		

		Moto motoc = new Moto(marcaMoto, modeloMoto, partidaEletrica);
		veiculos.add(motoc);

		System.out.println("Moto criada !!!");
	}

	public void exibirMoto() {
		veiculos.forEach(motosCadastradas -> {
			motosCadastradas.exibirInfo();
		});
	}
}
