public class First {

    public static void printOddNumbers(int n) {
        for (int i = 1; i <= n; i += 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        printOddNumbers(n);
    }
}
d