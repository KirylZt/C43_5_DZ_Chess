import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] desk = new int[8][8];
        System.out.println("Введите координаты ферзя (1): ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.println("Введите координаты другой фигуры (2): ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if (x1 == x2 && y1 == y2) {
            System.out.println("Фигуры не могут стоять на одной клетке");
        } else {
            desk[x1][y1] = 1;
            desk[x2][y2] = 2;
            for (int i = 0; i < desk.length; i++) {
                System.out.println(Arrays.toString(desk[i]));
            }

            for (int i = 0; i < desk.length; i++) {
                for (int j = 0; j < desk[i].length; j++) {
                    if (desk[x1][j] == 2 || desk[i][y1] == 2) {
                        System.out.println("Ферзь собьёт эту фигуру.");
                        break;
                    }

                }
            }

            for (int i = 0; x1 + i < desk.length && y1 + i < desk.length; i++){ //Проверка по главной диагонали вниз
                if (desk[x1 + i][y1 + i] == 2){
                    System.out.println("Ферзь собьёт эту фигуру.");
                }
            }
            for (int i = 0; x1 - i > 0 && y1 - i > 0; i++){ //Проверка по главной диагонали вверх
                if (desk[x1 - i][y1 - i] == 2){
                    System.out.println("Ферзь собьёт эту фигуру.");
                }
            }
            for (int i = 0; x1 + i < desk.length && y1 - i > 0; i++){ //Проверка по побочной диагонали вниз
                if (desk[x1 + i][y1 - i] == 2){
                    System.out.println("Ферзь собьёт эту фигуру.");
                }
            }
            for (int i = 0; x1 - i > 0 && y1 + i < desk.length; i++){ //Проверка по побочной диагонали вверх
                if (desk[x1 - i][y1 + i] == 2){
                    System.out.println("Ферзь собьёт эту фигуру.");
                }
            }


        }

    }
}
