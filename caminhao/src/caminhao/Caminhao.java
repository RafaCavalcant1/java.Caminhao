package caminhao;

public abstract class Caminhao {

	private int nrCaminhao;
	private String modelo;
	private int anoFabricacao;
	private int capacidadeTotal;
	protected float cargaAtual;
	private char unidade;
	
	public Caminhao(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade) {
		this.nrCaminhao = nrCaminhao;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.capacidadeTotal = capacidadeTotal;
		this.unidade = unidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getCapacidadeTotal() {
		return capacidadeTotal;
	}

	public void setCapacidadeTotal(int capacidadeTotal) {
		this.capacidadeTotal = capacidadeTotal;
	}

	public int getNrCaminhao() {
		return nrCaminhao;
	}

	public float getCargaAtual() {
		return cargaAtual;
	}

	public char getUnidade() {
		return unidade;
	}
	
	
}

