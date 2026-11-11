

import java.util.ArrayList;

public class basicsofarraylist {
public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>(5); //5 is the capacity not the fix size i can add more without changing the capacity after assiging it will automatically change the capacity
    arr.add(0,10); // arr[0]=10
    arr.add(1,20);
    arr.add(2,30);
    arr.add(3,40);
    arr.add(4,50);
    System.out.println(arr.get(0));
    System.out.println(arr); //builtin function to give all values
    System.out.println(arr.size()); //gives the size/capacity
    for(int i=0;i<5;i++){
        System.out.print(arr.get(i)+" "); //arr[i]
    }
    System.out.println();
    arr.set(1, 200); // modify index 1
    for(int i=0;i<5;i++){
        System.out.print(arr.get(i)+" "); //arr[i]
    }
    
    System.out.println();
    arr.add(60);  // size changes added to the last
    System.out.print(arr.size()); //gives the size/capacity
    System.out.println();
    for(int i=0;i<6;i++){
        System.out.print(arr.get(i)+" "); //arr[i]
    }
}
}
