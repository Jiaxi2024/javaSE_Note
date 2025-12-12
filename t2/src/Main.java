import java.util.Scanner;

import static java.lang.Math.min;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String text1 = in.nextLine();
        String text2 = in.nextLine();

        char[] char1 = new char[text1.length()];
        char[] char2 = new char[text2.length()];
        char[] char3 = new char[min(text1.length(),text2.length())];//mark the biggest share char

        for(int i = 0;i<text1.length();i++){
            char1[i] = text1.charAt(i);
        }

        for(int i = 0;i<text2.length();i++){
            char1[i] = text2.charAt(i);
        }

        int k = 0;
        int leftIndex = 0;
        for(int i = 0;i<text1.length();i++){
            for(int j = leftIndex;j<text2.length();j++){
                if(char1[i]==char2[j]){
                    char3[k]=char1[i];
                    k++;
                    leftIndex = j;
                }
            }
        }


        System.out.println(char3.length);
    }
}