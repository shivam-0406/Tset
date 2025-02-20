import java.util.*;

public class File5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of crates:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the crates values: (give space between numbers) ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        moveZerosToEnd(arr);
        System.out.println("Crates after moving empty ones to end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public static void moveZerosToEnd(int[] arr){
        int index=0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
    }
}
