//       * 
//     * * * 
//   * * * * * 
// * * * * * * * nsp=no. of spaces & nst=no. of stars
//   * * * * * 
//     * * * 
//       * 
import java.util.Scanner;

public class stardiamondm2 {

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter n : ");
  int n = sc.nextInt();
  int nsp = n-1;
  int nst = 1;
  for(int i=1;i<=n;i++){
      for(int j =1;j<=nsp;j++){ //spaces ulta
        System.out.print(" "+" ");
      }
        for(int k =1;k<=nst;k++){
        System.out.print("*"+" ");
      }
      System.out.println();
      nsp--;
      nst+=2;
    }

      nsp = 1;
      nst = nst-4;
  for(int i=1;i<=n-1;i++){
      for(int j =1;j<=nsp;j++){ //spaces ulta
        System.out.print(" "+" ");
      }
        for(int k =1;k<=nst;k++){
        System.out.print("*"+" ");
      }
      System.out.println();
      nsp++;
      nst-=2;
    }

}
}
