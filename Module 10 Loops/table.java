import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        for(int i=n;i<=10*n;i+=n){
            System.out.println(i);
        }   // moves only 10 rounds
        
    }
}


//   m-2   for(int i=n;i<=10*n;i++){
//     if(i%n==0)System.out.println(i);
//     }      moves 10*n rounds 