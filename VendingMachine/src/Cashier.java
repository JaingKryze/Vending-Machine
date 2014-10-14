
public class Cashier
	{
	private int centCount = 0;
	private int currentCents;
	public Cashier(int c)
		{
		currentCents = c;
		}
	public int[] addMoney(int value)
		{
		//take the money that the user inputs into the scanner and add it in to an array 
		centCount = centCount + value;
		}
	public int[] currentValue()
		{
		int[] currentValueArray;
		currentValueArray = new int[2];
		currentValueArray[0] = (int) centCount/100;
		currentValueArray[1] = centCount%100;
		return currentValueArray;
		}
	public void purchase(int price)
		{
		ProductManager.get(item number).getCostInCents();
		// make sure you have the variable that will get the correct product
		}
	public String returnChange(int[] money)
		{
		ProductManager.get(item number).getPrice() - centCount);
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
