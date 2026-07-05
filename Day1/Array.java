package Day1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int arr2[]={10,20,30,40};

        int n= arr2.length-1;
        int sum=0;
       for (int i = 0; i <=n; i++) {
        //    System.out.println(arr2[i]);
        sum=sum+arr2[i];
       }
       System.out.println(sum);

        
    //    multiplication of all element of array
    int arr3[]={2,4,5,7,8};

    int length=arr3.length-1;

    int multiplication=1;
    for (int i = 0; i <=length; i++) {
        multiplication=multiplication*arr3[i];
    }
    System.out.println(multiplication);


    // find the maximum value in array
    int arr4[]={9,5,3,10,1};

    int max=arr4[0];

    for(int i =0;i<=arr4.length-1;i++){
        if(max<arr4[i]){
            max=arr4[i];
        }
    }
    System.out.println(max);


    // find the minimum value in array

    int arr5[]={4,7,9,3,0,-1};
    int num=arr5.length-1;
    int min =arr5[5];

    for (int i = 0; i <=num; i++) {
        if (min>arr5[i]) {
            min=arr5[i];
        }
    }

    System.out.println(min);

        
        // // Declaration
        // int arr[];

        // // Allocation
        // arr=new int[5];

        // // initialize

        // int brr[]={10,20,30};

        // System.out.println("value of at 0 index "+brr[0]);
        // System.out.println("value of at 0 index "+brr[1]);

        // System.out.println("value of at 0 index "+brr[2]);

        // int n = brr.length;

        // for(int index=0;index<=n-1;index++){
        //     System.out.println(brr[index]);
        // }

        // int arr1[]={8,9,3,4,2};

        // for(int value : arr1){
        //     System.out.println(value);
        // }


        int arr[]=new int[4];

        Scanner sc = new Scanner(System.in);

        for(int i=0;i<=arr.length-1;i++){
            System.out.println("Provide input for index "+i);
            arr[i]=sc.nextInt();
        }

        System.out.println("your array contain : ");
        for(int val:arr){
            System.out.println(val);
        }

    }
    
}
