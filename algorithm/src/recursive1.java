public class recursive1 {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);


    }

    private static int getSum(int i) {
        if(i == 1){
            return 1;
        }
        int sum = i+getSum(i-1);
        return sum;

    }
}
