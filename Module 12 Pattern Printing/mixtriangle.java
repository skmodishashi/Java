
// 1 
// A B 
// 1 2 3 
// A B C D 
// 1 2 3 4 5 
// A B C D E F
import java.util.Scanner;

public class mixtriangle {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){ 
          if(i%2!=0) System.out.print(j+" ");
          else System.out.print((char)(64+j)+" ");}
         System.out.println();
    } 
    }
}

