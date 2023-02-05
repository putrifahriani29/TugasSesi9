
import java.util.ArrayDeque;

public class ArrayD {
    public static void main(String[] args) {
        ArrayDeque<String> myDeque = new ArrayDeque<>();
        myDeque.add("PUTRI FAHRIANI");
        myDeque.addFirst("20210040080");
        myDeque.add("PUTRI");
        myDeque.addLast("21F");
        
        for(String i : myDeque){
            System.out.println(i);
        }
    }
}
