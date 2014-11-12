//ejercicio 4.4 
public class Matematicas{
	//atributo
	private double numero;

	//constructor
	public Matematicas(double n){
		this.numero=n;
	}
	@Override
	public String toString(){
		return "Numero: "+this.numero;
	}
	//metodo que devuelve la raiz cuadrada
	public double raizCuadrada(){
		return Math.sqrt(numero);
 	}	
}
class TestMatematicas{
	public static void main(String[] args){
		Matematicas n1 = new Matematicas(25.0);
		System.out.println(n1);
		System.out.println("Raiz cuadrada: " + n1.raizCuadrada());
	}
}
