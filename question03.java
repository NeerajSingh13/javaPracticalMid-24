import java.util.Scanner;

public class question03 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter First Number : ");
                int num1 = input.nextInt();

                System.out.print("Enter Second Number : ");
                int num2 = input.nextInt();

                int sum1 = sumOfDivisor(num1);
                int sum2 = sumOfDivisor(num2);

                if (sum1 == num1 && sum2 == num2){
                        System.out.println("Friendly Pair.");
                } else {
                        System.out.println("This is not a Friendly Pair.");
                }
                input.close();
        }

        public static int sumOfDivisor(int num){
                int sum = 0;
                for (int i = 1; i < num; i++){
                        if (num % i == 0){
                                sum +=  i;
                        }
                }
                return sum;
        }
}
