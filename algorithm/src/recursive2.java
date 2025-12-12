public class recursive2 {
    public static void main(String[] args) {
        int n = getMulti(5);

        System.out.println(n);
    }

    private static int getMulti(int i) {
        if(i == 1){
            return 1;
        }
        return i*getMulti(i-1);
    }
}
