
//   A A A A
//   B B B B
//   C C C C
//   D D D D


import java.util.Scanner;



public class alphabetrepeatpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();

        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}
