public class Binarysearch {
    public void binarysearch(int []arr,int key){
        int left_index=0;
        int right_index=arr.length-1;
        while (left_index<=right_index) {
            int mid_index =left_index+(right_index-left_index)/2;
            if(arr[mid_index]==key){
                System.out.println("The key is found.");
                return;
            }else if(arr[mid_index]>key){
                right_index=mid_index-1;
            }else{
                left_index=mid_index+1;
            }    
        }
    }
    public static void main(String[] args) {
        int size=5;
        int arr[]={1,2,3,4};
        Binarysearch b=new Binarysearch();
        b.binarysearch(arr, size);
    }
}
