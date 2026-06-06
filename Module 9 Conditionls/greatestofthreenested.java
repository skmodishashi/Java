import java.util.Scanner;

public class greatestofthreenested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        System.out.print("Enter third no. : ");
        int c = sc.nextInt();
        if(a>b){  
            if(a>c) System.out.println(a+" is the Greatest");
            else // c>=a>b
                System.out.println(c+" is the Greatest");
        }
        else{ // b>=a
            if(b>c)System.out.println(b+ " is the Greatest");
            else // c>b>a 
                System.out.println(c+ " is the Greatest");
        }
    }
}
