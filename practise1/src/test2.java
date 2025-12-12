import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //transfer String to int(implement the parseInt() function)
        //constraints: string only has number, digit1-10, no start with 0

        //string
        String str = "12345";

        //constraints
        if(!str.matches("[1-9]\\d{0,9}")){
            System.out.println("format error");
        }

        int num = 0;
        for(int i = 0;i<str.length();i++){
            char c= str.charAt(i);
            int digit = c-'0';
            num = num*10+digit;
        }

        System.out.println(num);

    }
}
