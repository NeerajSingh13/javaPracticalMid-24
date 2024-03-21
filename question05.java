import java.util.Arrays;
import java.util.Scanner;

public class question05 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter array size : ");
                int arrSize = input.nextInt();

                int[] arr = new int[arrSize];
                System.out.print("Enter array elements : ");
                for (int i = 0; i < arrSize; i++){
                        arr[i] = input.nextInt();
                }
                
                Arrays.sort(arr);
                for (int i = 1; i <= arr.length - 2; i += 2) {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                }

                System.out.print("Updated Array Elements :");
                for (int i = 0; i < arrSize; i++){
                        System.out.print(arr[i] + " ");
                }
                input.close();
        }
}