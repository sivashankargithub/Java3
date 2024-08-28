package pkg1;

public class CommandLineArguments1 {

	public static void main(String[] args) {
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("Sum of 2 numbers is :"+c);
	}

}
