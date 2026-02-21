public class ReverseArray {
    
    static void reverse(int[] arr,int n){
        int[] rev = new int[n];
        int j = 0;
        int a ;
        for(int i = n-1 ; i >= 0; i--){
           rev[j] = arr[i];
           j++;
        }
        for(a = 0; a < n; a++){
            System.out.print(rev[a] + " ");
        }     
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {21,32,56,85,42};
        int n = arr.length;
        reverse(arr, n);
       swap(arr);
       System.out.println(java.util.Arrays.toString(arr));
      
      
    }
    static void swap(int[] arr){
        int start = 0, end = arr.length- 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
       
    }
}
    // program to reverse an array.

    // there are 2 ways.
    // 1. By using swapping technique.
    // 2. By uisng for loop and use another array.
    