import java.util.Scanner;

public class ap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt();
        // 4,7,10,13,16.......n
        for(int i=4;i<=3*n+1;i+=3){
            System.out.println(i);
        }
    }         
                // a(n)=a+(n-1)d      a(n)=4+(n-1)3 = 3n+1
}
