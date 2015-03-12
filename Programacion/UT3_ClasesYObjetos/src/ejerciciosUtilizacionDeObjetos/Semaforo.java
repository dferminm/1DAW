package ejerciciosUtilizacionDeObjetos;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo {

	public static void main(String[] args) throws InterruptedException {
		Rectangle cuadrado;
		Ellipse circulo;
		Ellipse circulo1;
		Ellipse circulo2;
		Rectangle poste;
		
		cuadrado=new Rectangle(0,0,120,200);
		circulo=new Ellipse(35,25,50,50);
		circulo1=new Ellipse(35,85,50,50);
		circulo2=new Ellipse(35,145,50,50);
		poste=new Rectangle(40,200,120/3,150);
		
		cuadrado.draw();
		circulo.fill();
		circulo.setColor(Color.RED);
		
		circulo1.fill();
		circulo1.setColor(Color.YELLOW);
		
		circulo2.fill();
		circulo2.setColor(Color.GREEN);

		poste.fill();
		poste.setColor(Color.BLACK);
	}

}
