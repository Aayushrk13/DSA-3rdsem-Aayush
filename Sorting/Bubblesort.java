package Sorting;

import java.util.Scanner;

public class Bubblesort {
    void bubblesort(int arr[]){
        int temp;
        for(int i=0;i<arr.length;i++){
            for (int j = i; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;   
                }
            }
        }
        System.out.println("Array in ascending sorted form is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Bubblesort b=new Bubblesort();
        System.out.println("Enter the size of the array:");
        int size=scan.nextInt();
        int []arr=new int [size];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("The array before sorting is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        b.bubblesort(arr);
    }
}
