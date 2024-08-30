package pkg1;

class Country1 {
    static double gst1 = 0.00;
    public static double calcPrice(double price1){
        double total = gst1*price1;
        total=total+price1;
        return total;
    }
} 

class India1 extends Country1 {
    static double gst1 = 0.18;
    public static double calcPrice(double price1){
        double total = gst1*price1;
        total=total+price1;
        return total;
    }
}
class Foreign1 extends Country1 {
    static double gst1 = 0.28;
    public static double calcPrice(double price1){
        double total = gst1*price1;
        total=total+price1;
        return total;
    }
}
public class S12 {
    public static void main(String[] args) {
        India1 india1 = new India1();
        Foreign1 foreign1 = new Foreign1();
        double totalPrice1 = india1.calcPrice(100.0);
        double totalPrice2 = foreign1.calcPrice(100.0);
        System.out.println(totalPrice1);
        System.out.println();
    }
}
