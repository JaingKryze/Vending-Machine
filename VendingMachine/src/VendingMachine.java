import java.util.Scanner;

public class VendingMachine
	{
	private Cashier cashier;
	private InventoryManager im;
	private Scanner keypad;
	public static void main(String[] args)
		{
		
		}
	public void alertUser()
		{
		System.out.println("Hello.");
		System.out.println("Inputs for inserting money must be in the form of the first letter of the coin captiolized(Q for quarter)");
		System.out.println("Inputs for making a selection must be in the form of the letter of the selection followed by number i.e (a3)");
		}
	public void initProducts()
		{
		im.addProduct();
		}
	public void listen()
		{
		String input;
		do
			{
			input = keypad.nextLine();
			
			}
		while(true);
		}
	public void turnOn()
		{
		initProducts();
		alertUser();
		}
	}
