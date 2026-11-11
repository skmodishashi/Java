import java.util.ArrayList;

public class arraylistadd {
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println(list+" "+list.size());
    list.add(60);
    System.out.println(list+" "+list.size());
    list.add(70);
    System.out.println(list+" "+list.size());
    list.add(80);
    System.out.println(list+" "+list.size());
    
    list.remove(1); //removed index 1 element
    System.out.println(list+" "+list.size());
}   
}
