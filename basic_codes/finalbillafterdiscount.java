import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();
        System.out.print("Enter Discount %: ");
        double dis = sc.nextDouble();

        double finalBill = bill - (bill * dis / 100);
        System.out.println("Final Bill = " + finalBill);
    }
}
