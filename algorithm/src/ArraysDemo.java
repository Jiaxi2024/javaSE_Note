import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArraysDemo {
    public static void main(String[] args) {

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

    }
}
