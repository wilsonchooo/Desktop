package com.company;

import java.util.Arrays;

public class Main {

    public static void run()
    {
        int[] x = {9,2,3,4,5,6,7,8,91};
        int[] y = {9, 8, 2, 3 ,4 ,5 ,7 ,8};
        int []tempx = new int[x.length];
        int []tempy = new int[y.length];

        mergeSortHelper(x,0,x.length,tempx);
        mergeSortHelper(y,0,y.length,tempy);

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));






    }

    public static void mergeSort(int[] arr)
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0, arr.length-1, temp);
    }

        private static void merge(int[] elements, int from, int mid, int to, int[] temp)
        {
            int i = from;
            int j = mid + 1;
            int k = from;
            while (i <= mid && j <= to)
            {
                if (elements[i] < elements[j])
                {
                    temp[k] = elements[i];
                    i++;
                }
                else
                {
                    temp[k] = elements[j];
                    j++;
                }
                k++;
            }

            while (i <= mid)
            {
                temp[k] = elements[i];
                i++;
                k++;
            }
            while (j <= to)
            {
                temp[k] = elements[j];
                j++;
                k++;
            }
            for (k = from; k <= to; k++)
            {
                elements[k] = temp[k];
            }

        }

    private static void mergeSortHelper(int[] elements, int from, int to, int[] temp) {
        if (from < to) {
            int middle = (from + to) / 2;
            mergeSortHelper(elements, from, middle, temp);
            mergeSortHelper(elements, middle + 1, to, temp);
            merge(elements, from, middle, to, temp);
        }
    }
}


