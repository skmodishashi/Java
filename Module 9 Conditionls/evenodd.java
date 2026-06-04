

import java.util.Scanner;



public class evenodd {
    public static void main(String[] args) {
        System.out.print("Enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0) System.out.print("Given no. is even");
        if(n%2!=0) System.out.println("Given no. is odd");
    }
}
