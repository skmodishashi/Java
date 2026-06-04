import java.util.Scanner;

public class Mod {
   
   public static void main(String[] var0) {
      System.out.print("Enter no. : ");
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 >= 0) {
         System.out.println(var2);
      } else {
         System.out.println(-var2);
      }

   }
}
