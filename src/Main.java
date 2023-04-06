public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задача 1");
        int geld = 15000;
        int monat = 0;
        while (monat < 2459000){
            int a = 1;
            for (a = 1; monat < 2459000; a = a +1)
            monat = monat + geld;
            System.out.println(a + " месяцев нужно, чтобы накопить " + monat + " рублей. ");
        }

        //task 2
        System.out.println("Задача 2");
        int q = 1;
        while (q <= 10) {
            System.out.print( " " + q +  " ");
            q=q+1;
        }
        System.out.println(" ");

        for (int w = 10; w >= 1; w = w - 1) {


            System.out.print( " " + w + " ");

        }

        //task 3
        System.out.println(" ");
        System.out.println("Задача 3");
        int leute = 12_000_000;
        int ras = leute / 1000; // 12000 раз
        int neuLeute = 17;
        int altLeute = 8;
        int ras2 = neuLeute - altLeute; // чистые 9 человек
        int jahre = 10;
        int ch = ras2 * ras; // 108000 человек чистыми в год
        int ch2 = ch * jahre; // 1080000 за 10 лет чистыми
        int ch3 = 12000000;

            for (int a = 1; a <= 10; a = a +1) {
                ch3 = ch3 + ch;

                System.out.println("Год " + a + " численность населения составляет " + ch3);

        }
            // task 4-5
        System.out.println("Задача 4 - 5");
        int geld2 = 15000;
        int monat2 = 0;
            for (int a2 = 1; monat2 <= 12_000_000; a2 = a2 +1) {
                monat2 = monat2 + geld2 / 700;
                if (a2 % 6 == 0) {
                    System.out.println(a2 + " месяц, накопления составляют " + monat2 + " рублей. ");
                }
            }

// task 6
        System.out.println("Задача 6");
        int geld3 = 15000;
        int monat3 = 0;

        for (int a3 = 1; a3 <= 108; a3 = a3 +1) {
            monat3 = monat3 + geld3/700;
            monat3 = monat3 + geld3;
            if (a3 % 6 == 0) {
                System.out.println(a3 + " месяц, накопления составляют " + monat3 + " рублей. ");
            }

        }
            }

    }