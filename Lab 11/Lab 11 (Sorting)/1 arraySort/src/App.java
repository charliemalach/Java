/*
Title: arraySortTest
@author cmalach1
Date: 3/24/22
*/

import java.util.*;
import java.util.ArrayList;
public class App 
{
     //bubble sort method 
     static void bubbleSort(int a[], int n)
     {
         for (int i = 1; i < n; i++)
             for (int j = 0; j < n - 1; j++)
             {
                 if (a[j] > a[j+1])
                     swap(a, j, j+1);
                 }
     }
 
     //selection sort method 
     static void selectionSort(int a[], int numUsed)
     {
         int smallest; 
 
         for (int i = 0; i < numUsed - 1; i++)
         {
             smallest = getSmallest(a, i);
             swap(a, i, smallest);
         }
     }
 
     //quick sort method 
     static void quickSort(int arr[], int left, int right)
     {
         int index = partition(arr, left, right); 
         if (left < index - 1)
             quickSort(arr, left, index - 1);
         if (index < right)
             quickSort(arr, index, right); 
     }

     //get smallest integer method
     static int getSmallest(int a[], int b)
     {
         int smallest = b;
         for(int i = b; i < a.length; i++)
         {
             if(a[i] < a[smallest])
             {
                 smallest = i;
             }
         }
         return smallest;
     }

     static void swap(int a[], int c, int d)
     {
         int temp = a[c];
         a[c] = a[d];
         a[d] = temp;
     }

     static int partition(int arr[], int left, int right)
     {
         int i = left;
         int j = right;
         int temp;
         int pivot = arr[(left + right) / 2];

         while(i <= j)
         {
             while(arr[i] < pivot)
             i++;
             while(arr[j] > pivot)
             j--;
             if (i <= j)
             {
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
                 i++;
                 j--;
             }
         };
         return i;
     }

    public static void main(String[] args) throws Exception 
    {
        int array1[] = {8, 6, 3, 4, 2};
        int array2[] = {9, 4, 1, 6, 8};
        int array3[] = {1, 5, 9, 6, 2};

        // //Bubble Sort Output
        // System.out.println("BubbleSort output: ");
        // System.out.println("Array 1: ");
        // System.out.println(Arrays.toString(array1));
        // bubbleSort(array1, 5);
        // System.out.println(Arrays.toString(array1));
        // System.out.println("");  //next array
        // System.out.println("Array 2: ");
        // System.out.println(Arrays.toString(array2));
        // bubbleSort(array2, 5);
        // System.out.println(Arrays.toString(array2));
        // System.out.println("");  //next array
        // System.out.println("Array 3: ");
        // System.out.println(Arrays.toString(array3));
        // bubbleSort(array3, 5);
        // System.out.println(Arrays.toString(array3));

        // //Selection Sort Output
        // System.out.println("SelectionSort output: ");
        // System.out.println("Array 1: ");
        // System.out.println(Arrays.toString(array1));
        // selectionSort(array1, 5);
        // System.out.println(Arrays.toString(array1));
        // System.out.println("");  //next array
        // System.out.println("Array 2: ");
        // System.out.println(Arrays.toString(array2));
        // selectionSort(array2, 5);
        // System.out.println(Arrays.toString(array2));
        // System.out.println("");  //next array
        // System.out.println("Array 3: ");
        // System.out.println(Arrays.toString(array3));
        // selectionSort(array3, 5);
        // System.out.println(Arrays.toString(array3));

        //Quick Sort Output 
        System.out.println("QuickSort output: ");
        System.out.println("Array 1: ");
        System.out.println(Arrays.toString(array1));
        quickSort(array1, 0, 4);
        System.out.println(Arrays.toString(array1));
        System.out.println(""); //next array
        System.out.println("Array 2: ");
        System.out.println(Arrays.toString(array2));
        quickSort(array2, 0, 4);
        System.out.println(Arrays.toString(array2));
        System.out.println(""); //next array
        System.out.println("Array 3: ");
        System.out.println(Arrays.toString(array3));
        quickSort(array3, 1, 4);
        System.out.println(Arrays.toString(array3));
    }
}