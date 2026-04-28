import java.util.Scanner;

public class halfofGiveninteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // double y = (double)x;  // Typecasting changes datatype
        // System.out.println(y/2);
      
        double y = sc.nextDouble();
       int x =(int)y;  // typecasting double changes into integer
       System.out.println(x);    
    }
}
