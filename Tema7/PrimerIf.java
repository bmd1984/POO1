public class PrimerIf{
	public static void main(String[] args){
		int numero=8;
		if (numero%2==0 && numero%3==0)
			System.out.println("Es divisible por dos y por tres");
		else if (numero%3 ==0)
			System.out.println("Divisible por tres");
		else if (numero%2 ==0)
                        System.out.println("Divisible por dos");
                else
			System.out.println("No es divisible ni por dos ni por tres");
	}
}
