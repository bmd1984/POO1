public class NumeroVocales{
	//atributo
	private String palabra; 
	//vamos a usar getters y setters
	//getter
	public String getPalabra(){
		return this.palabra;
	}
	//setter
	public void setPalabra(String p){
		this.palabra=p;
	}
	//método de contar vocales
	//método sencillo
	public int contarVocales(){
		int contador=0;
		for (int i=0; i<this.palabra.length(); i++){
			String letra = this.palabra.substring(i,i+1);
			System.out.println("LETRA " + letra);
			if (letra.contains("a")||letra.contains("e")||
			     letra.contains("i")||letra.contains("o")||
			     letra.contains("u")){
				contador++;
			}
		}
		return contador;
	}
	//complicamos el método
        public int contarVocales2(){
                int contador=0;
                for (int i=0; i<this.palabra.length(); i++){
                        String letra = this.palabra.substring(i,i+1);
                        System.out.println("LETRA " + letra);
                        if (!(letra.contains("a")||letra.contains("e")||
                             letra.contains("i")||letra.contains("o")||
                             letra.contains("u"))){
                                continue;
                        }
                        contador++;
                }
                return contador;
        }
	@Override
	public String toString(){
		return (this.palabra);
	}		
}
class TestNumeroVocales{
	public static void main(String[] args){
		//creamos un objeto llamando a constructor por defecto
		NumeroVocales p1 = new NumeroVocales(); 
		//damos valor al atributo con un setter
		p1.setPalabra("amigo");
		//Imprimimos el resultado con el metodo sencillo
		System.out.println("La palabra " +p1+" tiene "+p1.contarVocales()+" vocales");
		//Imprimimos el resultado con el metodo complejo
                System.out.println("La palabra " +p1+" tiene "+p1.contarVocales2()+" vocales");
	}
}

