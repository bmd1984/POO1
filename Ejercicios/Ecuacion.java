//ejercicio 8. resolucion de ecuaciones de segundo grado
//ax²+bx+c=0	 
public class Ecuacion{
	//atributos: coeficientes a, b y c
	private double valorA;
	private double valorB;
	private double valorC;

	//getters y setters
	public double getValorA(){
		return this.valorA;
	}
	public double getValorB(){
		return this.valorB;
	}
	public double getValorC(){
		return this.valorC;
	}
	public void setValorA(double a){
		this.valorA = a;
	}
	public void setValorB(double b){
		this.valorB = b;
	}
	public void setValorC(double c){
		this.valorC = c;
	}
	//metodo que devuelve la raiz cuadrada de la ecuacion
	// (b²-4ac))
	public double raizCuadrada(){
		return Math.sqrt(this.valorB*this.valorB - 4 * this.valorA*this.valorC);
 	}
	//metodo que devuelve el valor positivo de la ecuacion           
        public double valorPositivoEcuacion(){
		double auxiliar = (-this.valorB) + raizCuadrada();		
		return (auxiliar/(2*this.valorA));
        }
	//metodo que devuelve el valor negativo de la ecuacion              
        public double valorNegativoEcuacion(){
		double auxiliar = (-this.valorB) - raizCuadrada();
                return (auxiliar/(2*this.valorA));
        }

}
class TestEcuacion{
	public static void main(String[] args){
		// creamos un objeto Ecuacion y al no haber constructor
		// el compilador invoca al constructor por defecto (sin
		// parametros)
		Ecuacion e = new Ecuacion();
		// damos valor a los atributos   
		e.setValorA(3);
		e.setValorB(4);
		e.setValorC(1);
		System.out.println("ValorA: " +e.getValorA());
		System.out.println("ValorB: " +e.getValorB());
		System.out.println("ValorC: " +e.getValorC());
		System.out.println("Valor raiz: " +e.raizCuadrada());
		System.out.println("Valor positivo x: " +e.valorPositivoEcuacion());
		System.out.println("Valor negativo x: " +e.valorNegativoEcuacion());
	}
}
