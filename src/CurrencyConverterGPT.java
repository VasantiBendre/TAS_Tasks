import java.util.Scanner;

public class CurrencyConverterGPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user to enter the amount to be converted
        System.out.print("Enter the amount to be converted: ");
        double amount = scanner.nextDouble();

        // Step 3: Prompt the user to enter the source currency
        System.out.print("Enter the source currency: ");
        String sourceCurrency = scanner.next().toUpperCase();

        // Step 5: Prompt the user to enter the target currency
        System.out.print("Enter the target currency: ");
        String targetCurrency = scanner.next().toUpperCase();

        // In a real implementation, you would fetch exchange rates from an API or use a formula
        double exchangeRate = getExchangeRate(sourceCurrency, targetCurrency);

        // Step 8: Perform currency conversion
        double convertedAmount = amount * exchangeRate;

        // Display the converted amount
        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }

    // This is a placeholder method to simulate fetching exchange rates
    // In a real application, you would replace this with actual API calls or a conversion formula
    private static double getExchangeRate(String sourceCurrency, String targetCurrency) {
        // Simulating exchange rates
        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return 0.85; // 1 USD to EUR
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return 1.18; // 1 EUR to USD
        } else {
            // Default exchange rate if not found
            return 1.0;
        }
    }
}
