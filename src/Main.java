public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte soSmall = -70;
        short small = 357;
        int medium = 98198;
        long mediumPlus = 555888L;
        float fraction = 0.5f;
        double fractionPlus = 8.8889;
        System.out.println(soSmall);
        System.out.println(small);
        System.out.println(medium);
        System.out.println(mediumPlus);
        System.out.println(fraction);
        System.out.println(fractionPlus);

        System.out.println("Задача 2");
        byte soSmall1 = 67;
        short small2 = -159;
        short small1 = 27897;
        short small3 = 569;
        long mediumPlus4 = 987678965549L;
        float fraction5 = 27.12f;
        float fraction7 = 2.786f;
        System.out.println(soSmall1);
        System.out.println(small2);
        System.out.println(small1);
        System.out.println(small3);
        System.out.println(mediumPlus4);
        System.out.println(fraction5);
        System.out.println(fraction7);

        System.out.println("Задача 3");
        short paper = 480;
        byte studentAnna = 27;
        byte studentLuda = 23;
        byte studentEka = 30;
        short allStudent = (short)(studentEka + studentAnna + studentLuda);
        short paperOneStudent = (short)(paper / allStudent);
        System.out.println("На каждого ученика рассчитано " + paperOneStudent + " листов бумаги");

        System.out.println("Задача 4");
        byte glass = 16;
        short glass20Minute = (short) (glass * 20 / 2);
        System.out.println("За 20 минут машина произвела " + glass20Minute + " штук бутылок");
        short glass24Hours = (short) (glass * 24 * 60 / 2);
        System.out.println("За 24 часа машина произвела " + glass24Hours + " штук бутылок");
        int glass3Days = glass * 24 * 3 * 60 / 2;
        System.out.println("За 3 дня машина произвела " + glass3Days + " штук бутылок");
        int glass30Days = glass * 24 * 30 * 60 / 2;
        System.out.println("За 1 месяц машина произвела " + glass30Days + " штук бутылок");

        System.out.println("Задача 5");
        byte bank = 120;
        byte whiteBankOneClass = 2;
        byte brownBankOneClass = 4;
        byte allClass = (byte) (bank / (whiteBankOneClass + brownBankOneClass));
        byte allWhiteBank = (byte) (allClass * whiteBankOneClass);
        byte allBrownBank = (byte) (allClass * brownBankOneClass);
        System.out.println("В школе, где " + allClass + " классов, нужно " + allWhiteBank + " банок белой краски и " + allBrownBank + " банок коричневой краски.");

        System.out.println("Задача 6");
        byte banana = 5;
        short milkMl = 200;
        byte iceCream = 2;
        byte eggs = 4;
        short bananaMass = 5 * 80;
        short milkMlMass = 2 * 105;
        short iceCreamMass = 2 * 100;
        short eggsMass = 4 * 70;
        short allMassGrams = (short) (bananaMass + milkMlMass + iceCreamMass + eggsMass);
        float allMassKilogram = allMassGrams / 1000f;
        System.out.println("Масса завтрака в граммах составляет " + allMassGrams + " грамм, а  в килограммах " + allMassKilogram + " килограмм.");

        System.out.println("Задача 7");
        byte goal = 7;
        short min = 250;
        short max = 500;
        short goalGrams = 7 * 1000;
        short daysMax = (short) (goalGrams / min);
        short daysMin = (short) (goalGrams / max);
        int averageDays = (daysMax + daysMin) / 2;
        System.out.println("Если каждый день терять по 250 грамм, потребуется " + daysMax + " дней, если терять по 500 грам, то потребуется " + daysMin + " дней.");
        System.out.println("В среднем, потребуется " + averageDays +  " дней.");

        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaEars = masha * 12;
        int denisEars = denis * 12;
        int kristinaEars = kristina * 12;
        float mashaIncrease = masha / 100f * 10f;
        float mashaMonth = masha + mashaIncrease;
        float mashaIncreaseEars = (masha + mashaIncrease) * 12;
        float mashaDifferenceEars = mashaIncreaseEars - mashaEars;
        System.out.println("Маша теперь получает " + mashaMonth +  " рублей. Годовой доход вырос на " + mashaDifferenceEars + " рублей.");
        float denisIncrease = denis / 100f * 10f;
        float denisMonth = denis + denisIncrease;
        float denisIncreaseEars = (denis + denisIncrease) * 12;
        float denisDifferenceEars = denisIncreaseEars - denisEars;
        System.out.println("Денис теперь получает " + denisMonth +  " рублей. Годовой доход вырос на " + denisDifferenceEars + " рублей.");
        float kristinaIncrease = kristina / 100f * 10f;
        float kristinaMonth = kristina + kristinaIncrease;
        float kristinaIncreaseEars = (kristina + kristinaIncrease) * 12;
        float kristinaDifferenceEars = kristinaIncreaseEars - kristinaEars;
        System.out.println("Кристина теперь получает " + kristinaMonth +  " рублей. Годовой доход вырос на " + kristinaDifferenceEars + " рублей.");
    }
}