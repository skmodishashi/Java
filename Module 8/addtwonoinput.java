import java.util.Scanner;

public class addtwonoinput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter First Number : ");
        int m = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int n = sc.nextInt();
        System.out.println("The Sum is : "+(m+n));
    }
}
