public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int cash = 0;
        int salary = 15_000;
        while(cash < 2_459_000){
            cash = cash + salary;
            System.out.println("Месяц " + cash/salary + ", сумма накоплений равна " + cash + " рублей" );
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int i = 1;
        int x = 10;
        while (i < 11){
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for(; x > 0; x--){
            --i;
            System.out.print(i + " ");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        int upPopulation = 17;
        int downPopulation = 8;
        int diffPopulation = upPopulation * 12_000 - downPopulation * 12_000;
        for (int i = 1; i < 11; i++){
            countryY = countryY + diffPopulation;
            System.out.println("Год " + i + ", численность населения составляет " + countryY);
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int vklad = 15_000;
        int cash = 0;
        int i = 1;
        while (cash < 12_000_000) {
            cash = cash + vklad;
            cash = cash + (cash*7)/100;
            System.out.println("Месяц: " + i + ". Сумма: " + cash);
            i = i + 1;
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int vklad = 15_000;
        int cash = 0;
        int i = 1;
        while (cash < 12_000_000) {
            cash = cash + vklad;
            cash = cash + (cash*7)/100;
            if (i % 6 == 0) {
                System.out.println("Месяц: " + i + ". Сумма: " + cash);
            }
            i += 1;
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int i = 1;
        int years = 9 * 12;
        int vklad = 15_000;
        int cash = 0;
        while(i <= years){
            cash = cash + vklad;
            cash = cash + (cash*7)/100;
            if (i % 6 == 0) {
                System.out.println("Месяц: " + i + ". Сумма: " + cash);
            }
            i += 1;
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 3;
        int month = 31;
        for(int i = 0; i <= month; i++){
            if((i - 3) % 7 == 0)
                System.out.println("Сегодня пятница: " + i + " число");
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int flyPeriod = 79;
        int startDate = 1822;
        int finishDate = 2122;
        int date = 0;
        for (int i = 0; i < 2100; i += 79) {
            date = date + flyPeriod;
            if (date > startDate && date < finishDate) {
                System.out.println(date);
            }
        }
    }
}