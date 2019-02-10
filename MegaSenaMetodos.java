package desafio;

public class MegaSenaMetodos {
	
	public static void main(String[] args) {
		MegaSenaMetodos jogo = new MegaSenaMetodos();
		
		int numero = jogo.gerarNumeroAleatorio(10, 15);
		System.out.println(numero);
	}
	

	public int gerarNumeroAleatorio (int numInicial, int numFinal) {
		numFinal -= numInicial;
		return (int)(numInicial + Math.random() * numFinal - numInicial);
	}
	
}
