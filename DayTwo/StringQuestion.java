package DayTwo;

public class StringQuestion {

    // Print Each Character
    static void printCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    // Count Length Without length()
    static int getLengthString(String str) {

        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;
        }
        return length;
    }

    //  Count Vowels
    static int getVowels(String str) {
        int count = 0;
        for (int idx = 0; idx < str.length(); idx++) {
            char ch = str.charAt(idx);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    // Reverse a String
    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    // check palindrome
    static boolean checkPalindrom(String str) {
        String original = str;
        String reverse = reverseString(original);
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    // Count consonants in a string
    static int getConsonanat(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U' && ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                count++;
            }
        }
        return count;
    }

    // Convert string to uppercase without using method
    static String convertUppercase(String str) {
        char arr[] = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char) (arr[i] - 32);
            }
        }
        return new String(arr);
    }

    // Find frequency of a character
    static int frequency(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    // Remove All Spaces from String (Without replace())
    static String removeSpace(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result = result + str.charAt(i);
            }
        }
        return result;
    }

    // Check if String Contains Only Digits
    static boolean OnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ch = "Dipu kumar gupta";
        printCharacter(ch);
        System.out.println(getLengthString(ch));

        System.out.println(getVowels(ch));
        System.out.println(reverseString(ch));
        System.out.println(checkPalindrom(ch));
        System.out.println(getConsonanat(ch));
        String str = "dipu kumar";
        System.out.println(convertUppercase(str));
        String str1 = "programming";

        System.out.println(frequency(str1, 'a'));

        System.out.println(removeSpace(ch));

        String digi = "234456";
        System.out.println(OnlyDigits(digi));
    }

}
