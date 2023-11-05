package caminhao;

public class CaminhaoBau extends Caminhao{

	private int volume;
	private float comprimento;
	private float largura;
	private float altura;
	
	public CaminhaoBau(int nrCaminhao, String modelo, int anoFabricacao, int capacidadeTotal, char unidade,
			float comprimento, float largura, float altura) {
		super(nrCaminhao, modelo, anoFabricacao, capacidadeTotal, 'T');
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
		calculaVolume();
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getVolume() {
		return volume;
	}
	
	public void carregaBau(float qtdeQuilos) {
		this.cargaAtual += (qtdeQuilos/1000);
	}
	
	public void descarregaBau(float qtdeQuilos) {
		this.cargaAtual -= (qtdeQuilos/1000);
	}
	
	public void calculaVolume() {
	 this.volume =(int) (this.comprimento * this.largura * this.altura);
	}
}
