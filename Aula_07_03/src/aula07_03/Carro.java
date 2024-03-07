package aula07_03;

public class Carro extends Veiculo {

	private int numPortas;
	private String tipoCombustivel;

	public Carro(String marca, String modelo, int numPortas, String tipoCombustivel) {
		super(marca, modelo);
		this.numPortas = numPortas;
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Num Portas: " + this.getNumPortas());
		System.out.println("Combustivel: " + this.getTipoCombustivel());
	}

}
