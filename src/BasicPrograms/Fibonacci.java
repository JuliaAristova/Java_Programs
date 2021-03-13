package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
In fibonacci series, next number is the sum of previous two numbers
for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
The first two numbers of fibonacci series are 0 and 1.
 */
public class Fibonacci {

    public static void printNFinbonacciNumbers(int n) {
        int n1=0, n2=1, n3;
        System.out.print(n1+" "+n2+" ");
        for (int i = 2; i <=n ; i++) {
            n3=n1+n2;
            System.out.print(n3+ " ");
            n1=n2;
            n2=n3;
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many Fibonacci numbers you want to print: ");
        int num = scan.nextInt();

        printNFinbonacciNumbers(num);
    }

//        List<Integer> numbers = new ArrayList<>(Arrays.asList(0, 1, 1));
//
//        int i = 2;
//        if (last == 0)
//            System.out.println("0");
//        else if (last == 1)
//            System.out.println("0 1");
//        else {
//            while (numbers.get(i) < last) {
//                numbers.add(i+1, numbers.get(i) + numbers.get(i - 1));
//                i++;
//            }
//            System.out.println(numbers);
//        }



}


