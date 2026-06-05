import java.util.Scanner;

public class greatestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        System.out.print("Enter third no. : ");
        int c = sc.nextInt();
       if(a>b && a>c) System.out.println(a + " is the Greatest");
       else if(b>a && b>c) System.out.println(b + " is the Greatest");
       else System.out.println(c + " is the Greatest");
}
}

// This is if-else if-else ladder