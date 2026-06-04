

import java.util.Scanner;



public class NumDivisbilebyfive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        if(n%5==0) System.out.println("Num divisibl by 5");
        else  System.out.println("Num not divisibl by 5");
    }
}
