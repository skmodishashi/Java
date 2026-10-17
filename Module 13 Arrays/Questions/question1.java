// Q: Given an array of marks of students, if the mark of any
// student is less than 35 print its roll number. [roll number
// here refers to the index of the array.

public class question1 {
    public static void main(String[] args) {
      
    int[] marks = {39,34,65,13,46,76,43,52,14,52,23};
      int n = marks.length;
      for(int i=0;i<n;i++){
        if(marks[i]<35) 
            System.out.print(i+" ");
      }
    }  
}
