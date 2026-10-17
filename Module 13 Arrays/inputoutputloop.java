import java.util.Scanner;

public class inputoutputloop {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = sc.nextInt();

    int[] arr = new int[n];

    //Input ->loop
    for(int i = 0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    //Output ->loop
    for(int i = 0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
