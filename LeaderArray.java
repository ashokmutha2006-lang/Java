public class LeaderArray {
    static void ledArr(int[] arr){
       
        for(int i = 0; i < arr.length; i++){
            boolean is_leader = true;
            for(int j = i+1; j < arr.length;j++){
               if(arr[j] >= arr[i]){
                 is_leader = false;
                 break;
               }
            }
            if(is_leader){
                System.out.print( "The Leaders of the arrays are : " + arr[i] + " ");
            }
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {11,10,8,5,11,7,6,3};
       leaderArr1(arr);

    }


    static void leaderArr1(int[] arr){  // 1 in method name means it is efficient method.
        int curr_element = arr[arr.length-1];
        System.out.println(curr_element);

        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] > curr_element){
                curr_element = arr[i];
                System.out.println(curr_element);
                System.out.println(i);
            }
        }
    }
}

// - Program to find the leaders of the array(16/01/26).

// LEADER - An element is said to be a leader if it is the largest element compared to the right side of all elements.
//        - The rightmost element or last element is always a LEADER.
//        - In Ascending order there is only one leader, that is last element.
//        - In Descending order all the elements are LEADERS.


