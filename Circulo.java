public class Circulo{

	//atributos
	/*cualquier Circulo que creemos tendrá 
	*siempre un valor INICIAl de 5 */
	private int radio=5; 

	//método que devuelve el radio
	public int getRadio(){
		return this.radio;
	}
	//método que cambia el valor del radio
	public void setRadio(int r){
		this.radio=r;
	}
}
class TestCirculo{
	public static void main(String[] args){
		//crea un objeto de tipo círculo
		Circulo c1 = new Circulo(); //Crea un círculo de radio 5
		System.out.println("Radio del círculo: "+ c1.getRadio());
		Circulo c2 = new Circulo();//Crea un círculo de radio 5
		//Cambio el radio del Circulo c2 a un valor de 15
		c2.setRadio(15);
		System.out.println("Radio del círculo: "+ c2.getRadio());
	}
}
