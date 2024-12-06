package Array;

import java.util.Scanner;

public class Array_concatination {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of element insert: ");
        int n  = in.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();


        }
        int[]ans = concate(arr,n);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");

        }

    }
    static int[] concate(int[]arr,int n){
        int []result = new int[2*n];
        for (int i = 0; i < n; i++) {
            result[i] = arr[i];
            result[i+n] = arr[i];

        }
        return  result;

    }
}
//can we run a for loop like
