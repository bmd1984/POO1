import java.util.Random;
public class Numero{
	//atributo
	private int numero;
	//constructor
	public Numero(int n){
		this.numero=n;
	}
	//metodo que averigua el valor de dicho atributo
	public int averigua(){
		int numeroADescubrir = 0;
		for (int i=0; i<10000; i++){
			if (this.numero==i){
				numeroADescubrir = i;
				break;
			}
		}
		return numeroADescubrir;
	}
}
class TestNumeroAleatorio{
	public static void main(String[] args){
		//genero el numero de forma aleatoria
		Random r = new Random();
		//genera un numero aleatorio int desde 0 a 10000 ambos incluidos
		int numero = r.nextInt(10000);
		//System.out.println(numero);
		//creamos el numero
		Numero n = new Numero(numero);
		System.out.println("Numero a descubrir: "+n.averigua());
	}
}
