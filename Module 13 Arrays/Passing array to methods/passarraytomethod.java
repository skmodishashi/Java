// array is passed by pass by refrence to methods
// element is passed by pass by value to methods

public class passarraytomethod {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr); // element changes
        System.out.println(arr[0]);
    }

    private static void change(int[] x) {
        x[0]=90;
    }
}
