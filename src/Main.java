public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int age = 29;
        System.out.println("Значение переменной age с типом int равно " + age );
        byte dogsAge = 10;
        System.out.println("Значение переменной dogsAge с типом byte равно " + dogsAge );
        short daysCount = 10629;
        System.out.println("Значение переменной daysCount с типом short равно " + daysCount );
        long sunTemp = 27000000;
        System.out.println("Значение переменной sunTemp с типом long равно " + sunTemp );
        float sunsAge = 37.78f;
        System.out.println("Значение переменной sunsAge с типом float равно " + sunsAge );
        double sunsDensity = 1.41;
        System.out.println("Значение переменной sunsDensity с типом double равно " + sunsDensity );

        //Задание 2
        double numberOne = 27.12;
        long numberTwo = 987678965549L;
        byte numberThree = 2;
        int numberFour = 786;
        boolean numberFive = 10<5;
        short numberSix = 569;
        float numberSeven = -159F;
        int numberEight = 27897;
        byte numberNine = 67;

        //Задание 3
        System.out.println("Задание 3");
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int totalSheets = 480;
        int totalPupils = lP + aS + eA;
        int pupilSheets= totalSheets / totalPupils;
        System.out.println("На каждого ученика рассчитано по " + pupilSheets+ " листов бумаги");

        //Задание 4
        System.out.println("Задание 4");
        int machineProductivityPer2Mins = 16;
        int machineProductivityPer1Min = machineProductivityPer2Mins / 2;
        var machineProductivityPer20Min = machineProductivityPer1Min * 20;
        System.out.println("За 20 минут машина произвела " + machineProductivityPer20Min+ " бутылок");
        int machineProductivityPer1Day = machineProductivityPer1Min * 1440;
        System.out.println("За 1 день машина произвела " + machineProductivityPer1Day+ " бутылок");
        int machineProductivityPer3Days = machineProductivityPer1Day * 3;
        System.out.println("За 3 дня машина произвела " + machineProductivityPer3Days+ " бутылок");
        int machineProductivityPer1Month = machineProductivityPer1Day * 30;
        System.out.println("За 1 месяц машина произвела " + machineProductivityPer1Month+ " бутылок");

        //Задание 5
        System.out.println("Задание 5");
        int whitePaint1Class = 2;
        int brownPaint1Class =4;
        int totalPaint = 120;
        int totalPaintForClass = totalPaint / (whitePaint1Class + brownPaint1Class);
        int totalWhitePaint = whitePaint1Class * totalPaintForClass;
        int totalBrownPaint = totalPaintForClass * brownPaint1Class;
        System.out.println("В школе где " + (totalPaintForClass) + " классов, нужно " + totalWhitePaint + " банок белой краски и " + (totalBrownPaint) + " банок коричневой краски");

        //Задание 6
        System.out.println("Задание 6");
        int banana = 80*5;
        int milk = 105 *2;
        int icecream = 100*2;
        int egg = 70 * 4;
        int totalAmount = banana + milk + icecream + egg;
        System.out.println("Общий вес спорт-завтрака составляет " + (totalAmount) +" грамм");
        int kg = 1000;
        double kgAmount = (double) (totalAmount)/kg;
        System.out.println("или " + (kgAmount) + " кг");

        //Задание 7
        System.out.println("Задание 7");
        int grPerKg = 1000;
        int weightToLose = 7 * grPerKg;
        int minDayLoss = 250;
        int maxDayLoss = 500;
        int slowResult = weightToLose / minDayLoss;
        System.out.println(slowResult + " дней займет медленное похудение");
        int fastResult = weightToLose/ maxDayLoss;
        System.out.println(fastResult + " дней займет быстрое похудение");
        int averageResult = (slowResult + fastResult) / 2;
        System.out.println("В среднем похудение займет " + averageResult + " день");

        //Задание 8
        System.out.println("Задание 8");
        float Masha = 67760;
        float Den = 83690;
        float Kris = 76230;
        float mashaNewSalary =  (Masha / 100 * 10) +  Masha;
        System.out.println("Новая зарплата Маши составляет " + mashaNewSalary + " рублей");
        float denNewSalary = Den / 100 * 10 + Den;
        System.out.println("Новая зарплата Дениса составляет " + denNewSalary + " рублей");
        float krisNewSalary = Kris / 100 * 10 + Kris;
        System.out.println("Новая зарплата Кристины составляет " + krisNewSalary + " рублей");
        float SalaryMashaDiff = (mashaNewSalary * 12) - (Masha * 12);
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + SalaryMashaDiff + " рублей");
        float SalaryDenDiff = (denNewSalary * 12) - (Den * 12);
        System.out.println("Денис теперь получает " + denNewSalary + " рублей. Годовой доход вырос на " + SalaryDenDiff + " рублей");
        float SalaryKrisDiff = (krisNewSalary * 12) - (Kris * 12);
        System.out.println("Кристина теперь получает " + krisNewSalary + " рублей. Годовой доход вырос на " + SalaryKrisDiff + " рублей");



    }
}