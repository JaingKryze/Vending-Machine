
public class Cashier
	{
	private int currentCents = 0;
	public Cashier(int c)
		{
		currentCents = c;
		}
	public int[] addMoney(int value)
		{
		//take the money that the user inputs into the scanner and add it in to an array 
		currentCents = currentCents + value;
		}
	public int[] currentValue()
		{
		int[] currentValueArray;
		currentValueArray = new int[2];
		currentValueArray[0] = (int) currentCents/100;
		currentValueArray[1] = currentCents%100;
		return currentValueArray;
		}
	public void purchase(int price)
		{
				// make sure you have the variable that will get the correct product
		currentCents = currentCents - price;
		}
	public String returnChange(int[] money)
		{
		return("Your change is " + currentCents + " cents.");
		}
	public static String showCash(int[] money)
		{
		//display the money input into the machine String with dollar sign, displays money
		}
	public static int toPennies(int[] value)
		{
		// convert the change into pennies after taking in the value 
		}
	}
