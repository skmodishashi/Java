import java.util.Scanner;

public class threedigitnumbe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int n = sc.nextInt();
        if(n>99 && n<1000) System.out.println("Given no. is three digit number");
        else System.out.println("Given no. is not three digit number");
    }
}



//  &&  ----->>  logical and         & --->> bitwise and
//  ||  ----->>  logical or          | --->> bitwise or