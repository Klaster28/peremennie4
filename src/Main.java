public class Main {
    public static void main(String[] args) {
        int xBox = 123456789;
        System.out.println("Значение переменной 'xBox' с типом данных 'int' равно " + xBox);
        byte yBox = 100;
        System.out.println("Значение переменной 'yBox' с типом данных 'byte' равно " + yBox);
        short zBox = 12345;
        System.out.println("Значение переменной 'zBox' с типом данных 'short' равно " + zBox);
        long aBox = 111222333444L;
        System.out.println("Значение переменной 'aBox' с типом данных 'long' равно " + aBox);
        double bBox = -1.1+200;
        System.out.println("Значение переменной 'bBox' с типом данных 'duble' равно " + bBox);
        float cBox = 2.3f;
        System.out.println("Значение переменной 'cBox' с типом данных 'float' равно " + cBox);

        float x = 27.12f;
        System.out.println("x с типом данных 'float' равен " + x);
        long y = 987678965549L;
        System.out.println("y с типом данных 'long' равен " + y);
        byte z = 2;
        System.out.println("z с типом данных 'byte' равен " + z);
        short q = 786;
        System.out.println("q с типом данных 'short' равен " + q);
        boolean w = false;
        System.out.println("w с типом данных 'boolean' равен " + w);
        short e = 569;
        System.out.println("e с типом данных 'short' равен " + e);
        short r = -159;
        System.out.println("r с типом данных 'short' равен " + r);
        short t = 27897;
        System.out.println("t с типом данных 'short' равен " + t);
        byte s = 67;
        System.out.println("s с типом данных 'byte' равен " + s);

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short sumList = 480;
        System.out.println("На каждого ученика рассчитано " + 480 / (lP+aS+eA) + " листов бумаги.");

        byte butMin = 16/2;
        int butDwMin = butMin * 20;
        System.out.println("За 20 минут машина произвела  " + butDwMin + " бутылок.");
        int butSut = butMin*60*24;
        System.out.println("За сутки машина произвела  " + butSut + " бутылок.");
        int butTri = butSut*3;
        System.out.println("За трое суток машина произвела  " + butTri + " бутылок.");
        long butMes = butSut*31;
        System.out.println("За месяц машина произвела  " + butMes + " бутылок.");

        byte sumKr = 120;
        byte belKr = 2;
        byte korKr = 4;
        int sumKl = sumKr / (belKr+korKr);
        int sumBel = sumKl*2;
        int sumKor = sumKl*4;
        System.out.println("В школе где " + sumKl+ " классов, необходимо " + sumBel +" банок белой краски и " + sumKor +
                " банок коричневой краски.");

        byte banWt = 80;
        int banSum = banWt*5;
        byte molWt = 105;
        int molSum = molWt*2;
        byte morWt = 100;
        int morSum = morWt*2;
        byte icWt = 70;
        int icSum = icWt*4;
        int zavSum = banSum+molSum+morSum+icSum;
        System.out.println("Общий вес завтрака в граммах составляет - " + zavSum + " гр.");
        float zavSumKg = zavSum/1000;
        System.out.println("Общий вес завтрака в килограммах составляет - " + zavSumKg + " кг.");
        byte rezWt = 7;
        int rezWtGr = rezWt*1000;
        int rezDn = rezWtGr/250;
        System.out.println("При сбросе в день по 250 гр., результат через - " + rezDn+ " дней.");
        int rezDnMor = rezWtGr/500;
        System.out.println("При сбросе в день по 500 гр., результат через - " + rezDnMor+ " дней.");

        int mSt = 67760;
        int mGdSt = mSt*12;
        double mPv = (mSt * 0.1) + mSt;
        double mPvGd = (mGdSt *0.1) + mGdSt;
        double rzn = mPvGd - mGdSt;
        System.out.println("Маша теперь получает " + mPv + " рублей. Годовой доход вырос на " + rzn + " рублей.");

        int dSt = 83690;
        int dGdSt = dSt*12;
        double dPv = (dSt * 0.1) + dSt;
        double dPvGd = (dGdSt *0.1) + dGdSt;
        double drzn = dPvGd - dGdSt;
        System.out.println("Денис теперь получает " + dPv + " рублей. Годовой доход вырос на " + drzn + " рублей.");

        int kSt = 76230;
        int kGdSt = kSt*12;
        double kPv = (kSt * 0.1) + kSt;
        double kPvGd = (kGdSt *0.1) + kGdSt;
        double krzn = kPvGd - kGdSt;
        System.out.println("Кристина теперь получает " + kPv + " рублей. Годовой доход вырос на " + krzn + " рублей.");









    }
}