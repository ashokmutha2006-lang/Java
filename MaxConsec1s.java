 // program to find the maximum consecutive ones in a Binary array(20/01/26).
 
 class MaxConsec1s {
    
    static int maxConsectiveOnes(int[] arr){
        int count = 0,max_count = 0;

        for(int i = 0; i < arr.length; i++){
              if(arr[i] == 1){ 
                count++;
                max_count = Math.max(count,max_count);
              
            }else {
                count = 0;
            }
        }
        return max_count ;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1,0,1};
        System.out.println(maxConsectiveOnes(arr));
    }
}
