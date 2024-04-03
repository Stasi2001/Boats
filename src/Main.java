
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество людей и грузоподъемность байдарки: ");
        int n = scanner.nextInt();
        int[] people = new int[n];
        double d = scanner.nextInt();
        System.out.println("Введите вес каждого человека: ");

        System.out.println("Минимальное количество байдарок: " +count );

        int count = 0;

        for(int i = 0; i <= n; ++i) {
            if (people[i] <= d) {
                people[i] = 0;
            } else {
                for (int j = i + 1; j < n; j++) {
                    if (people[i] + people[j] <= d) {
                        people[j] = 0;
                        break;
                    }
                }
            }

        }

    }
}
