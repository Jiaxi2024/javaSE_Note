public class binarySearchDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8};
        int index = binarySearchCode(arr, 4);
        System.out.println(index);
    }

    private static int binarySearchCode(int[] arr, int i) {
        int startIndex = 0;
        int endIndex = arr.length;

        while (true) {
            int mid = (startIndex+endIndex)/2;
            if(arr[mid]==i){
                return mid;
            }

            if(arr[mid]<=i){
                startIndex=mid+1;
            }

            if(arr[mid]>=i){
                endIndex=mid-1;
            }
        }
    }
}
