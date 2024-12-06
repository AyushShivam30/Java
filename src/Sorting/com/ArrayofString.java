package Sorting.com;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayofString {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the size of the strring: ");

        int n = in.nextInt();
        String[]str = new String[n];

       // System.out.println(str);
        for (int i = 0; i < n; i++) {
            str[i] = in.next();

        }
        sort(str);
           System.out.print(Arrays.toString(str));




    }
    static void sort(String[]str){
        for (int i = 0; i < str.length-1; i++) {
            for (int j = 1; j < str.length-i ; j++) {
                if (str[j].compareTo(str[j - 1]) < 0) {
                    swap(str, j,j-1);


                }

            }

        }
    }
    static void swap(String []str, int  first,int second){
        String temp = str[first];
        str[first] = str[second];
        str[second] = temp;


    }
}
