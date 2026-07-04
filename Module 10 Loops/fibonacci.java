import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int a=0,b=1;
        int temp=0;
        for(int i=1;i<=n;i++){
         temp=a;
         System.out.print(temp+" ");
         a=b;
         b=temp+a;
        }
    }
}
