public class FrequencyArray {
    
    static void freq_Element(int[] arr){
        int freq = 1;
        int i = 1;
        int n = arr.length;
      
      while(i < n){
        while(i < n && arr[i] == arr[i - 1]){
            freq++;
            i++;
        }
        System.out.println(arr[i-1] + "  Frequency is :  " + freq);
        freq = 1;
        i++;
    }
        if(i == n-1 || i == n){
               System.out.println(arr[i-1] + "  Frequency is :  " + freq);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,20,30,30,30,10};
       freq_Element(arr);
    }
}

// Program to find the frequencies of every element(17/01/26).
// Time complexity --> O(n).
