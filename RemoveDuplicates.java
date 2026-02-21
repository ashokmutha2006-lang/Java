public class RemoveDuplicates {
    // public static void main(String[] args) {
    //     int[] data = {2,2,3,3,4,6,6};
    //     duplicates(data);
 
    // }

    // static void duplicates(int[] data){
    //     int[] orig = new int[data.length]; 
    //     int rd ;
    //     orig[0] = data[0];
    //     for(rd = 0; rd < orig.length; rd++){
    //         for(int i = 1; i < data.length; i++){
    //             if(orig[rd] != data[i]){
    //                 orig[rd] = data[i];
                    
    //             }
    //         }
    //     }
    // }


    //  static void duplicates(int[] data){
    //         int[] orig = new int[data.length]; 
    //          int rd = 1 ;
    //          orig[0] = data[0];
    //          for(int i = 0; i < orig.length; i++){
    //             if(data[i] != orig[rd]){
    //                 rd++;
    //                 orig[rd] = data[i];
    //                 System.out.print(orig[rd] + " ");
    //             }
             
    //         }
    //     }
        
    public static void main(String[] args){
       int[] data = {1,2,2,3,4,4,4,5,5};

        System.out.println("Before Duplicating the array : ");
       for(int i=0 ; i < data.length; i++){
        System.out.print(data[i] + " ");
       }
       System.out.println();

        System.out.println("After Duplicating the array : ");

          int res = duplicates(data);
       
          for(int a = 0; a < res; a++){
                System.out.print(data[a] + " ");
         }
         System.out.println();
         System.out.println("The new size is : " + res);
}

     static int duplicates(int[] data){
             int rd = 0;
             for(int i = 1; i < data.length; i++){
                if(data[rd] != data[i]){
                    rd++;
                    data[rd] = data[i];
                }
            }
        return rd+1; // why rd+1 : because, rd has only index value but i want to return size.
    }
}

// The above program is to remove duplicates in an array(16/01/2026).

// how i updated the given problem.
// First i used 2 loops, one for outer loop and another loop for inner.
// Why 2 loops ? one for traversing the array and one for updating rd variable.

// And then i use only one loop only but in this approach i used 2 arrays.
// The first array contains elements with duplicates and 2nd array temp contains only original values.

// In another approach i am only used one loop and one array.
// In that array I Am initialized i and rd variables.
// A duplicate method is created and it returns the value of the size.
// The size indicates that the array has no dupliacate values upto that index.