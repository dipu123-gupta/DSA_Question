package Day1;

public class TwoDArray {

    public static void main(String[] args) {
        // // declaration 
        // int[][] arr;
        // // allocation
        // arr = new int[3][4];
        // // initialization
        // int[][] brr = {
        //     {1, 2},
        //     {2, 3},
        //     {3, 4},
        //     {4, 5, 9, 7}
        // };
        // // System.out.println(brr[0][0]);

        // for (int row = 0; row <= brr.length - 1; row++) {
        //     for (int col = 0; col <= brr[row].length - 1; col++) {
        //         System.out.print(brr[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // int arr[][] = new int[3][4];
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i <= arr.length - 1; i++) {
        //     for (int j = 0; j <= arr[i].length - 1; j++) {
        //         System.out.println("provide value for row= " + i + " and column= " + j);
        //         arr[i][j] = sc.nextInt();
        //     }
        // }
        // for (int i = 0; i <= arr.length - 1; i++) {
        //     for (int j = 0; j <= arr[i].length - 1; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // sum of 2D Array element
        int arr[][] = {{1, 2, 8, 4}, {4, 5, 6, 7}};
        int sum = 0;

        // for (int i = 0; i <= arr.length - 1; i++) {
        //     for (int j = 0; j <= arr[i].length - 1; j++) {
        //         int value = arr[i][j];
        //         sum = sum + value;
        //     }
        // }
        // System.out.println(sum);
        // mult of 2D array
        // int ans = 1;
        // for (int i = 0; i <= arr.length - 1; i++) {
        //     for (int j = 0; j <= arr[i].length - 1; j++) {
        //         int value = arr[i][j];
        //         ans = ans * value;
        //     }
        // }
        // System.out.println(ans);
        // max element in 2D array 
        int max = arr[0][0];
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
