/* Part 4: Using Conditionals, Logical Operators, and Switch Statements */

public class Part4 {
  public static void main(String[] args) {
    //Declare and initialize variables:
    int score1 = 87;
    int score2 = 58;
    int score3 = 92;
    int averageScore = (score1 + score2 + score3) / 3;
    System.out.println(
      "***VARIABLES PART 1***" +
      "\nscore1: " + score1 +
      "\nscore2: " + score2 +
      "\nscore3: " + score3 +
      "\naverageScore: " + averageScore);
    
    //Use conditionals and logical operators:
    System.out.print("\nAverage score is... ");
    if (averageScore>=90 && averageScore<=100) System.out.println("excellent!");
    else if (averageScore>=70 && averageScore<=89) System.out.println("good");
    else if (averageScore>=50 && averageScore<=69) System.out.println("average");
    else if (averageScore>=0 && averageScore<=49) System.out.println("poor");
    else System.out.println("Invalid input!");
    
    //Use a switch statement:
    int day = 7;
    System.out.println("\n***VARIABLE PART 2***" + "\nday: " + day);
    System.out.print("\nToday is... ");
    switch (day) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 7:
        System.out.println("Sunday");
        break;
      default:
        System.out.println("Invalid input!");
    }//switch
  }//main()
}//Part4
