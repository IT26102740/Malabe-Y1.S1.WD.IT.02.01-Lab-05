import java.util.Scanner;
public class IT26102740Lab5Q1[
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int num1, num2, num3, Largest, Smallest;

        System.out.print("Please enter the first integer");
        num1 = input.nextInt();

        System.out.print("Please enter the second integer");
        num2 = input.nextInt();

        System.out.print("Please enter the third integer");
        num3 = input.nextInt();

        Largest = num1;
        Smallest = num1;

        if (num2 > Largest) {
        Largest = num2;
    }

        if (num3 > Largest) {
        Largest = num3;
    }

        if (num2 < Smallest) {
        Smallest = num2;
    }    

        if (num3 < Smallest) {
        Smallest = num3;
    }

    System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
    System.out.println("The Smallest number is: " + Smallest);
    System.out.println("The Largest number is: " + Largest);
    }
]