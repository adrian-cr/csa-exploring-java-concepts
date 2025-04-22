/* Part 2: Increment and Decrement Operations */

public class Part2 {
  public static void main(String[] args) {
    //Declare and initialize variables:
    int counter = 10;
    
    //Perform increment and decrement operations:
    counter++;
    System.out.println("Value after increment: " + counter);
    counter--;
    System.out.println("Value after decrement: " + counter);
    
    //Use increment and decrement in loops:
    System.out.println("Increment from 10 to 15 using \"for\" loop:");
    for (int i=counter; i<=15; i++) {
      System.out.print(i + " ");
      if (i!=10) counter++;
    }//for
    System.out.println("\nDecrement from 15 to 10 using \"while\" loop:");
    while (counter>=10) {
      System.out.print(counter + " ");
      counter--;
    }//while
  }//main()
}//Part2
