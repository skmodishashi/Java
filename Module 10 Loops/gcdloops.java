import java.util.Scanner;

public class gcdloops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();
        int c,gcd=0;
        if(a>b) c=b;
        else c=a;
        for(int i=1;i<=c;i++){
            if(a%i==0 && b%i==0) gcd=i;
        }
        System.out.print("GCD is " + gcd);

    }
}
