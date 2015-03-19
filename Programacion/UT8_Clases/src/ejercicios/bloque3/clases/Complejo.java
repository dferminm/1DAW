package ejercicios.bloque3.clases;

public class Complejo {

	private double real;
	private double imaginaria;
	
	public Complejo() {
		this.real = 0;
		this.imaginaria = 0;
	}
	
	public Complejo(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	public void setReal(double real) {
		this.real = real;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	

	public double getReal() {
		return real;
	}

	public double getImaginaria() {
		return imaginaria;
	}

	public void suma(Complejo sumando2) {
		this.real = this.real + sumando2.getReal();
		this.imaginaria = this.imaginaria + sumando2.getImaginaria();
	}
	
	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imaginaria=" + imaginaria + "]";
	}

	public void multiplica(Complejo mult) {
		this.real = ((this.real*mult.getReal())-(this.imaginaria*mult.getImaginaria()));
		this.imaginaria = ((this.real*mult.getImaginaria())+(this.imaginaria*mult.getReal()));
	}
	
	/*Suma: (a,b)+(c,d)=(a+c,b+d)
	Resta: (a,b)-(c,d)=(a-c,b-d)
	Producto: (a,b)*(c,d)=(ac-bd,ad+bc)
	Cociente: (a,b)/(c,d)=((ac+bd)/(c^2+d^2),(bc-ad)/(c^2+d^2))*/
	
}
