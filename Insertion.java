
 class Insertion{
    
    static int insert(int[] arr,int n,int maxsize, int position,int new_element){

        if(n >= maxsize){
            System.out.println("Array is full. can't insert!!");
            return n;
        }
        for(int i=n-1; i >= position; i--){
            arr[i+1] = arr[i];
        }
        arr[position] = new_element;
        return n+1 ;
    }

public static void main(String[] args){
    int arr[] = new int[4];
        int size = 4 ;
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30; 
            arr[3] = 40;
        System.out.println("Original array: ");
    for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
    }
        System.out.println();
             size = insert(arr,size,4,2,25);
             System.out.println("After insertion: ");
    for(int i = 0; i < size; i++){
            System.out.print(arr[i]+" ");
    }
  }
}

// the insert operation is done when the array has enough space to insert.
// if an array is a fixed size and it is full, we cant insert an element.
// 