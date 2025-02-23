package Java;

import java.util.Scanner;

public class New{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start number:");
        int start = input.nextInt();
        System.out.println("Enter end number:");
        int end = input.nextInt();
        for (int i = start; i <= end; i+=1) {
            System.out.println(i);
        }
        input.close();
    }
}