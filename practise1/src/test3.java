public class test3 {
    public static void main(String[] args) {

        //define a method implement toBinaryString function


        int num = 123;
        StringBuilder sb = new StringBuilder();

        while(num!=0){
            int remain = num % 2;
            num = num/2;
            sb.insert(0,remain);
        }

        System.out.println(sb);

        System.out.println(Integer.toBinaryString(123));
    }
}
