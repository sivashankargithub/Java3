//Static Block and Static Initializers
package pkg1;
public class S1 {
	static int myVar;
	static int myVar2=1;
	static {
		myVar = 10;
		System.out.println("Static block executed and myVar is " + myVar);
	}
	public static void main(String[] args) {
		System.out.println("Main method executed and myVar is " + myVar);
	}
}
