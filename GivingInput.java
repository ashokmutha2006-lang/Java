import java.util.Scanner;

// giving input to the array from users.

public class GivingInput {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of an array : ");
    int size = scan.nextInt();

     int[] arr = new int[size];

    for(int i=0;i<size;i++){
    System.out.print("Enter the elements of array :");
     int n = scan.nextInt();
     arr[i]= n;
    }
    for(int i =0;i < size; i++){
        System.out.print(arr[i]+" ");
    }
    scan.close();
}
}