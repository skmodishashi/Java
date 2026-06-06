import java.util.Scanner;

public class ternaryoperator {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int a = sc.nextInt();
        System.out.println((a%2==0) ? "Even" : "Odd");
   }   
         
}

// condition ? if true : if false
// it is fully mentioned inside sout ()