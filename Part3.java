/* Part 3: Working with Strings and User Input */

//Import the Scanner class:
import java.util.Scanner;

public class Part3 {
  public static void main(String[] args) {
    //Read user input:
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your first name:");
    String firstName = sc.next();
    System.out.println("Please enter your last name:");
    String lastName = sc.next();
    
    //Manipulate strings:
    String fullName = firstName + " " + lastName;
    String upperFullName =
      Character.toUpperCase(fullName.charAt(0)) +
      fullName.substring(1, fullName.indexOf(" ")) +
      " " +
      Character.toUpperCase(fullName.charAt(fullName.indexOf(" ") + 1)) +
      fullName.substring(fullName.indexOf(" ") + 2, fullName.length());
    int instances = 0;
    for (char c : fullName.toCharArray())
      if (Character.toString(c).equalsIgnoreCase(Character.toString(fullName.charAt(0))))
        instances++;
    System.out.println("Full name: \"" + fullName + "\"");
    System.out.println("Capitalized full name: \"" + upperFullName + "\"");
    System.out.println("Instances of \"" + upperFullName.charAt(0) + "\" in full name: " + instances);
  }//main()
}//Part3
