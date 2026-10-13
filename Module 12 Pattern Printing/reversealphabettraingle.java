
// A A A A A 
// B B B B
// C C C 
// D D 
// E
import java.util.Scanner;

public class reversealphabettraingle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
          for(int j=1;j<=(n-i+1);j++){ 
            System.out.print((char)(64+i)+" ");}
         System.out.println();
    } 
    }  
}
