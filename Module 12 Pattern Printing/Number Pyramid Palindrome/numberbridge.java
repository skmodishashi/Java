
// 1 2 3 4 5 6 7 
// 1 2 3   5 6 7 
// 1 2       6 7 
// 1           7 
import java.util.Scanner;

public class numberbridge {
  
public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter n : ");
  int n = sc.nextInt();

  for(int m =1;m<=2*n-1;m++){
    System.out.print(m+" ");
  }
  System.out.println();
  n--;
  for(int i=1;i<=n;i++){
    int a=1;
      for(int j =1;j<=n-i+1;j++){ //number
        System.out.print(a +" ");
        a++;
      }
      for(int k =1;k<=2*i-1;k++){ //spaces
        System.out.print(" "+" ");
        a++;
      }
      for(int l =1;l<=n-i+1;l++){ //number
        System.out.print(a +" ");
        a++;
      }

      System.out.println();

  }
}
}
    //  M2 without initalizing a
      // for(int l =n+i+1;l<=2*(n+1)-1;l++){
      //   System.out.print(l+" ");
      // }