/* Part 5: Basic Calculator */

import java.util.Scanner;

public class Part5 {
  public static void main(String[] args) {
    //Declare and initialize variables:
    int num1;
    int num2;
    int result = 0;
    String operation;
    
    //Read user input:
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter first number:");
    num1 = sc.nextInt();
    System.out.println("Please enter operation type (\"+\", \"-\", \"*\" or \"/\")");
    operation = sc.next();
    System.out.println("Please enter second number:");
    num2 = sc.nextInt();
    System.out.println("Operation selected: \"" + num1 + operation + num2 + "\"");
    
    //Perform arithmetic operations:
    if (operation.equals("+")) result = num1 + num2;
    else if (operation.equals("-")) result = num1 - num2;
    else if (operation.equals("*")) result = num1 * num2;
    else if (operation.equals("/")) result = num1 / num2;
    String output;
    switch (operation) {
      case "+":
        output = num1 + " plus " + num2 + " equals " + result + "!";
        break;
      case "-":
        output = num1 + " minus " + num2 + " equals " + result + "!";
        break;
      case "*":
        output = num1 + " times " + num2 + " equals " + result + "!";
        break;
      case "/":
        output = num1 + " divided by " + num2 + " equals " + result + "!";
        break;
      default:
        output = "Invalid input!";
    }//switch
    
    //Increment and decrement operations:
    System.out.println("Do you wish to increment (I) or decrement (D) the result? (Input anything else if not)");
    String incDecr = sc.next();
    if (incDecr.equalsIgnoreCase("i")) output += "\nIncremented value: " + result++;
    else if (incDecr.equalsIgnoreCase("d")) output += "\nDecremented value: " + result--;
    
    //Display results:
    System.out.println(output);
    
  }//main()
}//Part5
