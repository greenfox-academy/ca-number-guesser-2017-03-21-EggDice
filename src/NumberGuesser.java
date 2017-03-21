import java.util.Scanner;
import java.lang.Math;

public class NumberGuesser {
  public static void main(String[] args) {
    double max = 4.;
    double min = 0.;
    System.out.println("Please think a number between " + min + " and " + max + "!");
    double currentHalf = max / 2;

    while (min < max) {
      System.out.println("Is your number under " + currentHalf + "? [y/n]");
      Scanner scanner = new Scanner(System.in);
      String answer = scanner.nextLine();
      if (answer.equals("y")) {
        max = currentHalf - 1;
        currentHalf = Math.round((currentHalf + min) / 2);
      } else {
        min = currentHalf;
        currentHalf = Math.round((currentHalf + max) / 2);
      }
    }
    System.out.println("Your number is: " + min);
  }
}

