
import java.util.ArrayList;

public class ArrayL {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<>();
        myList.add("20210040080");
        myList.add("PUTRI");
        myList.add("21F");
        myList.add(2, "PUTRI");
        
        for(String list : myList){
            System.out.println(list);
        }
    }
}
