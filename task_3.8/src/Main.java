public class Main {

    public static void main(String[] args) {
        System.out.println(m());
    }
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }
}