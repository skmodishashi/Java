package Arraylist;

import java.util.Arrays;

public class builtinmethods {
    public static void main(String[] args) {
        int[] arr = {22,13,44,10};
        for (int ele : arr) { //foreach loop
            System.out.println(ele+" ");
        }
        Arrays.sort(arr);  // now sorted to ascending
        System.out.println();
        for(int i=1;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
