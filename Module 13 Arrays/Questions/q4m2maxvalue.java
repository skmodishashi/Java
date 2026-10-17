import java.util.Scanner;

public class q4m2maxvalue {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter array size : ");
    int n = sc.nextInt();
    System.out.print("Enter array elements : ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    //solution
    int max = Integer.MIN_VALUE;
    for(int i=1;i<n;i++){
    // if(arr[i]>max) max = arr[i]; use either this or lower one
     max = Math.max(max, arr[i]);
    }
    System.out.print("The max value is " +max);
   
}
