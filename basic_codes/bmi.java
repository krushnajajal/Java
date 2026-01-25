import java.util.*;
public class BMI 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Weight: "); 
    double w = sc.nextDouble(); 
    System.out.print("Enter Height: "); 
    double h = sc.nextDouble(); 
    double bmi = w / (h * h); 
    System.out.println("BMI = " + bmi); 
  }
}
