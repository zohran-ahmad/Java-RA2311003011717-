import java.util.*;
public class Week1ControlStructures{
    public static void main(String[] args){

        // Q1
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


        // Q2
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }


        // Q3
        System.out.println("Press 1 for juice or 2 for soda.");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Dispensing juice.");
        } else if (choice == 2) {
            System.out.println("Dispensing soda.");
        } else {
            System.out.println("Invalid choice.");
        }


        // Q4
        System.out.println("Enter the current temperature");
        int temp = scanner.nextInt();

        if (temp > 30){
            System.out.println("It's hot!");
        } else if (temp > 20 && temp <=30){
            System.out.println("It's warm");
        } else if (temp >= 10 && temp < 20){
            System.out.println("It's cool");
        } else {
            System.out.println("It's cold");
        }


        // Q5
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }


        // Q6
        System.out.print("Enter your exam score: ");
        int score = scanner.nextInt();

        // Determine the grade category based on the score
        int gradeCategory = score / 10;

        switch (gradeCategory) {
            case 10: // For scores 100
            case 9:
                System.out.println("Your grade is A (Excellent).");
                break;
            case 8:
                System.out.println("Your grade is B (Very Good).");
                break;
            case 7:
                System.out.println("Your grade is C (Good).");
                break;
            case 6:
                System.out.println("Your grade is D (Satisfactory).");
                break;
            default:
                if (score >= 0 && score < 60) {
                    System.out.println("Your grade is F (Fail).");
                } else {
                    System.out.println("Invalid score input.");
                }
                break;
        }


        // Q7
        System.out.println("Enter 1 for addition or 2 for subtraction.");
        System.out.print("Enter your choice: ");
        int ch = scanner.nextInt();

        if (ch == 1) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);
        } else if (ch == 2) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double difference = num1 - num2;
            System.out.println("The difference is: " + difference);
        } else {
            System.out.println("Invalid choice.");
        }


        // Q8
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
