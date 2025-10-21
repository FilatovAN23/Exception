import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите день");
        int day = myScanner.nextInt();
        System.out.println("Введите месяц");
        int months = myScanner.nextInt();
        System.out.println("Введите год");
        int year = myScanner.nextInt();
        try {
            MyDate date = new MyDate(day,months,year);
            System.out.println(date.toString());
            //Вызовы методов
        }
        catch (MyException e){
            System.out.println(e.getMessage()+" "+e.getDate());
        }
    }
}