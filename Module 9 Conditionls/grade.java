import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Persentage(%) : ");
        int a = sc.nextInt();
        if(a>=81) System.out.println("Very Good");  
        else if(a>=61) System.out.println("Good");
        else if(a>=41) System.out.println("Average");
        else System.out.println("Fail");
    }
}
