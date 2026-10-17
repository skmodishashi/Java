// Q : Find the second largest element in the given array.

import java.util.Scanner;

public class q5secondlargest {
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

    int smax = arr[0];
    for(int i=1;i<n;i++){
    if(arr[i]!=max && arr[i]>smax) smax = arr[i];
    }
    System.out.print("The second max value is " +smax);
 
}

