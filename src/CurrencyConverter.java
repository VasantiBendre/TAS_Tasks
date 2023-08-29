import java.util.*;

public class CurrencyConverter 
{
	float amount;
	String sourceCurrency, targetCurrency;
	Scanner sc = new Scanner(System.in);
	
	public void accept()
	{
		System.out.println("Enter the amount:");
		amount=sc.nextFloat();
		
		System.out.println("Enter the Source Currency:IND|USD|EUR");
		sourceCurrency=sc.next();
		
		System.out.println("Enter the Target Currency:IND|USD|EUR");
		targetCurrency=sc.next();
	}
	
	public void fetch()
	{
		 double exchangeRate = getExchangeRate(sourceCurrency, targetCurrency);
		 
		 double convertedAmount= amount * exchangeRate;
		 
		 System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);
	}

	public static double getExchangeRate(String sourceCurrency, String targetCurrency) 
	{
		if ((sourceCurrency.equals("IND") || sourceCurrency.equals("ind")) && (targetCurrency.equals("USD") || targetCurrency.equals("usd")))
		{
			return 0.012;
		}
		else if ((sourceCurrency.equals("USD") || sourceCurrency.equals("usd")) && (targetCurrency.equals("IND") || targetCurrency.equals("ind")))
		{
			return 82.96;
		}
		else if ((sourceCurrency.equals("IND") || sourceCurrency.equals("ind")) && (targetCurrency.equals("EUR") || targetCurrency.equals("eur")))
		{
			return 0.011;
		}
		else if ((sourceCurrency.equals("EUR") || sourceCurrency.equals("eur")) && (targetCurrency.equals("IND") || targetCurrency.equals("ind")))
		{
			return 90.96;
		}
		else if ((sourceCurrency.equals("USD") || sourceCurrency.equals("usd")) && (targetCurrency.equals("EUR") || targetCurrency.equals("eur")))
		{
			return 0.91;
		}
		else if ((sourceCurrency.equals("EUR") || sourceCurrency.equals("eur")) && (targetCurrency.equals("USD") || targetCurrency.equals("usd")))
		{
			return 1.10;
		}
		else
		{
			return 1;
		}
	}

	public static void main(String []args)
	{
		CurrencyConverter cc = new CurrencyConverter();
		cc.accept();
		cc.fetch();
	}	
}
