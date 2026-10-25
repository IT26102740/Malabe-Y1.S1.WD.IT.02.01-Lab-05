
import java.util.Scanner;

public class IT26102740Lab5Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double roomCharge = 48000.00;

        int startDate, endDate, numberOfDays;
        double totalAmount;

        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 ||
            endDate < 1 || endDate > 31) {

            System.out.println("Error: Days must be between 1 and 31");

        } else if (startDate >= endDate) {

            System.out.println("Error: Start Date must be less than End Date");

        } else {

            numberOfDays = endDate - startDate;
            totalAmount = numberOfDays * roomCharge;

            if (numberOfDays >= 3 && numberOfDays < 5) {
                totalAmount = totalAmount * 0.90;
            } else if (numberOfDays >= 5) {
                totalAmount = totalAmount * 0.80;
             }

            System.out.println();
            System.out.println("Room Charge Per Day: Rs. " + roomCharge);
            System.out.println("Number of Days Reserved: " + numberOfDays);
            System.out.println("Total Amount to be Paid: " + totalAmount);
        }
    }
}
