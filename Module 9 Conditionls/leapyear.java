import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int n = sc.nextInt();
        if((n%4==0 || n%2!=0) || n%400==0) System.out.println(n+" is a Leap Year");
        else System.out.println(n+ " is Not a leap Year");
    }
}

// M-2
// if(n%4==0){
//     if(n%100==0){
//            if(n%400==0){
//                  System.out.println(n+" is a Leap Year");
//            }
//            else System.out.println(n+ " is Not a leap Year");
//     }
//     else System.out.println(n+" is a Leap Year");
// }
// else System.out.println(n+ " is Not a leap Year");
