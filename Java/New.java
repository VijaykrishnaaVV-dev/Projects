package Java;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Fibocion number: ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count < n) {  
            int temp = b;
            b = a + b;  // Correct Fibonacci formula
            a = temp;
            count++;
        }
        System.out.println(count);
        in.close();
    }
}