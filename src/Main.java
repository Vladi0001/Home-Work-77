public class Main {
    public static void main(String[] args) {

       //task 1
        System.out.println("Задача 1");
        int money = 15000;
        int month = 0;
        while (month < 2459000) {
            int a = 1;
            for (a = 1; month < 2459000; a = a + 1)
                month = month + money;
            System.out.println(a + " месяцев нужно, чтобы накопить " + month + " рублей. ");
        }

        //task 2
        System.out.println("Задача 2");
        int q = 1;
        while (q <= 10) {
            System.out.print(" " + q + " ");
            q = q + 1;
        }
        System.out.println(" ");

        for (int w = 10; w >= 1; w = w - 1) {


            System.out.print(" " + w + " ");

        }

        //task 3
        System.out.println(" ");
        System.out.println("Задача 3");


        int newPeople = 17;
        int oldPeople = 8;
        int ras2 = newPeople - oldPeople; // чистые 9 человек
        int ch3 = 12000000;

        for (int a = 1; a <= 10; a = a + 1) {
            ch3 = ch3 * ras2/1000 + ch3;




            System.out.println("Год " + a + " численность населения составляет " + ch3);

        }
        // task 4-5
        System.out.println("Задача 4 - 5");
        double monht2 = 15000;
        int money2 = 15000;
        for (int a2 = 1; monht2 <= 12_000_000; a2 = a2 + 1) {
            monht2 = monht2 + money2 * 0.7;
            if (a2 % 6 == 0) {
                System.out.println(a2 + " месяц, накопления составляют " + monht2 + " рублей. ");
            }
        }

// task 6
        System.out.println("Задача 6");
        int money3 = 15000;
        double month3 = 15000;

        for (int a3 = 1; a3 <= 108; a3 = a3 + 1) {
            month3 = month3 + money3* 0.7;
            if (a3 % 6 == 0) {
                System.out.println(a3 + " месяц, накопления составляют " + month3 + " рублей. ");
            }

        }

       // task 7
        System.out.println("Задача 7");
        for ( int friday = 7; friday <= 31; friday = friday + 7) {

                System.out.println("Cегодня " + friday + " число. Пятница, пора сделать отчёт");

        }

      // task 8
        System.out.println("Задача 8");
        int year1 = 2023 - 200;
        int year2 = 2023 + 100;

        for (year1 = 1823; year1 <= 2130; year1 = year1 + 1 ) {
            if (year1 % 79 == 0)
            System.out.println(year1);
        }



    }
}