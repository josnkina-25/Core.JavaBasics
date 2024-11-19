package com.perscholas.java_basics;

public class IndexClass {
    public static void main(String[] args) {
        /*
        Sum of two integers.
         */
    int a = 24;
    int b = 3;
    int sum = a + b;

    System.out.println(sum);
    /*
    Sum of two double variables.
     */
    double c = 45.7;
    double d = 34.8;
    double sum_of_cd= c + d;
    System.out.println(sum_of_cd);
    /*
    sum of integer variable and double variable
     */
    int f = 43;
    double t = 67.5;
    double sum_of_ft = f + t;

    System.out.println(sum_of_ft);

    /*
    Division of integers variable.
     */
    int g = 63;
    int p = 7;
    int div = g / p;
    System.out.println(div);

    /*
    Division of double variable
     */
    double s = 32.0;
    double e = 8.0;
    double division = s / e;
    System.out.println(division);
    /*
    Declaration of two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
    Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q.
    Print q again.

     */
    int x = 5;
    int y = 6;
    int q = y/x;
    System.out.println(q);

    // cast y to a double
    double q_d = (double) y/x;
    System.out.println(q_d);

    /*
    declares a named constant and uses it in a calculation. Print the result.
     */
    final int r = 20; // name constant declaration
    int value = 10;
    int result = value + r;
    System.out.println(result);

    /*
    create three variables that represent products at a cafe. The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
    Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
    four items of the second product, and two items of the third product.
     Add them all together to calculate the subtotal.
    Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.
     */

     double coffee = 3.40;
     double cappuccino = 2.65;
     double espresso = 2.96;

     // products ordered

     int coffeeNumber = 3;
     int cappuccinoNumber = 2;
     int espressoNumber = 1;

     // calculate subtotal

     double subTotal = (coffee * coffeeNumber) + (cappuccino * cappuccinoNumber) + (espresso * espressoNumber);

     // Sales tax

     final double SALES_TAX = 0.05;

     // SubTotal

     double totalSale = subTotal + (subTotal * SALES_TAX);

     System.out.println("The total sale: " + totalSale);




    }
}
