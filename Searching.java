import java.util.Scanner;

public class Searching {
 /*  
    //searching an array without methods
    public static void main(String[] args) {
        int[] array = { 10,20,30,40,5};
        int target = 50;
        int index = -1;
        
        for(int i = 0;i<array.length;i++){
            if(array[i] == target){
                index = i;
                break;
            }          
        }
        if(index != -1){
            System.out.println("the element is found at : "+ index);
        }else{
            System.out.println("The element is found in the array");
        }
    }
}
*/

// Searching an element in array using methods and taking user inputs.

static int search(int[] arr,int target){
  
    for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }   
        }
           return -1;
        }

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the size of the array :");
    int size = scan.nextInt();

    int[] arr = new int[size];
     
    for(int i = 0;i < size; i++){
        System.out.println("Enter the elements of the array : ");
        int element = scan.nextInt();
        arr[i] = element;
    }

    System.out.println("Enter the target element :");
    int target = scan.nextInt();
 
   int foundIndex= search(arr,target);
   System.out.println(foundIndex);
    
  if(foundIndex != -1){
            System.out.println("the element is found at : "+ foundIndex);
        }else{
            System.out.println("The element is not found ");
        }

        scan.close();
    }
}