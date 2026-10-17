// Q: Calculate the sum of all the elements in the given
// array.

public class q2 {

    public static void main(String[] args) {
      
    int[] arr = {39,34,65,13,46,76,43,52,14,52,23};
      int sum=0;
      for(int i=0;i<arr.length;i++){
       sum += arr[i];                
        
      }
      System.out.println(sum);
    }  
}

