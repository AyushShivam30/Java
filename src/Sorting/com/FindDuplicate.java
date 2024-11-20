package Sorting.com;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 3};
        find(arr);

    }
    public static void find(int[]arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

                }

            }
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i<arr.length-1){
            if (arr[i] == arr[i+1] ){
                list.add(arr[i]);

            }
            i++;




        }
        System.out.print(list);


        }
    }
