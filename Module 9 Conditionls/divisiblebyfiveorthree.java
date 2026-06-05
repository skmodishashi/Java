import java.util.Scanner;

public class divisiblebyfiveorthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0) System.out.println("Number is divisible by 5 or 3");
        else System.out.println("Number is neither divisible by 5 nor divisible by 3");
    }
}
