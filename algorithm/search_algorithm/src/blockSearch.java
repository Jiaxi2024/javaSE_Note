import java.util.ArrayList;

public class blockSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7,
                9, 8, 14, 11,
                17, 20, 24};

        Block b1 = new Block();
        int index = blockSearchCode(arr, 14);


    }

    private static int blockSearchCode(int[] arr, int i) {

        return 0;
    }
}

class Block{

    int startIndex;
    int endIndex;
    int min;
    int max;

}