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
    }
}