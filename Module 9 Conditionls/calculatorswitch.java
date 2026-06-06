import java.util.Scanner;

public class calculatorswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no. : ");
        int a = sc.nextInt();
        System.out.print("Enter Operator : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter Second no. : ");
        int b = sc.nextInt();

        switch (op){
            case '+':
                 System.out.println(a+b);
                 break;
            case '-':
                 System.out.println(a-b);
                 break;
            case '*':
                 System.out.println(a*b);
                 break;
            case '/':
                 System.out.println(a/b);
                 break;
                 default :
                 System.out.println("Invalid Operator");
        }
    }
    
}
