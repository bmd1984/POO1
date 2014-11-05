public class Rectangulo{
	//atributos
	private int alto;
	private int ancho;
	//métodos de acceso
	public int getAlto(){
		return this.alto;
	}
	public int getAncho(){
		return this.ancho;
	}
	//métodos mutantes
	public void setAlto(int alto){
		this.alto=alto;
	}
	public void setAncho(int ancho){
		this.ancho=ancho;
	}
	//método para obtener el área
	public int getArea(){
		return this.alto*this.ancho;
	}
	//crear un método main para comprobar el funcionamiento
	/*public static void main(String[] arg){
		Rectangulo r1 = new Rectangulo();
		r1.setAlto(12); r1.setAncho(10);
		System.out.println("Rectangulo de alto "+r1.getAlto()+" y ancho "+r1.getAncho()+" tiene un valor de área igual a "+r1.getArea());
		Rectangulo r2 = new Rectangulo();
		r2.setAlto(2); r2.setAncho(100);
		System.out.println("Rectangulo de alto "+r2.getAlto()+" y ancho "+r2.getAncho()+" tiene un valor de área igual a "+r2.getArea());
		r2.setAlto(4);//a apartir de aquí cambia el valor del alto de r2
	}*/
}
