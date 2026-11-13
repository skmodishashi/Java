
// by taking another 

public class arrayrotation {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int n = arr.length; //7
        int k = 5;
        k=k%n; // when no. of rotation is more than n 
       
        int[] brr = new int[n];

        for(int i=n-k;i<n;i++){
           brr[i-(n-k)]=arr[i];
           //

        }
        for(int i=0;i<n-k;i++){
           brr[k+i] = arr[i];
        }
        for(int i=0;i<n;i++){
        System.out.print(brr[i]+" ");
        }
    }
}
