public class Third {

    public static void Harshad(int number) {
        int original = number;
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        if (original % sum == 0) {
            System.out.println(original + " is a Harshad number.");
        } else {
            System.out.println(original + " is not a Harshad number.");
        }
    }

    public static void main(String[] args) {
        Harshad(18);
    }
}
