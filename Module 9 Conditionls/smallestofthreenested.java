import java.util.Scanner;

public class smallestofthreenested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First No. : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second No. : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third No. : ");
        int c = sc.nextInt();
        if(a<b){
            if(a<c) System.out.println(a+" is the Smallest");
            else System.out.println(c+ " is the Smallest");
        }
        else{
            if(b<c) System.out.println(b+ " is the Smallest");
            else System.out.println(c+ " is the Smallest");
        }
    }
}
