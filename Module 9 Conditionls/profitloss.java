import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price : ");
        int a = sc.nextInt();
        System.out.print("Enter the Selling Price : ");
        int b = sc.nextInt();
        if(a>b) System.out.println("Loss by " +(a-b));
        if(a<b) System.out.println("Profit by " +(b-a));
        if(a==b) System.out.println("NO PROFIT NO LOSS");

    }
}
