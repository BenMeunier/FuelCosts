import java.util.Scanner;

class FuelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallonsInTank;
        double efficiency;
        double pricePerGallon;


        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            gallonsInTank = scanner.nextDouble();
        } while (gallonsInTank <= 0);


        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            efficiency = scanner.nextDouble();
        } while (efficiency <= 0);


        do {
            System.out.print("Enter the price of gas per gallon: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);

        double totalCost = (gallonsInTank * pricePerGallon) / efficiency;
        System.out.printf("The total cost of driving is $%.2f\n", totalCost);

        scanner.close();
    }
}
