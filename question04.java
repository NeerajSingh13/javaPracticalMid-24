import java.util.Scanner;

public class question04 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter an integer:");
                int num = input.nextInt();

                int ans = 0;
                int temp = 1;

                if (num == 0){
                        System.out.println("1");
                }

                while (num > 0){
                        int rem = num % 10;
                        if (rem == 0){
                                rem = 1;
                        }
                        ans = rem * temp + ans;
                        num = num / 10;
                        temp = temp * 10;
                }
                System.out.println("Updated Number  : " + ans);

                input.close();
        }
}