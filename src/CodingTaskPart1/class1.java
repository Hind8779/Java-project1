package CodingTaskPart1;

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
                    evsum+= array[H][y];

                } else {
                    odsum += array[H][y];

                }
            }

        }
        System.out.println("\nthe sum of even" +" "+ evsum);
        System.out.println("the sum of odd" +" "+ odsum);
        System.out.println("\n==========================================================================>>");

//5. Write a program to swap 2 numbers without a temporary variable?
        int x=10;
        int y=20;
        System.out.println("x="+x);
        System.out.println("y="+y);
        //after swapping
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("x after swapping "+x);
        System.out.println("y after swapping "+y);

        System.out.println("\n============================================================================");





    }
}



























