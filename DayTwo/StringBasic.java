package DayTwo;

public class StringBasic {
    // print each character of the String

    static void printString(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

    static int getLengthOfString(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

    static int getVolwelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    static String reverseString(String str) {
        String reverse = "";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

    static boolean isPalimdrome(String str) {
        String original = str;
        String reverse = reverseString(original);

        // compare
        for (int i = 0; i < original.length(); i++) {
            char ch1 = original.charAt(i);
            char ch2 = reverse.charAt(i);
            if (ch1 != ch2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "dcd";
        printString(str);
        System.out.println(getLengthOfString(str));
        System.out.println(getVolwelsCount(str));
        System.out.println(reverseString(str));

        System.out.println(isPalimdrome(str));

        // String name = "dipu";
        // String lastName = new String("kumar");
        // System.out.println(name + " " + lastName);
        // // System.out.println(name[0]);
        // System.out.println(name.length());
        // System.out.println(name.charAt(2));
        // // comparision string
        // String name1 = "love";
        // String name2 = "Love";
        // if (name1 == name2) {
        //     System.out.println("both string are equel");
        // } else {
        //     System.out.println("both string are deffrence");
        // }
        // if (name1.equals(name2)) {
        //     System.out.println("both string are equel");
        // } else {
        //     System.out.println("both string are deffrence");
        // }
        // if (name1.equalsIgnoreCase(name2)) {
        //     System.out.println("both string are equel");
        // } else {
        //     System.out.println("both string are deffrence");
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("provide the string content: ");
        // String str = sc.nextLine();
        // System.out.println("value: " + str);
        // String str="dipu";
        // System.out.println(str.length());
        // System.out.println(str.charAt(0));
        // String str2="DIPU";
        // System.out.println(str.equals(str2));
        // System.out.println(str.equalsIgnoreCase(str2));
        // String str3=" ";
        // System.out.println(str3.length());
        // System.out.println(str3.isEmpty());
        // System.out.println(str3.isBlank());
    }

}
