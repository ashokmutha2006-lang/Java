public class PositionOfElem {
    
    static void posiOfElem(int[] arr, int target){
       int st_Pos = -1;
       int end_pos = -1;

        for(int i = 0; i < arr.length; i++){
           if(arr[i] == target){
            st_Pos = i;
            break;
           }
        }
        for(int j = arr.length-1; j >= 0; j--){
            if(arr[j] == target){
               end_pos = j;
                break;
            }
        }
        if(st_Pos == -1){
             System.out.println("The element " + target + " is not found in the array : [ " + st_Pos + " ," + end_pos + " ]" );
        }else{
            System.out.println("The first and last position of " + target + " is : [ " + st_Pos + " , " + end_pos + " ]" );
        }
    }
    public static void main(String[] args) {
        int[] arr = {4};
        int target = 4;
       posiOfElem(arr, target);
    }
}

// program to find the first and last position of an element(20/01/26).

// Time complexity = O(n).
// This is a naive approach.
// For efficient approach use binary search(O(log n)).
