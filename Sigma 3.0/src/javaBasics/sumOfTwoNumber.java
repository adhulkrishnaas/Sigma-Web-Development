package javaBasics;

import java.util.Scanner;

public class sumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 10;
        int  b= 5;
        int sum = a + b ;
        System.out.println(sum);

        int num1,num2,result;

        num1 = sc.nextInt();
        num2 = sc.nextInt();

        result = num1 + num2;

        System.out.println(result);

    }
}
