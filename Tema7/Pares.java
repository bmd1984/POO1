public class Pares{
	//atributo
	private int numero;
	//constructor: sirve para inicializar los atributos
	public Pares(int n){
		this.numero=n;
	}
	//metodo que nos devuelve si el numero es par o no
	public boolean esPar(){
		return this.numero % 2 ==0;
		//return 0== this.numero % 2;
	}
	//sobreescribo el método toString
	@Override
	public String toString(){
		return "El numero "+this.numero+" ¿es par? "+this.esPar();
	}

	public static void main(String[] args){
		//creamos dos objetos, uno que el atributo sea par y el otro no
		Pares n1 = new Pares(7);
		Pares n2 = new Pares(70);
		//Mostramos el primer numero segun el toString
		System.out.println(n1);
		//Mostramos el segundo numero segun el toString
		System.out.println(n2);
	}
}
