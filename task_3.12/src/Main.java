public class Main {

    public static void main(String[] args) {
        m(null, 0.000001);
    }
    public static void m(String str, double num) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (num > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
    }
}