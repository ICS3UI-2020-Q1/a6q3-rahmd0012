import java.util.Scanner;
/**
 * a program that determines which number out of 10 is the biggest
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    int[] integers = new int[10];

    // ask the user to enter 10 integers
    System.out.println("Please enter in 10 integers to put into the array");
    // create a for loop to get the 10 integers
    for(int i = 0; i < 10; i++){
    integers[i] = input.nextInt();
    }

    // create a variable that can equal to the biggest number
    int biggestNum = 0;

    // create a for loop to find the largest integer out of the 10
    for(int i = 0; i < 10; i++){
      // create an if statement to figure out the largest number
      if(biggestNum <= integers[i]){
        biggestNum = integers[i];
      } 
    }
    // tell the user the largest number
     System.out.println("The largest number is " + biggestNum); 
    
  }
}
