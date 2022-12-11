package org.alla;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Снова взять код из домашки за 7 ноября, подключить библиотеку тестирования
//        и протестировать (по 2-3 теста на каждый метод) задачу первого уровня из ДЗ от 7 ноября
        double numberFirst = getNumberFromConsole();
        double numberSecond = getNumberFromConsole();
        sum(numberFirst, numberSecond);
        difference(numberFirst, numberSecond);
        product(numberFirst, numberSecond);
        division(numberFirst, numberSecond);
    }

    public static double getNumberFromConsole() {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        return number;
    }

    public static double sum(double j, double k) {
        double sumB = j + k;
        System.out.println("sum = " + sumB);
        return sumB;
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