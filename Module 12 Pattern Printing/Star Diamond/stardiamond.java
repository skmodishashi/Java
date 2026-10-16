
//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 
import java.util.Scanner;

public class stardiamond {

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter n : ");
  int n = sc.nextInt();
  for(int i=1;i<=n;i++){
      for(int j =1;j<=n-i;j++){ //spaces ulta
        System.out.print(" "+" ");
      }
        for(int k =1;k<=2*i-1;k++){
        System.out.print("*"+" ");
      }
      System.out.println();
    }
      n--;
  for(int m=1;m<=n;m++){
      for(int j =1;j<=m;j++){ //spaces sidha
        System.out.print(" "+" ");
      }
        for(int k =2*(n-m+1)-1;k>=1;k--){
        System.out.print("*"+" ");
      }

      System.out.println();
    }
}
}
