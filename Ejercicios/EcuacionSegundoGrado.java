//ejercicio 8. resolucion de ecuaciones de segundo grado
//ax²+bx+c=0	 
public class EcuacionSegundoGrado{
	//atributos: coeficientes a, b y c
	private double a;
	private double b;
	private double c;
	//constructor
	public EcuacionSegundoGrado(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//metodo que devuelve si la ecuacion es o no resoluble
	public boolean esResoluble(){
		return Math.pow(this.b,2)-(4*this.a*this.c) >= 0;
	}
	//metodo que devuelve si la ecuacion tiene o no solucion unica
	public boolean solucionUnica(){
		return Math.pow(this.b,2)-(4*this.a*this.c) == 0;
	}
	//metodo que devuelve el valor de la ecuacion cuando se suma la raiz   
        public double getResultado1(){
		return ((-this.b)+Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c)))/(2*this.a);
        }
	//metodo que devuelve el valor de la ecuacion cuando se resta la raiz
        public double getResultado2(){
                return ((-this.b)-Math.sqrt(Math.pow(this.b,2)-(4*this.a*this.c)))/(2*this.a);
	
	}
	@Override
	public String toString(){
		return "Ecuación de segundo grado " +this.a+"x²+"+this.b+"x+"+this.c+"=0";
	}
}
class TestEcuacionSegundoGrado{
	public static void main(String[] args){
		// creamos un objeto Ecuacion
		EcuacionSegundoGrado e = new EcuacionSegundoGrado(1,2,1);
		// Mostramos la ecuacion segun el toString
		System.out.println(e);
		// Mostramos otros valores
		System.out.println("¿Es resoluble? " +e.esResoluble());
		System.out.println("¿Tiene una unica solución? " +e.solucionUnica());
		System.out.println("Solución 1: " +e.getResultado1());
		System.out.println("Solución 2: " +e.getResultado2());
	}
}

