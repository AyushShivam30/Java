package Sorting.com;

import java.util.Arrays;

//•  Sort an array of floating-point numbers.
public class SwapFloat {
    public static void main(String[]args){
        float[]arr = {5.51f,4.335f, 3.35f, 4.30f,1.5f, 2.5f};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(float[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j<arr.length ; j++){
                if (arr[j] < arr[min]){
                    min = j;

                }


            }
            swap(arr,min,i);


        }
    }
    static void swap(float[]arr,int first, int second){
        float temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
