//Off Diamond Shape right side
package pkg1;

public class S16 {
    public static void main(String[] args) {
        int size1=10;
        for(int j=1;j<size1;j++){
            for (int i = 0; i < j; i++) {
                System.out.print('.');
            }
            System.out.println();
        }
        for (int j = 0; j < size1; j++) {
            for (int i = j; i < size1; i++) {
                System.out.print('.');
            }
            System.out.println();
        }
    }

}
