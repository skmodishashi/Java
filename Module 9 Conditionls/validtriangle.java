import java.util.Scanner;

public class validtriangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        System.out.print("Enter third no. : ");
        int c = sc.nextInt();
        if(a>(b+c) && b>(a+c) && c>(a+b)) System.out.println("These Sides can Form Triangle");
        else System.out.println("These Sides cannot Form Triangle");
    }
}
