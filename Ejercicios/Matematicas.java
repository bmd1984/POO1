//ejercicio 4.4 
public class Matematicas{
	//atributo
	private double numero;

	//getters y setters
	public double getNumero(){
		return this.numero;
	}
	public void setNumero(double n){
		this.numero = n;
	}
	//metodo que devuelve la raiz cuadrada
	public double raizCuadrada(){
		return Math.sqrt(this.numero);
 	}
	//metodo que devuelve la raiz cubica del numero en valor absoluto
        public double raizCubica(){
		return Math.cbrt(Math.abs(this.numero));
        }
	//metodo que redondea de doble a entero (long tambien es entero) en
	//valor absoluto
	public long redondeo(){
		return Math.round(Math.abs(this.numero));
	}
	//metodo que devuelva numeros aleatorios en el intervalo de 0 al
	//numero de la clase redondeado 
	public long aleatorio(){
		//en valor absoluto
		//return Math.round(Math.random()*this.redondeo());
		//sin valor absoluto:
		return Math.round(Math.random()*this.numero);
	}	
}
class TestMatematicas{
	public static void main(String[] args){
		// creamos un objeto Matematicas y al no haber constructor
		// el compilador invoca al constructor por defecto (sin
		// parametros)
		Matematicas m = new Matematicas();
		// damos valor al atributo numero
		m.setNumero(49.52356);
		System.out.println("Numero: " +m.getNumero());
		System.out.println("Raiz cuadrada: " + m.raizCuadrada());
		System.out.println("Raiz cubica: " + m.raizCubica());
		System.out.println("Redondeo a entero: " + m.redondeo());
		System.out.println("Numero aleatorio[0,"+m.getNumero()+"]: " + m.aleatorio());
	}
}
