//ejercicio 9. Calculo hipotenusa, area y perimetro en triangulos rectangulos
import javax.swing.JOptionPane;
public class TrianguloRectangulo{
	//atributos
	private double catetoA;
	private double catetoB;

	//getters y setters
	public void setCatetoA(double a){
		this.catetoA = a;
	}
	public void setCatetoB(double b){
		this.catetoB = b;
	}
	//metodo que devuelve la hipotenusa
	public double obtenerHipotenusa(){
		return Math.hypot(this.catetoA, this.catetoB);
 	}
	//metodo que devuelve el area del triangulo           
        public double obtenerArea(){
		return (this.catetoA * this.catetoB)/2;
        }
	//metodo que devuelve el valor negativo de la ecuacion              
        public double obtenerPerimetro(){
                return this.catetoA + this.catetoB + this.obtenerHipotenusa();
        }
	@Override
	public String toString(){
		return "Triangulo de catetos " +this.catetoA+" y "+this.catetoB;
	}	
}
class TestTrianguloRectangulo{
	public static void main(String[] args){
		// creamos un objeto TrianguloRectangulo, al no haber
		// constructor
		// el compilador invoca al constructor por defecto (sin
		// parametros)
		TrianguloRectangulo t = new TrianguloRectangulo();
		// damos valor a los atributos 
		String varA = JOptionPane.showInputDialog("Introduce el cateto a: ");
		double cA = Double.parseDouble(varA);
		String varB = JOptionPane.showInputDialog("Introduce el cateto b: ");  
		double cB = Double.parseDouble(varB);
		t.setCatetoA(cA);
		t.setCatetoB(cB);
		System.out.println(t);
		System.out.println("Valor hipotenusa: " +t.obtenerHipotenusa());
		System.out.println("Valor area: " +t.obtenerArea());
		System.out.println("Valor perimetro: " +t.obtenerPerimetro());
	}
}

