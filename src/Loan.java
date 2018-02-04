import java.util.Scanner;
/*creator: Hamid Majeed
Purpose: Modify Loan class to where it will throw exception if interest rate, number of years, and loan amount = 0
Date:02/04/18
 */
public class Loan {

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            boolean continueInput = true;

        do {
            System.out.print( "Enter your desired annual interest rate please. (For example, :8.25) ");
            double annualInterestRate = input.nextDouble();

            System.out.print("Enter your desired number of years you want the loan for.(As an integer) ");
            int numberOfYears = input.nextInt();

            System.out.print("Enter your desired loan amount please. (For example: 120000.95) ");
            double loanAmount = input.nextDouble();

            try {
                Loan1 loan =
                        new Loan1 (annualInterestRate, numberOfYears, loanAmount);
                continueInput = false;

                System.out.printf("The loan was created on %s\n" +
                                "The monthly payment is %.2f\nTne total payment is %.2f\n",
                        loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                        loan.getTotalPayment());
            }
            catch (IllegalArgumentException ex) {

                System.out.println(ex.getMessage());
            }
        } while (continueInput);
    }
}