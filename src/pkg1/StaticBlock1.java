package pkg1;

public class StaticBlock1 {
	static int myVar;
	static int myVar2=1;
	
	static {
		myVar = 10;
		System.out.println("Static block executed and myVar is " + myVar);
	}
	public static void main(String[] args) {
//		MyClass obj = new MyClass();
		System.out.println("Main method executed and myVar is " + myVar);
	}
}
