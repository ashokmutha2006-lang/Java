public class CheckSorted {
    static boolean arraySorted(int[] arr){
       boolean flag = false;

       if(arr.length == 1 || arr.length == 0){
        return flag = true;
        }
        for(int i = 1; i < arr.length; i++){
       
            if(arr[i] >= arr[i - 1]){
               flag = true;
            }else {
               return false;
            }
        }
        return flag;
    }
    
     public static void main(String[] args) {
       int[] arr = {10,10,11,20,11};
       boolean res = arraySorted(arr);
       
       if(res){
        System.out.println("The given array is sorted!");
       }else{
        System.out.println("The given array is not sorted!!");
       }
    }
}

// program to check the given array is sorted or not.

// Here i am used the logic is that we have to compare the 2nd element to the 1st element.
// Loop the comparision until last element get compared.
// Allow duplicates also.
// write a  boolean method to return the value true or false.
// whenever we want to compare the adjacent elements in an array use _-for-_ loop.
// In body of the for loop, use if condition (arr[i] > arr[i-1]).
// It compares the current value with the previous value.
