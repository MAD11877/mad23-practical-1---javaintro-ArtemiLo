import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.print("Please enter your height (in m): ");
    double height = in.nextDouble();
    System.out.print("Please enter your weight (in kg): ");
    int weight = in.nextInt();
    double BMI = weight / (height * height);
      System.out.print(BMI);
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    double height = in.nextDouble();
  }
}
