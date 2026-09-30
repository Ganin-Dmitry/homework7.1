public class Main {
    public static void main(String[] args) {

        //Задача 1
        int totalAmount = 2459000;
        float amount = 0f;
        int oneMonthDeposit = 15000;
        float coefficientPercent = 1.01f;
        int month = 0;
        while (amount < totalAmount) {
            month++;
            amount = amount * coefficientPercent + oneMonthDeposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + amount + " рублей.");

        }

        //Задача 2
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 3
        int population = 12000000;
        int birthRate = 17 * population / 1000;
        int mortalityRate = 8 * population / 1000;
        for (int i = 1; i <= 10; i++) {
            population = population + birthRate - mortalityRate;
            System.out.println("Год " + i + ": численность населения составляет " + population + " человек.");
        }

        //Задача 4
        totalAmount = 12000000;
        amount = 0f;
        coefficientPercent = 1.07f;
        oneMonthDeposit = 15000;
        month = 0;
        while (amount < totalAmount) {
            month++;
            amount = amount * coefficientPercent + oneMonthDeposit;
            System.out.println("Месяц " + month + ": сумма накоплений " + amount + " рублей.");
        }

        //Задача 5
        amount = 0f;
        month = 0;
        while (amount < totalAmount) {
            month++;
            amount = amount * coefficientPercent + oneMonthDeposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ": сумма накоплений " + amount + " рублей.");
            }
        }

        //Задача 6
        amount = 0f;
        int timeYears = 9;
        for (month = 1; month <= timeYears * 12; month++) {
            amount = amount * coefficientPercent + oneMonthDeposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ": сумма накоплений " + amount + " рублей.");
            }
        }

        //Задача 7
        int firstFriday = 4;
        if (firstFriday <= 7) {
            for (int day = firstFriday; day < 31; day+=7) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
        } else {
            System.out.println("Число первой пятницы месяца введено не правильно.");
        }

        //Задача 8
        int thisYear = 2026;
        for (int cometYears = 0; cometYears < thisYear + 100; cometYears+=79) {
            if (thisYear - 200 < cometYears) {
                System.out.println(cometYears);
            }
        }

    }
}