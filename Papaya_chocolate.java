import java.lang.Math;


    public class Papaya_chocolate {
        public static void main(String[] args) {

        double a = 4.125;
        double b = -1.234;
        double c = 0.487;

            System.out.println("Почнемо рішення прикладу Х.");
            // Можно я не буду коментувати тут рішення
            double absB = Math.abs(b);
            double sqrtAbsB = Math.sqrt(absB);
            double rootA = Math.pow(a + sqrtAbsB, 1.0/a );
            double x = 3 - rootA;

            System.out.println("x =" + x);

            System.out.println("Почнемо рішення прикладу Y.");
            // Будь ласка
            double sinC = Math.sin(c);
            double stipinE = a - (1 / sinC);
            double expE = Math.exp(stipinE);
            double y = Math.pow(expE, 1.0 /4);

            System.out.println("y =" + y);



    }
}