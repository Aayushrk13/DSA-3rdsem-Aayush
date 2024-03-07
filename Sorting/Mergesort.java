package Sorting;

public class Mergesort {
    int temp[];
    void merge(int []arr,int left_index,int right_index,int mid_index){
        int subarray1_size=mid_index-left_index+1;
        int subarray2_size=right_index-mid_index;

        int []left_array=new int[subarray1_size];
        int []right_array=new int [subarray2_size];

        for (int i = 0; i < left_array.length; i++) {
            left_array[i]=arr[i];
        }
        for (int i = 0; i < right_array.length; i++) {
            right_array[i]=arr[mid_index+i];
        }
        int []temp=new int[right_index-left_index+1];
        //Merge arrays
        int j=0; //for left 
        int k=0; //for right
        int l=0; //for temp array
        while (j<subarray1_size && k<subarray2_size) {
            if(left_array[j]<=right_array[k]){
                arr[l++]=left_array[j++];
            }else{
                arr[l++]=right_array[k++];
            }
        }
        while (j<subarray1_size) { //for left array
            arr[l++]=left_array[j++];
        }
        while (k<subarray2_size) { //for right array
            arr[l++]=right_array[k++];
        }
        int []resarray=new int [temp.length];
        for (int i = 0; i < temp.length; i++) { //transfering to new array
            resarray[i]=temp[i];
        }
    }
    void sort(int []arr,int left_index,int right_index){
        if(left_index<right_index){
            int mid_index=(left_index+right_index)/2;
            sort(arr, left_index, mid_index);
            sort(arr, mid_index+1, right_index);
            merge(arr, left_index, right_index, mid_index);
        }
    }
    void mergesort(int []arr){
        int left_index=0;
        int right_index=arr.length-1;
        sort(arr, left_index, right_index);
    }
    void printarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Mergesort ob=new Mergesort();
        int []arr={1,2,5,4,3};
        ob.mergesort(arr);
        ob.printarray(arr);
    }
}
