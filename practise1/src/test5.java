import java.time.LocalDate;

public class test5 {
    public static void main(String[] args) {

        LocalDate ld = LocalDate.of(2000,3,1);
        Boolean flag = ld.isLeapYear();
        System.out.println(flag);
    }
}
