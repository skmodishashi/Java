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
      for(int j =1;j<=n-i+1;j++){
        System.out.print(j+" ");
      }
      for(int k =1;k<=2*i-1;k++){
        System.out.print(" "+" ");
      }
      for(int l =n+i+1;l<=2*(n+1)-1;l++){
        System.out.print(l+" ");
      }

      System.out.println();

  }
}
}
