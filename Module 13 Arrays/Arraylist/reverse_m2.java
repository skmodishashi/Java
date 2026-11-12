
//by swap function
public class reverse_m2 {
    public static void main(String[] args) {
      int[] arr = {10,20,30,40,50,60,70};
      int n = arr.length;
      int i=0,j=n-1;   // i can swap/reverse middle part even by changing i and j
      while(i<=j){
        swap(arr,i,j);
        i++;
        j--;
      }
     for(int k=0;k<n;k++){
        System.out.print(arr[k]+" ");
     } }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    
}
