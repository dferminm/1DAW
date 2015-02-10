package ejercicios;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Ejercicio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//declaro variables para construir la señal
		
		Rectangle cuadrado = new Rectangle(25,200,100,30);
		Ellipse circulo1 = new Ellipse(0,140,150,150);
		Ellipse circulo2 = new Ellipse(15,155,120,120);
		
		//dibujo las figuras que compondrán la señal
		
		circulo1.fill();
		circulo1.setColor(Color.BLACK);
		
		circulo2.fill();
		circulo2.setColor(Color.RED);
		
		cuadrado.fill();
		cuadrado.setColor(Color.WHITE);

		//En movimiento
		
		//declaro variables
		
		int mover = 5;
		int mover1 = -5;
		
		//creo un bucle para que se ejecute mientras sea cierto
		while (true) {
			mover=5;
			//introduzco otros 2 bucles for dentro para que cada vez que acabe uno, se inicie el otro
			for (int i = 0;i < 25; i++) {
				Thread.sleep(25);
				cuadrado.translate(mover, mover1);
				circulo1.translate(mover, mover1);
				circulo2.translate(mover, mover1);
			}
			for (int i = 0;i < 25;i++) {
				Thread.sleep(25);
				cuadrado.translate(mover1, mover);
				circulo1.translate(mover1, mover);
				circulo2.translate(mover1, mover);
			}
			}
		
	}

}
