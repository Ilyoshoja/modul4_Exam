import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class GetDayName {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("yilni kiriting:");
        int year=scanner.nextInt();
        System.out.println("Oyni kiriting:");
        int month=scanner.nextInt();
        System.out.println("Kunni kiriting:");
        int day=scanner.nextInt();
        LocalDate localDate=LocalDate.of(year,month,day);
        switch (localDate.getDayOfWeek()){
            case MONDAY -> System.out.println("Dushanba");
            case TUESDAY -> System.out.println("Seshanba");
            case WEDNESDAY -> System.out.println("Chorshanba");
            case THURSDAY -> System.out.println("Payshanba");
            case FRIDAY -> System.out.println("Juma");
            case SATURDAY -> System.out.println("Shanba");
            case SUNDAY -> System.out.println("Yakshanba");
        }
//        System.out.println(localDate.getDayOfWeek());


    }
}
