import java.util.Scanner;

public class question04 {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.println("Enter an integer:");
                int number = input.nextInt();

                String numberStr = String.valueOf(number);
                StringBuilder result = new StringBuilder();

                for(int i = 0 ; i<numberStr.length() ; i++){
                        if(numberStr.charAt(i)== '0'){
                                result.append('1');
                        }else{
                                result.append(numberStr.charAt(i));
                        }

                }
                System.out.println("Output:"+Integer.parseInt(result.toString()));
                input.close();
        }
}