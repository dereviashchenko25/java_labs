import java.util.Scanner;

public class lb2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        start();

    }

    public static void start(){

        try {
            System.out.println("ВВедите ширину матрицы = ");
            int sizeWidth = Integer.parseInt(scanner.nextLine());

            System.out.println("Введите высоту матрицы = ");
            int sizeHeight = Integer.parseInt(scanner.nextLine());

            if (sizeHeight<1 | sizeHeight>50){
                System.out.println("Неправильно значени! Введите в диапазоне от 1 до 50");
                start();
            } else if (sizeWidth<1 | sizeWidth>50) {
                System.out.println("Неправильное значение! Введите в диапазоне от 1 до 50");
                start();
            }

            mnozhestvo myArray = new mnozhestvo(sizeWidth,sizeHeight);
            myArray.setArray();
            mainFunctions(myArray);

        }catch (Exception ex){
            System.out.println("Введите число!");
            start();
        }

    }
    public static void mainFunctions(mnozhestvo myArray){

        System.out.println("Выберите что вы хотите узнать: " +
                "\n1)Показать матрицу: " +
                "\n2)Найти min: " +
                "\n3)Найти max: " +
                "\n4)Найти среднее значение:  " +
                "\n5)Найти среднее геометрическое значение: " +
                "\n6)Выйти. " +
                "\n7)Сбросить матрицу со случайными числами.");


        try {
            int currentOption = Integer.parseInt(scanner.nextLine());
            switch (currentOption){
                case 1:
                    myArray.matrix();
                    mainFunctions(myArray);
                    break;
                case 2:
                    myArray.minimum();
                    mainFunctions(myArray);
                    break;
                case 3:
                    myArray.maximum();
                    mainFunctions(myArray);
                    break;
                case 4:
                    myArray.sredneezn();
                    mainFunctions(myArray);
                    break;
                case 5:
                    myArray.geom_sr_zn();
                    mainFunctions(myArray);
                    break;
                case 6:
                    System.out.println("Пока, пока!");
                    System. exit(0);
                    break;
                case 7:
                    myArray.random();
                    mainFunctions(myArray);
                default:
                    System.out.println("Выберите со списка опцию!");
                    mainFunctions(myArray);
            }
        }catch (Exception ex){
            System.out.println("Введите число, пожалуйста!");
            start();
        }

    }
}