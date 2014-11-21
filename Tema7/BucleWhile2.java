public class BucleWhile2{
	//atributo
	private int numero; 
	//constructor para inicializar el valor del atributo numero
	public BucleWhile2(int n){
		this.numero=n;
	}
	//método que suma desde cero hasta numero
	public int sumar(){
		int suma=0;
		int contador=1;
		while (contador <= this.numero){
			System.out.print("Suma vale: " + suma + "\t");
			System.out.print("Contador vale: " + contador + "\n");
			suma = suma + contador;
			//contador=contador+1; esta opcion es igual a la de abajo
			//contador+=1; esta opcion es igual a la de abajo
			contador++; //esta es la que se suele usar
		}
		System.out.println("Fuera del bucle contador vale: " + contador + "\t"+"suma vale: " + suma);
		return suma;
	}
	//metodo similar al anterior pero no funciona para this.numero=0
	public int sumarDoWhile(){
		int suma=0;
		int contador=1;
		do{
			System.out.print("Suma vale:"+suma+"\t");
			System.out.print("Contador vale: "+contador+"\n");
			suma+=contador;
			contador++;
		}
		while(contador<=this.numero);
		System.out.println("Fuera del bucle contador vale: "+contador+"\t"+"suma vale: "+suma);
		return suma;
 	}
	//usando el bucle for
	public int sumaBucleFor(){
		int suma=0;
		int i=1;
		System.out.println("=======================");
		for (i=1; i<= this.numero; i++){
			System.out.print("Dentro del bucle suma vale: "+suma+"\t");
			System.out.print("Contador vale: "+i+"\n");
			suma+=i;
		}		
		System.out.println("Fuera del bucle contador vale: "+i+"\t"+ "suma vale " + suma);
		System.out.println("=======================");
		return suma;
	}
		
}
class TestBucleWhile2{
	public static void main(String[] args){
		//creamos un objeto
		BucleWhile2 b1 = new BucleWhile2(3);
		//obtenemos el valor de la suma en un int
		int suma1 = b1.sumar();
		System.out.println("La suma es: " + suma1);
		//también se puede hacer System.out.println("La suma es: "+b1.sumar()); // aqui no podriamos volver a usar el valor de la suma a menos que volvamos a llamar a b1.sumar()
		int suma2 = b1.sumarDoWhile();
		System.out.println("La suma es: " + suma2);
		int suma3 = b1.sumaBucleFor();
		System.out.println("La suma es: " + suma3);
	}
}
