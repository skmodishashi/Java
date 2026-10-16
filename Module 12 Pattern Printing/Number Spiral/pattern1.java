
// 1 1 1 1 
// 1 2 2 2 
// 1 2 3 3 
// 1 2 3 4 
import java.util.Scanner;

public class pattern1 {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter n : ");
 int n = sc.nextInt();

 for(int i = 1;i<=n;i++){
    for(int j=1;j<=n;j++){

        System.out.print(Math.min(i,j)+" ");
    }
    System.out.println();
 }

}   
}
