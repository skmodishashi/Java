

//    A B C D E F     ascii 65=A  90=Z  97=a  122=z  ('0' as ascii value is 48)
//    A B C D E F                                    ('1' as ascii value is 49...... '9'=57)
//    A B C D E F
//    A B C D E F
//    A B C D E F


import java.util.Scanner;

public class alphabetrectangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter Rows : ");
        int x = sc.nextInt();
        System.out.print("Enter Columns : ");
        int y = sc.nextInt();

        for(int i=1;i<=x;i++){ //rows
          for(int j=1;j<=y;j++){ //Columns
            System.out.print((char)(64+j) +" ");}   // only do typecast i.e. change datatype
        System.out.println();
    } 
    }
}