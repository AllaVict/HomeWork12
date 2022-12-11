package org.alla;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test() {
        // level 2:
        // double numberFirst = getNumberFromConsole();
        // double numberSecond = getNumberFromConsole();
        // sum(numberFirst, numberSecond);
        // difference(numberFirst, numberSecond);
        // product(numberFirst, numberSecond);
        // division(numberFirst, numberSecond);

 //       double answerGetNumberFromConsole = Main.getNumberFromConsole();
 //       assertEquals(5.0, answerGetNumberFromConsole);

        double answerOfSum = Main.sum(5.0, 3.0); // 8.0
        assertEquals(8.0, answerOfSum, 8.0);
        double answerOfDeference = Main.difference(5, 3);
        assertEquals(2.0, answerOfDeference, 8.0);
        double answerOfProduct = Main.product(5, 3);
        assertEquals(15.0, answerOfProduct, 15.0);
        double answerOfDivision = Main.division(5, 3);
        assertEquals(1.6666666666666667, answerOfDivision, 1.6666666666666667);

    }


    public static double getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        return number;
    }

    public static double sum(double j, double k) {
        double sum = j + k;
        System.out.println("sum = " + sum);
        return sum;
    }

    public static double difference(double j, double k) {
        double difference = j - k;
        System.out.println("difference = " + difference);
        return difference;
    }

    public static double product(double j, double k) {
        double product = j * k;
        System.out.println("product = " + product);
        return product;
    }

    public static double division(double j, double k) {
        double division = j / k;
        System.out.println("division = " + division);
        return division;
    }


}