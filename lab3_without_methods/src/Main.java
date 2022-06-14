import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        System.out.print("Кол-во строк: ");
        int m = scanner.nextInt();
        System.out.print("Кол-во столбцов: ");
        int n = scanner.nextInt();
        int[][] matrixA;
        matrixA = new int[m][n];

        //input
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        //output
        System.out.println("Введенная матрица:");
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(matrixA[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("Какой столбец вы хотите вывести?");
        int num = scanner.nextInt();

        try
        {
            System.out.println(num+"-й столбец: ");
            for (int i = 0; i <m ; i++) {
                System.out.println(matrixA[i][num-1]);
            }
        }
        catch(Exception e)
        {
            System.out.println("Нет столбца с таким номером!");
        }
    }
}
