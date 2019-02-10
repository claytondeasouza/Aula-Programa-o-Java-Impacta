package poo;
import poo.model.Quadrado;
public class FiguraPOO {

	public static void main(String[] args) {
		Quadrado quad = new Quadrado();
		System.out.println(quad.desenhar());
		
		Quadrado quad2 = new Quadrado(10,10, "#");
		System.out.println(quad2.desenhar());
	}
	
}
