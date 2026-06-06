import java.util.Scanner;

public class triangletype {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side : ");
        int a = sc.nextInt();
        System.out.print("Enter Second side : ");
        int b = sc.nextInt();
        System.out.print("Enter third side : ");
        int c = sc.nextInt();
        if(a+b<c || b+c<a || a+c<b) System.out.println("These Sides cannot Form Triangle"); 
       if(a==b && b==c) System.out.println("Equilateral Triangle");
        else if(a==b || b==c || c==a) System.out.println("Isocelus Triangle");
       else System.out.println("Scalene Triangle");
        
    }
}
