import java.util.Scanner;

public class Papaya_chocolate1 {

    public static void main(String[] args) {
        // нужен Scanner чтобы просить циферки : )
        Scanner scanner = new Scanner(System.in);

        // Ввод значений a, b и x
        System.out.print("ведіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("ведіть значення b: ");
        double b = scanner.nextDouble();

        System.out.print("Введіть значення x від 0 до 15: ");
        double x = scanner.nextDouble();


        double result = 0;

        if (x >= 0 && x < 11) {
            // f(x) = sqrt(x + b) для x ∈ [0, 11)
            result = Math.sqrt(x + b);
            System.out.println("Для діапазону [0, 11) використовуємо формулу sqrt(x + b)");
        } else if (x >= 11 && x < 15) {
            // f(x) = ax^2 - 3x + 14 для x ∈ [11, 15)
            result = a * Math.pow(x, 2) - 3 * x + 14;
            System.out.println("Для діапазону [11, 15) використовуємо формулу ax^2 - 3x + 14");
        } else if (x == 15) {
            // f(x) = e^(-ax) для x = 15
            result = Math.exp(-a * x);
            System.out.println("Для x = 15 використовуємо формулу e^(-ax)");
        } else {
            System.out.println("x поза певним діапазоном.");
        }

        System.out.println("Значення f(x): " + result);
    }
}
