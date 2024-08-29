//Passing Command Line Arguments
package pkg1;
public class S3{
    public static void main(String[] args){
	    int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a+b;
		System.out.println("Sum : "+c);
	}
}