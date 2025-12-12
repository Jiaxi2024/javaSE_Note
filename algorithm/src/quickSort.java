
public class quickSort {
    public static void main(String[] args) {

        // 定义一个待排序数组
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};

        // 调用快速排序算法
        quickSort(arr, 0, arr.length - 1);

        // 输出排序结果
        System.out.println("排序后的数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**
     * 快速排序主方法
     * @param arr   要排序的数组
     * @param i     左边界
     * @param j     右边界
     */
    public static void quickSort(int[] arr, int i, int j) {
        // 递归出口：当左边界 >= 右边界时，说明区间内只有一个或零个元素，不需要排序
        if (i >= j) {
            return;
        }

        // 1️⃣ 记录基准值（取最左边的元素）
        int baseNumber = arr[i];

        // 2️⃣ 定义左右指针
        int start = i;
        int end = j;

        // 3️⃣ 当左右指针没有相遇时，循环继续
        while (start != end) {

            // 从右往左找，找到第一个比基准值小的数字
            while (start < end && arr[end] >= baseNumber) {
                end--;
            }

            // 从左往右找，找到第一个比基准值大的数字
            while (start < end && arr[start] <= baseNumber) {
                start++;
            }

            // 交换左右指针指向的元素
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        // 4️⃣ 最终，左右指针相遇，把基准值放到正确位置（start == end）
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        // 5️⃣ 递归处理左半边和右半边
        quickSort(arr, i, start - 1);   // 左半边
        quickSort(arr, start + 1, j);   // 右半边
    }
}
