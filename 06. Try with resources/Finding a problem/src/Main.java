import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // Write your solution here
      String message = "I lake: ";                                     // #1
      try (Scanner scanner = new Scanner(System.in);                   // #2
           StringBuilder stringBuilder = new StringBuilder(message)) { // #3

         stringBuilder.append(scanner.nextLine());                    // #4
         stringBuilder.append(scanner.nextLine());                    // #5
      }

      System.out.println(stringBuilder);
   }
}