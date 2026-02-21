
public class MaxSubArray{

    static int maxSubArrSum(int[] arr){
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = 0;
            for(int j =  i; j < arr.length; j++){
               
                sum += arr[j];
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
        }
      return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-6,-1,-8};
       
        System.out.println(kadaneAlgorithm(arr));

    }

    static int kadaneAlgorithm(int[] arr){
        int maxSum = arr[0];
        int sum = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(sum >= 0){
                sum += arr[i];
            }else{
                sum = arr[i];
            }
            if(sum > maxSum){
                maxSum = sum;
            }
        }
        return maxSum;
    }
}



// program to find maximum sum of sub Array(21/01/26).

// The efficient algorithm is "Kadane's algorithm".
// in this algorithm the time complexity is O(n).
// In a single iteration the max sum is obtained.
