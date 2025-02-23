package Java;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value:");
        int start = input.nextInt();
        int i=start;
        do{
            System.out.println(i);
            i+=1;
        }while(i<=5);
        input.close();
    }
}