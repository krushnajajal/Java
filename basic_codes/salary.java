//Salary with Overtime (Command Line Input) 
  public class Salary 
  {
    public static void main(String[] args) 
    {
      int hours = Integer.parseInt(args[0]); 
      int overtime = Integer.parseInt(args[1]); 
      int salary = (hours * 20) + (overtime * 25); 
      System.out.println("Total Salary = " + salary); 
    } 
  }
