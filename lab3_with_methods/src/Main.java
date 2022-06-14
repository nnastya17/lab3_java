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
        InputOutputMatrix(matrixA, m, n);
        CheckError(matrixA,m);
    }
    public static void InputOutputMatrix(int[][] mat, int a, int b){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j < b; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Введенная матрица:");
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j < b; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void CheckError(int[][] mat,int a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой столбец вы хотите вывести?");
        int num = scanner.nextInt();
        try {
            System.out.println(num + "-й столбец: ");
            for (int i = 0; i < a; i++) {
                System.out.println(mat[i][num - 1]);
            }
        }
        catch (Exception  e){
            System.out.println("Нет столбца с таким номером!");
        }
    }
}