public class Casting {
    public static void main(String[] args) {
        // En un año ubicar 30 perrotos
        //cuantos perrito ubique al mes

        double monthlydogs = 30.0/12.0;
        System.out.println(monthlydogs);

        //EStimación
        int estimateMonthDogs = (int) monthlydogs;
        System.out.println(estimateMonthDogs);

        //Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);

        double c = a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);

    }
}
