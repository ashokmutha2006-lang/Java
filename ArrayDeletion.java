
// The delete operation is done when there is atleast 1 element the array. 
// After deletion the array size must be reduced by 1.

public class ArrayDeletion {

    static void  deleteElement(int[] arr, int size, int key){
        int i;
        for( i = 0; i  < size; i++){
            if(arr[i] == key){
                break;
            }
        }
        if(i < size){
            for(int j = i; j < size -1; j++){
                arr[j] = arr[j+1];
            }
        }

    }
    public  static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int size = arr.length;
        int key = 20;

      deleteElement(arr,size,key);

        for(int i=0; i < size-1;i++){
            System.out.println(arr[i] + " ");
        }        
        // for(int j = 0;j < arr.length; j++){
        //     System.out.print(arr[j] + " ");
        // }
    }
}