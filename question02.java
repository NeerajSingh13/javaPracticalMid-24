import java.util.Scanner;

public class question02 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Menu : ");
                System.out.println("1. Term deposit.");
                System.out.println("2. Recurring deposit.");
                System.out.print("Enter Choice : ");
                int choice = input.nextInt();

                switch (choice) {
                        case 1:
                                System.out.print("Enter principle amount : ");
                                double principle1 = input.nextDouble();

                                System.out.print("Enter rate of interest : ");
                                double rate1 = input.nextDouble();

                                System.out.print("Enter time period in years : ");
                                int time1 = input.nextInt();

                                double maturityAmount1 = principle1 * Math.pow((1 + (rate1/100)), time1);
                                System.out.println("Maturity Amount : " + maturityAmount1);

                                break;
                        case 2:
                                System.out.print("Enter principle amount : ");
                                double principle2 = input.nextDouble();

                                System.out.print("Enter rate of interest : ");
                                double rate2 = input.nextDouble();

                                System.out.print("Enter time period in years : ");
                                int time2 = input.nextInt();

                                double maturityAmount2 = principle2 * Math.pow((1 + (rate2/100)), time2);
                                System.out.println("Maturity Amount : " + maturityAmount2);
                                break;
                        default:
                                System.out.println("Enter Valid Choice (1 / 2)");
                                break;
                }
                input.close();
        }
}
