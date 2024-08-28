package pkg1;

public class ConstructorChaining1 {
	/* within same class Using this() keyword
	 * default constructor will call another constructor
	 * using this keyword from same class*/
	ConstructorChaining1(){
		this(5);
		System.out.println("The Default constructor");
	}
	ConstructorChaining1(int x){
		this(5, 15);
		System.out.println(x);
	}
	ConstructorChaining1(int x, int y){
		System.out.println(x * y);
	}

	public static void main(String args[]){
		new ConstructorChaining1();
	}
}
