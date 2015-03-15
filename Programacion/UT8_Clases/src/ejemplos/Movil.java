package ejemplos;

import java.util.ArrayList;

public class Movil {

	private String marca, modelo;
	private ArrayList <AplicacionMovil> aplicaciones;
	
	public Movil(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		aplicaciones = new ArrayList<AplicacionMovil>();
	}
	
	public void addAplicacion(AplicacionMovil app) {
		this.aplicaciones.add(app);
	}
	
	public void delAplicacion(AplicacionMovil app) {
		this.aplicaciones.remove(app);
	}

	@Override
	public String toString() {
		String salida = "Movil: " + marca + " - " + modelo + "\n";
		
		for(AplicacionMovil app : aplicaciones) {
			salida+= "\t" + app + "\n";
		}
		return salida;		
	}
	
	public static void main(String[] args) {
		
		Movil miMovil = new Movil("LG", "Nexus 5");
		Movil otro = new Movil("Apple", "iPhone 6");
		
		AplicacionMovil app1 = new AplicacionMovil("GMail", "5.3");
		AplicacionMovil app2 = new AplicacionMovil("Yik Yak", "2.1.005");
		
		miMovil.addAplicacion(app1);
		miMovil.addAplicacion(app2);
		
		System.out.println(miMovil);
		
		miMovil.delAplicacion(app1);
		
		System.out.println(miMovil);

	}

}
