import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] ch = new char[str.length()];
        Boolean flag = false;

        //遍历字符串charat，字符数组,双指针
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        //完全不含{{}}
        Boolean specialFlag = isSimble(ch);

        //{} {{}}
        int indexRight = ch.length-1;
        int indexLeft = 0;
        Boolean validFlag = isValid(ch,indexLeft,indexRight);

        //判断{{}}内内容，空格
        Boolean emptyFlag = isEmpty(ch,indexLeft,indexRight);

        //继续判断嵌套

        //输出
        if(specialFlag){
            System.out.println("true");
        }else if(validFlag&&emptyFlag){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    public static Boolean isSimble(char[] ch){
        for (int i = 0; i < ch.length; i++) {
            if ((ch[i] != '{') && (ch[i] != '}')) {
                return true;
            }
        }
        return false;
    }

    public static Boolean isValid(char[] ch,int indexLeft, int indexRight){
        for(int i = 0;i<ch.length;i++){
            if(ch[i]=='{'){
                if(ch[i+1]!='{'){
                    return false;
                }else{
                    indexLeft=i;
                    break;
                }
            }
        }

        for(int i = ch.length-1;i>0;i--){
            if(ch[i]=='}'){
                if(ch[i-1]!='}'){
                    return false;
                }else{
                    indexRight=i;
                    break;
                }
            }
        }

        if((indexLeft+1)>=(indexRight-1)){
            return false;
        }


        return true;
    }

    public static Boolean isEmpty(char[] ch,int indexLeft, int indexRight) {
        int count =0;
        if((indexRight-indexLeft)==3){
            return false;
        }

        for(int i = indexLeft+1;i<indexRight-1;i++){
            if(ch[i]==' '){
                count++;
            }
        }
        if(count == (indexRight-indexLeft-3)){
            return false;
        }
        return true;
    }


}