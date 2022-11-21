import java.util.Random;
import java.util.Scanner;

public class mnozhestvo {

    static Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int[][] my_mnozhestvo;
    int sizeWidth;
    int sizeHeight;

    mnozhestvo(int sizeWidth, int sizeHeight) {
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;
        this.my_mnozhestvo = new int[sizeWidth][sizeHeight];
    }

    void minimum() {
        int minElement = 2147483647;
        for (int[] ints : my_mnozhestvo) {
            for (int anInt : ints) {
                if (anInt < minElement) {
                    minElement = anInt;
                }
            }
        }
        System.out.println("Минимальный элемент: " + minElement);
    }

    void maximum() {
        int maxElement = 0;
        for (int[] ints : my_mnozhestvo) {
            for (int anInt : ints) {
                if (anInt > maxElement) {
                    maxElement = anInt;
                }
            }
        }
        System.out.println("Максимальный элемент: " + maxElement);
    }

    void matrix() {
        System.out.println("Вот ваша матрица:");
        for (int[] ints : my_mnozhestvo) {
            for (int j = 0; (ints != null && j < ints.length); j++) {
                System.out.print(ints[j] + " ");
            }

            System.out.println();
        }
    }

    void sredneezn() {
        int arraySum = 0;
        for (int[] ints : my_mnozhestvo) {
            for (int anInt : ints) {
                arraySum += anInt;
            }
        }
        double arrayAverage = (double) arraySum / ((double) sizeWidth * (double) sizeHeight);
        System.out.println("Среднее значение: " + arrayAverage);
    }

    void geom_sr_zn() {
        int arrayMultiply = 1;
        for (int[] ints : my_mnozhestvo) {
            for (int anInt : ints) {
                arrayMultiply *= anInt;
            }
        }

        double degree = 1 / ((double) sizeWidth * (double) sizeHeight);
        double arrayAverageGeometric = Math.pow(arrayMultiply, degree);
        System.out.println("Среднее геометрическое значение: " + arrayAverageGeometric);
    }


    void setArray() {
        for (int i = 0; i < my_mnozhestvo.length; i++) {
            for (int j = 0; j < my_mnozhestvo[i].length; j++) {
                System.out.println("Enter the " + i + "/" + j + " element");
                int currentItem = Integer.parseInt(scanner.nextLine());
                my_mnozhestvo[i][j] = currentItem;
            }
        }

    }

    void random() {
        int min = -100;
        int max = 100;
        for (int i = 0; i < my_mnozhestvo.length; i++) {
            for (int j = 0; j < my_mnozhestvo[i].length; j++) {
                int diff = max - min;
                my_mnozhestvo[i][j] = random.nextInt(diff + 1);
                my_mnozhestvo[i][j] += min;
            }
        }
    }

}
