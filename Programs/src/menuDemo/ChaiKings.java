package menuDemo;

import java.util.Scanner;

public class ChaiKings  {

    public static void main(String[] args) {

        Tea();

    } 

    public static void Tea() {

        int choice;

        int Special_Tea = 1;
        int Masala_Tea = 2;
        int Mint_Tea = 3;

        int Special_Tea_Cost = 25;
        int Masala_Tea_Cost = 40;
        int Mint_Tea_Cost = 50;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to CHAI KINGS...! What type of Tea would you like?");
        System.out.println("1. Special_Tea");
        System.out.println("2. Masala_Tea");
        System.out.println("3. Mint_Tea");

        choice = keyboard.nextInt();

        if (choice == 1) {
            choice = Special_Tea_Cost;
        } else if (choice == 2) {
            choice = Masala_Tea_Cost;
        } else if (choice == 3) {
            choice = Mint_Tea_Cost;
        } else if (choice > 3 || choice < 1) {
            System.out.println("Try again.");
            choice = -1;
            Tea();
        }

        System.out.println("That will be Rs." + choice + ".");

        size(choice);

    } 

    public static void size(int choice) {

        int sizeChoice;
        int large = 5;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What Qty you desire to have ?");
        System.out.println("1. Large");
        System.out.println("2. Small");

        sizeChoice = keyboard.nextInt();

        if (sizeChoice == 1)
            System.out.println("That will be Rs." + (choice + large) + ".");
        else if (sizeChoice == 2)
            System.out.println("That will be Rs." + choice);
        else
            System.out.println("Please, enter either a 1 or a 2.");

    } 

}
