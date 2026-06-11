import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        // 2,4,8,16......n
         int a=2;
            for(int i=1;i<=n;i++){
            System.out.println(a);
            a*=2;
            
    }
}
}
