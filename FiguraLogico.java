package logico;

/*
 *   QUADRADO (5X5)
 *   * * * * * 
 *   * * * * *
 *   * * * * *
 *   * * * * *
 *   * * * * *
 *   
 *   RETANGULO (5X9)
 *   * * * * * * * * *
 *   *               *
 *   *               *
 *   *               *
 *   * * * * * * * * *
 *   
 *   TRIANGULO (5X9)
 *           *
 *         * * *
 *       * * * * *
 *     * * * * * * *
 *   * * * * * * * * *
 */
public class FiguraLogico {
	
	public static void main(String[] args) {
		String quadrado[][] = new String[5][5];
		String retangulo[][] = new String[5][9];
		String triangulo[][] = new String[5][9];
		
		System.out.println("Quadrado (5x5)");
		for(int linha = 0; linha < quadrado.length; linha++) {
			for (int coluna = 0; coluna < quadrado[linha].length; coluna++) {
				quadrado[linha][coluna] = "*";
				System.out.print(quadrado[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Retângulo(5x9)");
		for (int linha = 0; linha < retangulo.length; linha++) {
			for (int coluna = 0; coluna < retangulo[linha].length; coluna++) {
				if(linha == 0|| linha == retangulo.length-1 || coluna == 0 || coluna == retangulo[0].length-1) {
					retangulo[linha][coluna] = "*";
				} else {
					retangulo[linha][coluna]= " ";
				}
				System.out.print(retangulo[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		int meio = triangulo[0].length/2;
		
		
		System.out.println("Triângulo(5x9)");
		for (int linha = 0; linha < triangulo.length; linha++) {
			for (int coluna = 0; coluna < triangulo[linha].length; coluna++) {
				if(coluna >= (meio - linha) && coluna <= (meio + linha)) {
					triangulo[linha][coluna] = "*";
				} else {
					triangulo[linha][coluna] = " ";
				}
				System.out.print(triangulo[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
	
	
	public void desenharQuadrado(String simbolo, int altura, int largura) {
		
	}
	
	public void desenharRetangulo(String simbolo, int altura, int largura) {
		
	}
	
	public void desenharTriangulo(String simbolo, int altura, int largura) {
		
	}
	
}



































