//ejercicio 4.2

public class Palabra{
	//atributo
	private String contenido;

	//constructor
	public Palabra(String c){
		this.contenido=c;
	
	}
	@Override
	public String toString(){
		return "objeto creado: "+this.contenido;
	}
	//metodo que devuelve palabra en mayusculas
	public String mayuscula(){
		return this.contenido.toUpperCase();
 	}
	//metodo que devuelve la palabra en minusculas
	public String minuscula(){
		return this.contenido.toLowerCase();
	}
	//metodo que devuelve la longitud de la palabra
	public int numeroCaracteres(){
		return this.contenido.length();
	}
	//metodo que devuelve la longitud de palabra sin contar espacios
        public int numeroLetras(){
		String auxiliar = this.contenido.replace(" ","");
                return auxiliar.length();
        }

	//metodo 2 que elimina espacios al principio y al final           
	public int eliminaBlancosPrincipioFinal(){
		String auxiliar = this.contenido.trim();
		return auxiliar.length();
	}	
	//metodo que reemplace letras
	public String reemplazar(char vieja, char nueva){
		return this.contenido.replace(vieja,nueva);
	}
	//los siguientes dos metodos fallan para cadenas vacias
	//metodo que devuelve la primera letra
	public char empiezaPor1(){
		return this.contenido.charAt(0);
	}
        //metodo 2 que devuelve la primera letra
        public String empiezaPor2(){
                return this.contenido.substring(0,1);
        }
        //metodo que devuelve la ultima letra
        public char acabaPor1(){
                return this.contenido.charAt(this.contenido.length()-1);
		//tambien se podria escribir:
                // return this.contenido.charAt(this.numeroCaracteres()-1);

        }
        //metodo que devuelve la ultima letra
        public String acabaPor2(){
                return this.contenido.substring(this.contenido.length()-1);
		//otra forma seria:
		//return this.contenido.substring(this.contenido.length()-1,this.contenido.length());
        }


}

class TestPalabra{
	public static void main(String[] args){
		Palabra p1 = new Palabra(" Esto es una cadena ");
		System.out.println(p1);
		System.out.println("En mayúscula: " + p1.mayuscula());
		System.out.println("En minúscula: " + p1.minuscula());
		System.out.println("Numero caracteres: " +p1.numeroCaracteres());
		System.out.println("Numero letras: " +p1.numeroLetras());
		System.out.println("Caracteres sin blanco: " +p1.eliminaBlancosPrincipioFinal());
		System.out.println("Reemplazar e i: " +p1.reemplazar('e','i'));
		System.out.println("Empieza por: " +p1.empiezaPor1());
		System.out.println("Empieza por: " +p1.empiezaPor2());
                System.out.println("Acaba por: " +p1.acabaPor1());
                System.out.println("Acaba por: " +p1.acabaPor2());

	}
}
