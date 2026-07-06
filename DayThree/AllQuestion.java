package DayThree;

public class AllQuestion {

    // count digits in a number
    static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            num /= 10;
        }
        return count;
    }

    // sum of digits
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num /= 10;
        }
        return sum;
    }

    // reverse a number
    static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    static void evenAndOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("add number");
        }
    }

    static void palindromeNumber(int num) {
        int original = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        if (original == reverse) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not palindrome number");
        }
    }

    static boolean primeNumber(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    static void ArmstrongNumber(int num) {
        int original = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num /= 10;
        }
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }

    public static void main(String[] args) {
        int num = 8738788;
        System.out.println(countDigits(num));
        System.out.println(sumOfDigits(num));
        System.out.println(reverseNumber(num));
        evenAndOdd(num);
        int num2 = 153;
        System.out.println(primeNumber(num2));
        ArmstrongNumber(num2);

    }
}
