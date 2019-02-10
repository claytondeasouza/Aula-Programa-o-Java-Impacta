package logico;

public class FiguraLogico_V2 {
	
	public static void main(String[] args) {
		FiguraLogico_V2 f = new FiguraLogico_V2();
		System.out.println(f.desenharQuadrado("Q", 10, 10));
		System.out.println(f.desenharRetangulo("#", 5, 9));
		System.out.println(f.desenharTriangulo("@", 5, 9));
	}
	
	public String desenharQuadrado(String simbolo, int altura, int largura) {
		StringBuilder desenho = new StringBuilder();
		desenho.append("Quadrado("+altura+" x "+largura+")\n");
		for (int linha = 1; linha <= altura; linha++) {
			for (int coluna = 1; coluna <= largura; coluna++) {
				desenho.append(simbolo + " ");
			}
			desenho.append("\n");
		}
		return desenho.toString();
	}
	
	public String desenharRetangulo(String simbolo, int altura, int largura) {
		StringBuilder desenho = new StringBuilder();
		desenho.append("Retângulo("+altura+" x "+largura+")\n");
		for (int linha = 1; linha <= altura; linha++) {
			for (int coluna = 1; coluna <= largura; coluna++) {
				if(linha == 1|| linha == altura || coluna == 1 || coluna == largura) {
					desenho.append(simbolo + " ");
				} else {
					desenho.append("  ");
				}
			}
			desenho.append("\n");
		}
		return desenho.toString();
	}
	
	public String desenharTriangulo(String simbolo, int altura, int largura) {
		StringBuilder desenho = new StringBuilder();
		int meio =  largura/2;
		meio += largura%2 == 0 ? 0 : 1;
		desenho.append("Triângulo("+altura+" x " +largura+")\n");
		for (int linha = 1; linha <= altura; linha++) {
			for (int coluna = 1; coluna <= largura; coluna++) {
				if(coluna > (meio - linha) && coluna < (meio + linha)) {
					desenho.append(simbolo + " ");
				} else {
					desenho.append("  ");
				}
			}
			desenho.append("\n");
		}
		return desenho.toString();
	}
	
}