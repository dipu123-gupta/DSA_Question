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

    static int reverseNumber(int num) {
        int revese = 0;
        while (num != 0) {
            int digits = num % 10;
            revese = revese * 10 + digits;
            num = num / 10;
        }
        return revese;
    }

    static boolean isPalindrom(int num) {
        int original = num;
        int reverse = reverseNumber(num);
        if (original == reverse) {
            System.out.println("It is a palindrom");
            return true;
        } else {
            System.out.println("it is not palindrom");
            return false;
        }

    }

    static boolean isPrimeNumber(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int getGCD(int a, int b) {
        // gcd(a,b)=gcd(b,a%b)
        while (b != 0) {
            int oldValueOfb = b;
            b = a % b;
            a = oldValueOfb;
        }
        int ans = a;
        return ans;
    }

    static int getLCM(int a, int b) {
        int gcd = getGCD(a, b);
        // gcd(18,12)
        int prod = a * b;
        // prod(a,b)->216
        int lcm = prod / gcd;
        //216/6
        return lcm;
    }

    static boolean armstongNumber(int num) {
        int originalNum = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            int cubeOdDigit = digit * digit * digit;
            sum = sum + cubeOdDigit;
            num = num / 10;
        }
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }

    }

    static boolean perfectNumber(int num) {
        int sum = 1;
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                // i ne num ko perfectly divide krdia h toh ab factor pair kya banega 
                // ist factor ->1
                // 2nd factor -> num/i
                int firstFact = i;
                int secondFact = num / i;
                sum = sum + firstFact + secondFact;
            }
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    static boolean printAllPrimeNum(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // int num = 153;
        // printDigitOfNumber(num);
        // countDigitOfNumber(num);
        // sumOfDigitsOfNumber(num);
        // reverseNumber(num);
        // isPalindrom(num);
        // // int num1 = 12;
        // System.out.println(isPrimeNumber(num));

        // // int a = 12, b = 18;
        // // System.out.println(getGCD(a, b));
        // System.out.println(getLCM(12, 18));
        // System.out.println(armstongNumber(num));
        // System.out.println(perfectNumber(18));
        int n = 100;
        for (int i = 1; i <= n; i++) {
            if (printAllPrimeNum(n)) {
                System.out.println(i + " ");
            }
        }

    }
}
