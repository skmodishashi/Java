// 5: Find the element 'x' in the array. Take array
// and x as input.

import java.util.Scanner;

public class q3linearsearch {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter target element : ");
    int x = sc.nextInt();
    
    System.out.print("Enter array size : ");
    int n = sc.nextInt();
    System.out.print("Enter array elements : ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    //solution
    boolean flag = false;  // false means not found
    for(int i=0;i<n;i++){
        if(arr[i]==x){
             flag = true; // true means found
             break;}

        }
        if(flag==true) System.out.println("Element Found");
        else System.out.println("Element not found");
}   
}
