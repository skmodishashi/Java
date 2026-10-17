// Q: Find the maximum value out of all the elements in the
// array.

import java.util.Scanner;

public class q4maxvalue {
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
    int max = arr[0];
    for(int i=1;i<n;i++){
    if(arr[i]>max) max = arr[i];
    }
    System.out.print("The max value is " +max);

}

}
