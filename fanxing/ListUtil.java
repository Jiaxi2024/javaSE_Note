import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}

    //类中定义一个静态方法addAll，用来添加多个集合的元素
    //只有这个方法用泛型
    public static <E> void addAll(ArrayList<E> list,E e1,E e2){
        list.add(e1);
        list.add(e2);
    }

    //其他方法不用泛型
    public void show(){

    }

}
