public class MyDate {
    int day, months, year;

    MyDate(int day, int months, int year)throws MyException{
        if(day>31||months>12||year<0||day<0||months<0) throw new MyException("Дата введене не корректно",day,months,year);
        this.day=day;
        this.months=months;
        this.year=year;
    }

    @Override
    public String toString() {
        return "Дата " + day +"."+ months +"."+ year;
    }

    /*
    1.добавить метод вывода данных
    2.метод - прибавить к дате заданное кол-во дней с получением новой даты
    3.метод-вычислить номер дня от начала года
    4.вычислит кол дней между двумя датами
    5.вычитания из даты n кол дней и получение новой даты
    * */
}
