public class Fecha{
	//atributos de la clase Fecha
	private int dia;
	private int mes;
	private int anno;
	//getters y setters
	//getters
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAnno(){
		return this.anno;
	}
	//setters
	public void setDia(int d){
		this.dia=d;
	}
	public void setMes(int m){
		this.mes=m;
	}
	public void setAnno(int a){
		this.anno=a;
	} 
        @Override
	public String toString(){
		return this.dia+"/"+this.mes+"/"+this.anno;
	}	
	public static void main(String[] args){
		Fecha f1 = new Fecha();
		f1.setDia(5); f1.setMes(11); f1.setAnno(2014);
		System.out.println("Fecha: " + f1.getDia()+"-"+
				    f1.getMes()+"-"+f1.getAnno());
		System.out.println("Fecha: " +f1);
	}
}
