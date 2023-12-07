import java.util.Scanner;

/**
 * Main class
 * Author: Nicholas Vickery
 * Date: 9/18/2023
 * Program: Basic java concepts
 * Description: This program prompts the user to enter details about three pairs of shoes and then
 * displays the gathered information.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First pair
        PairOfShoes firstShoe = new PairOfShoes();

        System.out.print("Enter the brand name of the shoes: ");
        firstShoe.setBrandName(scanner.nextLine());

        System.out.print("Enter the color of the shoes: ");
        firstShoe.setColorOfShoes(scanner.nextLine());

        System.out.print("Enter the size of the shoes: ");
        firstShoe.setSizeOfShoes(scanner.nextDouble());
        scanner.nextLine();
        System.out.println();

        // Second pair of shoes
        PairOfShoes secondShoe = new PairOfShoes();

        System.out.print("Enter the brand name of the shoes: ");
        secondShoe.setBrandName(scanner.nextLine());

        System.out.print("Enter the color of the shoes: ");
        secondShoe.setColorOfShoes(scanner.nextLine());

        System.out.print("Enter the size of the shoes: ");
        secondShoe.setSizeOfShoes(scanner.nextDouble());
        scanner.nextLine();
        System.out.println();

        // Third pair of shoes
        PairOfShoes thirdShoe = new PairOfShoes();

        System.out.print("Enter the brand name of the shoes: ");
        thirdShoe.setBrandName(scanner.nextLine());

        System.out.print("Enter the color of the shoes: ");
        thirdShoe.setColorOfShoes(scanner.nextLine());

        System.out.print("Enter the size of the shoes: ");
        thirdShoe.setSizeOfShoes(scanner.nextDouble());
        scanner.nextLine();
        System.out.println();

        // Displaying the information
        System.out.print("I have a pair of ");
        firstShoe.printAll();
        System.out.println(" shoes.");

        System.out.print("My wife has a pair of ");
        secondShoe.printAll();
        System.out.println(" shoes that she really likes.");

        System.out.print("My kid wears a pair of ");
        thirdShoe.printAll();
        System.out.println(" sneakers.");
        System.out.println();

        System.out.println("At least 1 pair of shoes is made by " + firstShoe.getBrandName() + ",");
        System.out.println("and 1 is " + secondShoe.getColorOfShoes() + ".");
        System.out.println("Someone wears a size " + thirdShoe.getSizeOfShoes() + " shoe.");
    }
}