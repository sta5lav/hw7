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
        int upCash = 2_459_000;
        int month = 1;
        while(cash < upCash){
            cash = cash + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + cash + " рублей" );
            month++;
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
        System.out.println();
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int countryY = 12_000_000;
        int upPopulation = 17;
        int downPopulation = 8;
        int diffPopulation = upPopulation * (countryY/1000) - downPopulation * 12_000;
        for (int year = 1; year < 11; year++){
            countryY = countryY + diffPopulation;
            System.out.println("Год " + year + ", численность населения составляет " + countryY);
        }

    }
    public static void task4 () {
        System.out.println("Задача 4");
        int vklad = 15_000;
        int cash = 0;
        int month = 1;
        int maxPredel = 12_000_000;
        float kfc = 0.07f;
        while (cash < maxPredel) {
            cash = cash + vklad;
            cash = cash + (int)(cash*kfc);
            System.out.println("Месяц: " + month + ". Сумма: " + cash);
            month++;
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int vklad = 15_000;
        int cash = 0;
        int month = 1;
        int maxPredel = 12_000_000;
        while (cash < maxPredel) {
            cash = cash + vklad;
            cash = cash + (cash*7)/100;
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ". Сумма: " + cash);
            }
            month += 1;
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int month = 1;
        int years = 9 * 12;
        int vklad = 15_000;
        int cash = 0;
        float kfc = 0.07f;
        while(month <= years){
            cash = cash + vklad;
            cash = cash + (int)(cash*kfc);
            if (month % 6 == 0) {
                System.out.println("Месяц: " + month + ". Сумма: " + cash);
            }
            month += 1;
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int friday = 3;
        int month = 31;
        for(int day = 0; day <= month; day++){
            if(day % 7 == 3) {
                System.out.println("Сегодня пятница: " + day + " число");
            }
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int currentYear = 2022;
        int flyPeriod = 79;
        int startDate = currentYear - 200;
        int finishDate = currentYear + 100;
        int date = 0;
        for (int i = 0; i < finishDate; i += 79) {
            date = date + flyPeriod;
            if (date > startDate && date < finishDate) {
                System.out.println(date);
            }
        }
    }
}