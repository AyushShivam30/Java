package Sorting.com;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharracter {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter  the no. of character you want to insert: ");
        int n = in.nextInt();
        char[]arr = new char[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next().charAt(0); // charAt(i): Will throw an IndexOutOfBoundsException if i is greater than 0

        }
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(char[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j <arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);

                }

            }

        }
    }
    static void swap(char[]arr, int  first,int second){
        char temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;


    }
}
