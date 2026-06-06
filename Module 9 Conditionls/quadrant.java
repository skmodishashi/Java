import java.util.Scanner;

public class quadrant {  
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter X POint : ");
        int x = sc.nextInt();
        System.out.print("Enter Y Point : ");
        int y = sc.nextInt();
        if(x>0 && y>0) System.out.println("Point lies on 1st Quadrant");
        else if(x<0 && y>0) System.out.println("Point lies on 2nd Quadrant");
        else if(x<0 && y<0) System.out.println("Point lies on 3rd Quadrant");
        else if(x>0 && y<0) System.out.println("Point lies on 4th Quadrant");
        else if(x!=0 && y==0) System.out.println("Point lies on X-axis");
        else if(x==0 && y!=0) System.out.println("Point lies on Y-axis");
        else System.out.println("Point lies on Origin");
    }
}
