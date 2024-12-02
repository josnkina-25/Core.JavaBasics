import java.util.Scanner;

public class PracticeAsg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
        int a = 7;
        if (a < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
        int b = 50;
        if (b < 10) {
            System.out.println("Less than 10");
        } else if (b > 10 && b < 20) {
            System.out.println("Greater than 10");
        } else if (b >= 20) {
            System.out.println("Greater than 20");

        }
        int c = 5;
        if (c <= 10 || c >= 20) {
            System.out.println("Out of range");
        } else {
            System.out.println("In range");

        }
//         A = 90 - 100;
//         B = 80 - 89;
//         C = 70 - 79;
//         D = 60 - 69;
//         F = < 60;


        System.out.print("Enter the grade percentage: ");
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Score out of range");
        } else if (score >= 90) {
            System.out.println("Your Grade is: A");


        } else if (score >= 80) {
            System.out.println("Your Grade is: B");
        } else if (score >= 70) {
            System.out.println("Your Grade is: C");
        } else if (score >= 60) {
            System.out.println("Your Grade is: D");
        } else if (score < 60) {
            System.out.println("Your Grade is: F");
        }

        System.out.println();

        // program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the corresponding weekday.
        // Print “Out of range” if the number is less than 1 or greater than 7.
        // Do not forget to include “break” statements in each of your cases.

        System.out.print("Enter an integer between 1 and 7: ");
        int day = sc.nextInt();
        // switch statement to print out the corresponding weekday.
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        System.out.println();
//         program that lets the users input their filing status and income.
//         Display how much tax the user would have to pay according to status and income.
//        The U.S. federal personal income tax is calculated based on the filing status and taxable income.
//        There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
        System.out.print("Enter your status: ");
        String status = sc.next();
        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        while (income > 0 && income <= 372951) {

            if(status.equals("single")){
                if(income <= 8350){
                    double tax = income * 0.10;
                    System.out.println("Your tax rate is: " + tax);
                } else if (income > 8351 && income <= 33950){
                    double tax = income * 0.15;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 33951 && income <= 82250) {
                    double tax = income * 0.25;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 82251 && income <= 171550) {
                    double tax = income * 0.28;
                    System.out.println("Your tax rate is: "+ tax);

                } else if (income > 171551 && income <= 372950) {
                    double tax = income * 0.33;
                    System.out.println("Your tax rate is: "+ tax);

                } else{
                    double tax = income * 0.35;
                    System.out.println("Your tax rate is: "+ tax);
                }

            } else if (status.equals("Married Filing Jointly")) {
                if(income <= 16700){
                    double tax = income * 0.10;
                    System.out.println("Your tax rate is: " + tax);
                } else if (income > 16701 && income <= 67900){
                    double tax = income * 0.15;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 67901 && income <= 137050) {
                    double tax = income * 0.25;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 137051 && income <= 208850) {
                    double tax = income * 0.28;
                    System.out.println("Your tax rate is: "+ tax);

                } else if (income > 208851 && income <= 372950) {
                    double tax = income * 0.33;
                    System.out.println("Your tax rate is: "+ tax);

                } else{
                    double tax = income * 0.35;
                    System.out.println("Your tax rate is: "+ tax);
                }
            } else if (status.equals("Married Filing Separately")) {
                if(income <= 8350){
                    double tax = income * 0.10;
                    System.out.println("Your tax rate is: " + tax);
                } else if (income > 8351 && income <= 33950){
                    double tax = income * 0.15;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 33951 && income <= 68525) {
                    double tax = income * 0.25;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 68526 && income <= 104425) {
                    double tax = income * 0.28;
                    System.out.println("Your tax rate is: "+ tax);

                } else if (income > 104426 && income <= 186475) {
                    double tax = income * 0.33;
                    System.out.println("Your tax rate is: "+ tax);

                } else{
                    double tax = income * 0.35;
                    System.out.println("Your tax rate is: "+ tax);
                }

            } else if (status.equals("Head of Household")) {
                if(income <= 11950){
                    double tax = income * 0.10;
                    System.out.println("Your tax rate is: " + tax);
                } else if (income > 11951 && income <= 45500){
                    double tax = income * 0.15;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 45501 && income <= 117450) {
                    double tax = income * 0.25;
                    System.out.println("Your tax rate is: "+ tax);
                } else if (income > 117451 && income <= 190200) {
                    double tax = income * 0.28;
                    System.out.println("Your tax rate is: "+ tax);

                } else if (income > 190201 && income <= 372950) {
                    double tax = income * 0.33;
                    System.out.println("Your tax rate is: "+ tax);

                } else{
                    double tax = income * 0.35;
                    System.out.println("Your tax rate is: "+ tax);
                }

            }else{
                System.out.println("Invalid status");
            }
            break;
        }
    }
}
