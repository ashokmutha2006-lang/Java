import java.util.Scanner;

public class SubArray {

    static void subArr1(int[] arr,int i, int j){
      
      
    }
    
    static void subArr(int[] arr){

        for(int i = 0; i < arr.length; i++){    

            for(int j = i; j < arr.length; j++){ 

                for(int k=i; k <= j; k++){      // This loop is for printing the elements from ith position to jth position.

                     System.out.print(arr[k] + " ");

                }
                System.out.println();
            }
            
        }
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

        subArr(arr);

     
        scan.close();
    }
}


// Write a program for sub arrays.

//Here we are used 3 loops.

