import java.util.ArrayList;

public class BasicSearch1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 11};
        int num = 11;


        ArrayList<Integer> list = BasicSearch(arr,num);
        System.out.println(list);
    }

    private static ArrayList<Integer> BasicSearch(int[] arr,int num) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                list.add(i);
            }
        }
        return list;

    }
}
