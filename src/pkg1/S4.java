//Constructor Chaining
package pkg1;

public class S4 {
	S4(){
		this(5);
		System.out.println("The Default constructor");
	}
	S4(int x){
		this(5, 15);
		System.out.println(x);
	}
	S4(int x, int y){
		System.out.println(x * y);
	}

	public static void main(String args[]){
		new S4();
	}
}
