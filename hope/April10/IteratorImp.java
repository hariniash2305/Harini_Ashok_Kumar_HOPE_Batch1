import java.util.*;

public class IteratorImp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);    
        list.add(20);
        list.add(30);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            if(it.next() == 20) {
                it.remove();
            }
        }
        System.out.println(list);
    }
}