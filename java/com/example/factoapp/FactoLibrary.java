package com.example.factoapp;
import java.util.Scanner;
public class FactoLibrary {
    public static int[] addX(int arr[], int x) {
        int i;

        // create a new array of size n+1
        int newarr[] = new int[arr.length + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till n
        // then insert x at n+1
        for (i = 0; i < arr.length; i++)
            newarr[i] = arr[i];

        newarr[arr.length] = x;

        return newarr;
    }


    private static Scanner sc;

    public static void main(String[] args) {

        int[] arr = {};
        int[] arr2 = {};
        int Number, i;

        System.out.println("ENTER NUMBER:");
        Number = sc.nextInt();

        for (i = 1; i <= Number; i++) {
            if (Number % i == 0) {
              arr= addX(arr,i);
            }
        }
        for (i = 1; i <= Number; i++) {
            if (Number % i != 0) {
                arr2= addX(arr2,i);
            }
        }


    }
}