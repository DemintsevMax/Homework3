public class Main {
    public static void main(String[] args) {
        byte a = 1;
        System.out.println("Значение переменной с типом byte " + " ровно " + a);
        short b = 12342;
        System.out.println("Значение переменной с типом short " + " ровно " + b);
        int c = 413434;
        System.out.println("Значение переменной с типом int " + " ровно " + c);
        long d = 56434353;
        System.out.println("Значение переменной с типом long " + " ровно " + d);
        float e = 1.5454344f;
        System.out.println("Значение переменной с типом float " + " ровно " + e);
        double f = 2.545434489964169;
        System.out.println("Значение переменной с типом double " + " ровно " + f);
        float a1 = 27.12f;
        float b1 = 987678965549f;
        float c1 = 2.786f;
        short e1 = 569;
        short f1 = -159;
        short g1 = 27897;
        byte i1 = 67;
        short lP = 23;
        short aS = 27;
        short eA = 30;
        int result1 = 480 / (lP + aS + eA);
        System.out.println("На каждого ученика расчитано " + "480/(lP+aS+eA) " + result1 + " листов бумаги");
        byte bottle = 16;
        byte time = 2;
        byte t1 = 20;
        int result2 = (t1 / time) * bottle;
        System.out.println(" За " + t1 + " машина произвела " + " (t1/time)*bottle " + result2 + " штук бутылок");
        byte t2 = 24;
        byte t3 = 60;
        byte t5 = 1;
        int result3 = ((t2 * t3) / time) * bottle;
        System.out.println(" За " + t5 + " машина произвела " + " ((t2 * t3) / time) * bottle " + result3 + " штук бутылок");
        byte t6 = 3;
        int result4 = t6 * result3;
        System.out.println(" За " + t6 + " машина произвела " + " t6 * result3 " + result4 + " штук бутылок");
        byte t7 = 31;
        int result5 = t7 * result3;
        System.out.println(" За " + t7 + " машина произвела " + " t7 * result3 " + result5 + " штук бутылок");
        byte totalBottle = 120;
        byte whiteBottle = 2;
        byte brownBottle = 4;
        int result6 = totalBottle/(whiteBottle+brownBottle);
        int result7 = result6 * whiteBottle;
        int result8 = result6 * brownBottle;
        System.out.println(" В школе, где " + "totalBottle/(whiteBottle+brownBottle) " + result6 + " классов, нужно " + " result6 * whiteBottle " + result7 + " банок белой краски и " + " result6 * brownBottle " + result8 + " банок коричневой краски.");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int result9 = (banana*5)+(milk*2)+(iceCream*2)+(egg*4);
        System.out.println(" (banana*5)+(milk*2)+(iceCream*2)+(egg*4) "+ result9);
        short loseWeight1 = 250;
        short loseWeight2 = 500;
        short totalLoseWeight = 7000;
        int result10 = totalLoseWeight/loseWeight1;
        System.out.println(" totalLoseWeight/loseWeight1 " + result10 );
        int result11 = totalLoseWeight/loseWeight2;
        System.out.println(" totalLoseWeight/loseWeight2 " + result11 );
        int result12 = (result10+result11)/2;
        System.out.println(" (result10+result11)/2 " + result12 );
        int mashaSalary = 67760;
        double result13 = (mashaSalary*0.1)+mashaSalary;
        double result14 = result13-mashaSalary;
        System.out.println(" Маша теперь получает " + "(mashaSalary*0.1)+mashaSalary " + result13 + " Годовой доход вырос на " + " result13-mashaSalary " + result14 + " рублей" );
        int denisSalary = 83690;
        double result15 = (denisSalary*0.1)+denisSalary;
        double result16 = result15-denisSalary;
        System.out.println(" Денис теперь получает " + "(denisSalary*0.1)+denisSalary " + result15 + " Годовой доход вырос на " + " result13-denisSalary " + result16 + " рублей" );
        int kristinaSalary = 76230;
        double result17 = (kristinaSalary*0.1)+kristinaSalary;
        double result18 = result17-kristinaSalary;
        System.out.println(" Кристина теперь получает " + "(kristinaSalary*0.1)+kristinaSalary " + result17 + " Годовой доход вырос на " + " result17-kristinaSalary " + result18 + " рублей" );




    }
}
