import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");

        for (String s : coll) {

        }


        //获取迭代器对象
        //迭代器就像箭头，默认指向集合的0索引
        Iterator<String> it = coll.iterator();
        while(it.hasNext()){
            String str = it.next();//next方法：获取元素+移动指针
            System.out.println(str);
        }

        //循环结束，迭代器指向了没有元素的位置
        //it.next();    //NoSuchElementExeption

        //迭代器遍历完毕，指针不会复位

        //如果想继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
