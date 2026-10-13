
//   12345
//   12345
//   12345
//   12345



import java.util.Scanner;

public class numberrectangle {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Rows : ");
        int x = sc.nextInt();
        System.out.print("Enter Columns : ");
        int y = sc.nextInt();
        for(int i=1;i<=x;i++){ //rows
          for(int j=1;j<=y;j++){ //Columns
            System.out.print(j+" ");}
         System.out.println();
    } 
    }
}
