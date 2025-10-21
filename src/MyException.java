public class MyException extends Exception {
    String exceptionName;
    int day, months, year;

    MyException(String exceptionName, int day, int months, int year){
        super(exceptionName);
        this.day=day;
        this.months=months;
        this.year=year;
    };

    String getDate(){
        return day+"."+months+"."+year;
    }
}
