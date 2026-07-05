package DayThree;

public class BasicMath {

    // proint digits of number
    static void printDigitOfNumber(int num) {
        while (num != 0) {
            int digits = num % 10;
            System.out.println(digits);
            num = num / 10;
        }

    }

    static void countDigitOfNumber(int num) {
        int count = 0;
        while (num != 0) {
            int digits = num % 10;
            count++;
            num = num / 10;
        }
        System.out.println(count);
    }

    static void sumOfDigitsOfNumber(int num) {
        int sum = 0;
        while (num != 0) {
            int digits = num % 10;
            sum = sum + digits;
            num = num / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num = 12346;
        printDigitOfNumber(num);
        countDigitOfNumber(num);
        sumOfDigitsOfNumber(num);
    }
}
