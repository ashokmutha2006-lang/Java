import java.util.Scanner;

public class RotateArray {
    
    static void rotatingArray(int[] arr){

        int temp = arr[0];

        for(int i = 1; i < arr.length; i++){
             arr[i - 1] = arr[i];
        }
            arr[arr.length-1] = temp;
    }


    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array : ");
        
        for(int i = 0; i < arr.length; i++){
            int elements = scan.nextInt();
            arr[i] = elements;
        }

         System.out.println("Enter the count to be rotated : ");
         int count = scan.nextInt();
         
        System.out.println("Before Rotating the array :");
        for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
        }

        System.out.println();

        rotateOptimal(arr, count);
         System.out.println("After Rotating the array :");
           for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
        }
        scan.close();
    }


// This second is to rotate the array by n no. of times.
// THe above method is for only for rotating only one time.

static void rotatingArray1(int[] arr, int count){
        if(count < 0){
            count *= (-1);
        }
        if(count >= arr.length){
            count %= arr.length;
        }
        System.out.println("The number of times the array  must be rotated is : " + count);
        int[] temp = new int[count];
        int j = 0;

        for(int i = 0; i < count; i++){
            temp[i] = arr[i];
        } 
        for(int i = count; i < arr.length; i++){
            arr[j] = arr[i];
            j++;
        }
        int k = 0;
        for(int i = arr.length - count; i < arr.length; i++){
            arr[i] = temp[k];
            k++;
        }
        // time complexity = O(k*n);(greater than O(n)).
    }

// The optimal way to rotate an array by k times.
// The above code is my own logic code.

    static void rotatingArray2( int[] arr, int count){
        count %= arr.length;    // To decrease the max number of iterations.
          
        if(count < 0){          // To rotate in reverse direction.
            count = count + arr.length;
        }
        for(int i = 0; i < count; i++){
            rotatingArray(arr);
        }
    }


    static void reverseArray(int[] arr, int st, int end){

      for(int i = 0; i < end; i++){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    static void rotateOptimal(int[] arr, int count){
        
            count %= arr.length;
        System.out.println(count);
        reverseArray(arr, 0, count-1);
        reverseArray(arr, count, arr.length-1);
        reverseArray(arr, 0, arr.length-1);
    }

// why choosing the rotateoptimal method is that the time complexity is smaller compared to remaining methods.
// time complexity = O(n)

}

// note - (Observations).
// 1. If the count number is very large, it must have rotate so many times.
//    -so to reduce the iterations - divide the count with arr.length(modulus).
// 2. count is nothing but how mant times we want to rotate the array.
// 3. If the the count is in negative number(-1) then the rotation must be 
//    -in reverse direction.
