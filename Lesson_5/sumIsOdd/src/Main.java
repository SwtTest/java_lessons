public class Main {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            if (isOdd(start)) {
            } else {
                start++;
            }
            if (isOdd(end)) {
            } else {
                end--;
            }
            for (int i = start; i <= end; i += 2) {
                sum = sum + i;
            }
            return sum;
        } else {
            return -1;
        }
    }
}
