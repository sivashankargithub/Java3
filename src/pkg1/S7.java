//Constr
package pkg1;

public class S7 {
	S7(){
		this(7);
		System.out.println("Default Constructor");
	}
	S7(int x){
		this(7,8);
		System.out.println(x);
	}
	S7(int x, int y){
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		S7 s7 = new S7();

	}

}
