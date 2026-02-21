 import java.util.Scanner;
 
 class SecondLargest{
    static int secondLargest1(int[] arr){
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                max1 = arr[i];// obtained largest element and stored in max1.
            }
             if(arr[i] != max1){ // Ignored largest element.
                    if(arr[i] > max2){ //obtaining second largest element.
                        max2 = arr[i];  // assigning to max2 , max2 consistes second largest element.5
                    }
                }
            }
        return max2;
    }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print(" Enter the size of the array : ");
      int size = sc.nextInt();

      int[] arr = new int[size];
      System.out.println("Enter the elements of the array");

    for(int i = 0; i < size;i++){
        int elements = sc.nextInt();
        arr[i] = elements;
    }
       int res = (secondLargest1(arr));

       if(res > 0){
        System.out.println("The second largest element in the array is : " + secondLargest1(arr));
       }else{
        System.out.println(" There is no second largest element in the array !!");
       }
       sc.close();
    }
 }  
        // Successfully updated the program.

 
// There is a problem in below code, that is if the input has 2 same largest elements then
//-it is not giving the second largest element, it is giving the largest element.
    // static int second_largest(int[] arr){
    //     int max1 = 0;
    //     int max2 = 0;
        
    //     if(arr[0] > arr[1]){
    //         max1 = arr[0];
    //         max2 = arr[1];
    //     }else{
    //         max2 = arr[0];
    //         max1 = arr[1];
    //     }
    //     for(int i = 2; i < arr.length; i++){
    //       if(arr[i] > max1){    // It is for second largest element.
    //             max2 = max1;    // store it in max2 before accessing ith element.
    //             max1 = arr[i];
    //       }
    //       else if(arr[i] > max2){   // to find second element.
    //             max2 = arr[i];      // Store the second max element.
    //       }
    //     }
    //     return max2;
    // }
    // public static void main(String[] args) {
    //     int[] arr = {10,10,10,11,}; 

    //     System.out.println(second_largest(arr));

    // }
 

 // second largest element in the array.
 // These comments are related to the progem in the comments(50 to 77).
 // It is quite confusing to find second largest element but we achieve.
 // The process is that to take 2 variables max1 and max2. max1 is used to store largest element
 //   -and max2 is used to store second largest element.
 // Assign the 2 variables with first index and second index respectively.
 // Traverse  every element and check the largest element and then find seccond largest element.
