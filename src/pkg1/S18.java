package pkg1;

public class S18 {
    public static void main(String[] args) {
        try{
            int n1=10;
            int n2=0; 
            int n3=n1/n2;
            System.out.println(n3);
        }
        catch(Exception e){
            System.out.println(e+" Can't divide by zero");
        }
    }
}
