package poo.model;

public class Quadrado {
	// DEFINIR OS ATRIBUTOS

	private int altura;
	private int largura;
	private String simbolo;

	// DEFINIR OS CONSTRUTORES

	public Quadrado() {
		this.altura = 5;
		this.largura = 5;
		this.simbolo = "Q";
	}

	public Quadrado(int altura, int largura, String simbolo) {
		this.altura = altura;
		this.largura = largura;
		this.simbolo = simbolo;

	}

	// TODO DEFINIR OS GETTERS AND SETTERS
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getLargura() {
		return largura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	

	// DEFINIR O MÉTODO DESENHAR QUE RETORNA UMA STRING

	public String desenhar() {
		StringBuilder desenho = new StringBuilder();
		desenho.append(toString());
		for (int linha = 1; linha <= altura; linha++) {
			for (int coluna = 1; coluna <= largura; coluna++) {
				desenho.append(simbolo + " ");
			}
			desenho.append("\n");
		}
		return desenho.toString();
	}



	// DEFINIR O METODO toString
	public String toString() {
		return getClass().getSimpleName() + "(" + getAltura() + " x " + getLargura() + ")";
	}

}
