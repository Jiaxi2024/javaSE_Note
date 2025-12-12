public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i : arr) {
            i = 5;
        }
        System.out.println(arr[0]);
        /*for (int i : arr) {
            System.out.println(arr[i]);
        }*/
    }
}
