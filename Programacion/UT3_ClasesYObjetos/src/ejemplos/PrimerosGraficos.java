package ejemplos;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class PrimerosGraficos {

	public static void main(String[] args) throws InterruptedException {
		Rectangle cuadrado;
		Ellipse circulo;
		
		cuadrado=new Rectangle(0,0,100,100);
		circulo=new Ellipse(25,25,50,50);
		
		cuadrado.draw();
		Thread.sleep(3000);
		circulo.draw();
		circulo.setColor(Color.BLUE);

	}

}
