import java.util.Scanner;

public class smallestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        System.out.print("Enter third no. : ");
        int c = sc.nextInt();
       if(a<b && a<c) System.out.println(a + " is the smallest");
       else if(b<a && b<c) System.out.println(b + " is the smallest");
       else System.out.println(c + " is the smallest");
}
}
