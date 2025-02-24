package Java;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();//input nth value to find 
        int a = 0;//starting number 
        int b = 1;//next number
        int count = 2;//count start from 
        while (count<=n) {//condition to nth number from user input
            int temp = b;
            b=a+b;//finding privous value
            a=temp;//updating the value of a 
            count++;
            System.out.println(b);
        }
        in.close();
    }
}