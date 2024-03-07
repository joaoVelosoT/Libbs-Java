package aula07_03;

public class Moto extends Veiculo {

	private boolean isPossuiPartidaEletrica;

	public Moto(String marca, String modelo, boolean isPossuiPartidaEletrica) {
		super(marca, modelo);
		this.isPossuiPartidaEletrica = isPossuiPartidaEletrica;
	}

	public boolean isPossuiPartidaEletrica() {
		return isPossuiPartidaEletrica;
	}

	public void setPossuiPartidaEletrica(boolean isPossuiPartidaEletrica) {
		this.isPossuiPartidaEletrica = isPossuiPartidaEletrica;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Partida eletrica: " + this.isPossuiPartidaEletrica);
	}

}
