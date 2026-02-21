import java.util.Scanner;

public class Largest {
    
    static int largestElement(int[] arr, int largest){
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
      return largest;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];    

        for(int i = 0; i < size; i++){
        System.out.println("Enter th elements of the array : ");
        int elements = sc.nextInt();
        arr[i] = elements;
        }

        int largest = 0;
        System.out.println( "The largest element in the array is : "+ largestElement(arr,  largest));

        sc.close();
    }
}

// The above program is to find the largest element in the given array(user input).
// we simply use a -_for_- loop to find the largest element.
// we traversed all the elements in the array.
// The Time complexity of the above program is Big-O(n).[Because, all the elements are travarsed atleast once].
// In the program we can find largest element for any input size.
// 2.we can also find largest element by using max(first_number, second_number) ---- This max method gives the maximum of the two numbers.
// 3.Next method to find the largest element is nothing but , first sort the array and the last element is nothing but the largest element.