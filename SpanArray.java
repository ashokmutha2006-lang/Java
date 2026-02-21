import java.util.Scanner;

class SpanArray{
    static int span(int[] arr){
      int largest = arr[0];
      int smallest = arr[0];
      
      
       for(int i=1;i < arr.length; i++){

        if(arr[i] > largest){
            largest = arr[i];
        }
        if(smallest > arr[i]){
            smallest = arr[i];
        }
    }
    int diference = largest - smallest;// we can also direcctly return the diference
        return diference;              // like --> return largest-smallest;
                                       //(adv is variable is not required to return the result)
}
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

      System.out.print("Enter the size of the array : ");
      int size = scan.nextInt();
      int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter the Element of  array of " + i + " is : ");
            int element = scan.nextInt();
            arr[i] = element;
         }
      
        System.out.println(span(arr));
         scan.close();
    }
}
// --- Span of an array.

//1. span = max - min (max_num - min_num)
//2. First find the largest and smallest elements of the array.
//3. Then subtract the smallest element from the largest element.
//4. Obtain the result and store it the variable-difference and return it.