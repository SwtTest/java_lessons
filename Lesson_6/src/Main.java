public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(2147483647));
        System.out.println(sumDigits(-15));
        System.out.println(sumDigits(4));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        if (number >= 10) {
            for (int sep = 1; sep <= 1000000000; sep *= 10) {
                sum += number / sep % 10;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
