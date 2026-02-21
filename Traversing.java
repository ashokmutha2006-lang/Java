
// traversing or accessing all the elements in an array.

public class Traversing
{
   static void traversing(int[] arr)
   {    
    for(int i=0;i <= arr.length-1; i++){
    System.out.print(arr[i]+" ");
    }
    System.out.println();
   }
   public static void main(String[] args) {

    System.out.println("enter the values of array : ");
    int[] arr = {10,20,30,40,50};

    traversing(arr);
   }
}
