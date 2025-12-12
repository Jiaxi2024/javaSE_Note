import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //create list
        ArrayList<Integer> list = new ArrayList<>();

        //input 0-100
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true) {
            String str = sc.nextLine();
            num = Integer.parseInt(str);
            //if legel 1-100
            if(num<1||num>100){
                System.out.println("out of range");
                continue;
            }
            //add to list
            list.add(num);
            //is 200
            int sum = getSum(list);
            if(sum>200){
                break;
            }
        }

    }

    private static int getSum(ArrayList<Integer> list) {

        int sum= 0;
        for(int i = 0;i<list.size();i++){
            int num = list.get(i);
            sum = sum+num;
        }
        return sum;

    }
}
