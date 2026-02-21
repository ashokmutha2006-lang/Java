import java.util.Scanner;

public class MoveZerosToEnd {
   
    static void moveZero(int[] arr){
        int nz = 0;
        int z = 0;
        int size = arr.length;
      while(nz < size){
        if(arr[nz] != 0){
            int temp = arr[nz];
            arr[nz] = arr[z];
            arr[z] = temp;
            nz++;
            z++;
        }
        else{
            nz++;
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

         
        System.out.println("Before Rotating the array :");
        for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
        }

        System.out.println();

        moveZero(arr);

         System.out.println("After Rotating the array :");
           for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
        }
        scan.close();
    }

}


// Write a program to Move the zeroes to enf of an array(16/01/26).
 
// Here i am used the approach is Two pointer approach.
// Two pointer means, using two variables 1-z(zero) and 2-nz(nonZero).
// Starting Two pointers are refering to same element. 
// z is for to stick with the element 0.
// nz variable is used for nonzero elements.
// If there is an element greater than 0, store it in nz and swap with z variable.
// swap as long as nz < arraylength(while).