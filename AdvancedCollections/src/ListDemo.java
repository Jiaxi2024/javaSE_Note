import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        list.add(1,"qqq");
        System.out.println(list);

        String remove = list.remove(1);
        System.out.println(remove);
        System.out.println(list);

        String set = list.set(1,"www");
        System.out.println(set);
        System.out.println(list);

        String get = list.get(2);
        System.out.println(get);
        System.out.println(list);

        List<String> l;
        l = new ArrayList<>();

        //1.

        ListIterator<String> it = list.listIterator();



    }
}
