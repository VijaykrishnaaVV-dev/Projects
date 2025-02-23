package Java;

import java.util.Scanner;

public class New{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eneter yout age:");
        int num = input.nextInt();
        if (num<18) {
            System.out.print("Your not eligibal for voting");
        }else{
            System.out.println("Your eligibal for voting");
        }
        input.close();
    }
}