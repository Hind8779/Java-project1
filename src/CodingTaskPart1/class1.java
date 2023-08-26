package CodingTaskPart1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class class1 {
    public static void main(String[] args) {
        //1. Create a program that uses an array to store a list of temperatures for
        //a week, and then uses a loop to find the highest and lowest
        //temperature for the week.
        int[] temp = {75, 80, 82, 79, 77, 72, 70};

        int max = 0;
        for (int i = 0; i < temp.length; i++) {
            if (max <= temp[i]) {
                max = temp[i];
            }
        }
        System.out.println(max);
        System.out.println("================================================================================>");
//2. Create an array of integer values. After the array is created, calculate
//the sum of all stored elements in that array.
        int[] num = {10, 20, 50, 30};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {

            sum += num[i];


        }
        System.out.println(sum);
        System.out.println("=============================================================================>");
        //3. Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even
        //numbers only.
        int[][] arr = {
                {3, 4, 7, 8, 10},
                {6, 9, 20, 1},
                {100, 30, 55, 80}};
        int even = 0;
        for (int r = 0; r < arr.length; r++) {
            for (int t = 0; t < arr[r].length; t++) {

                if (arr[r][t] % 2 == 0) {
                    even = arr[r][t];
                    System.out.print(even + " ");


                }

            }
        }
        System.out.print("\n====================================================================>");

//4. Create a 2D array of integers. Develop a program which will calculate
//the sum of even and odd numbers for that array.
        int[][] array = {
                {2, 4, 5, 6},
                {1, 2, 3, 7},
                {8, 9, 10, 11}};
        int evsum = 0;
        int odsum = 0;

        for (int H = 0; H < array.length; H++) {
            for (int y = 0; y < array[H].length; y++) {
                if (array[H][y] % 2 == 0) {
                    evsum += array[H][y];

                } else {
                    odsum += array[H][y];

                }
            }

        }
        System.out.println("\nthe sum of even" + " " + evsum);
        System.out.println("the sum of odd" + " " + odsum);
        System.out.println("\n==========================================================================>>");

//5. Write a program to swap 2 numbers without a temporary variable?
        int x = 10;
        int y = 20;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        //after swapping
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x after swapping " + x);
        System.out.println("y after swapping " + y);

        System.out.println("\n============================================================================");
//6. Write a java program to check whether a given number is prime or
//not?
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int input = scanner.nextInt();
        boolean numIsPrime = true;
        for (int i = 2; i < input; i++) {
            if (input % i == 0)
                numIsPrime = false;
            break;

        }

        if (numIsPrime) {
            System.out.println(input + " is a prime number");
        } else {
            System.out.println(input + " is not a prime number");

        }
        System.out.println("==========================================================================");
//7. Write a Java Program to print the first 10 numbers of Fibonacci series.
        int n = 10;
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];

        }
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i] + "");
        }
        System.out.println("=======================================================================");
//8. Maximum and minimum number in the array?
        int[] numbers = {10, 4, 2, 9, 7};
        int maxi = numbers[0];
        int min = numbers[0];
        ;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxi) {

                maxi = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number:" + maxi);
        System.out.println("Minimum number: " + min);
        System.out.println("===============================================================================");

//9. Write a java program to find the second largest number in the array?
        int[] hi = {10, 4, 2, 9, 7};

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < hi.length ; i++) {
            if (hi[i] > largest) {
                secondLargest = largest;
                largest = hi[i];
            } else if (hi[i] > secondLargest && hi[i] != largest) {
                secondLargest = hi[i];
            }
        }
        System.out.println(secondLargest);


        System.out.println("==============================================================================");


        //10. Write a program to print out duplicate elements from an Array of
//Strings?

            String[] fru = {"apple", "banana", "cucumber", "apple", "banana"};

           String dup="";
        for (int i = 0; i < fru.length ; i++) {
            for (int j = 0; j < fru.length ; j++) {
                if(fru[i].equals(fru[j])){
                    dup=fru[i];

            }
            }
        }
        System.out.println(dup);
        System.out.println("============================Done===========================================");

    }

        }






































