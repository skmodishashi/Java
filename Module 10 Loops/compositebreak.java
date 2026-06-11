import java.util.Scanner;

public class compositebreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=2;i<=n-1;i++){
            if(n%i==0)System.out.println("Composite no.");
            break;
        }
    }      // composite means which is divided by other then 1 and itself
}


   // break is used to break the iterations/loops