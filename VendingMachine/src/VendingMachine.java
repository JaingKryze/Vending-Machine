
public class VendingMachine
	{
	public Cashier cashier;
	public InventoryManager im;
 static void main(String[] args)
		{
		
		}
	public void alertUser()
		{
		System.out.println("Hello.");
		System.out.println("Inputs for inserting money must be in the form of the first letter of the coin captiolized followed immediately by the number of coins i.e. (Q1 for one quarter)");
		System.out.println("Inputs for making a selection must be in the form of the letter of the selection followed by number i.e (a3)");
		}
	public void initProducts()
		{
		InventoryManager.allProducts.add(new ProductManager(new Product("Cheetos", 75), 10));
		InventoryManager.allProducts.add(new ProductManager(new Product("Goldfish", 75), 10));
		InventoryManager.allProducts.add(new ProductManager(new Product("Pretzels", 50), 7));
		InventoryManager.allProducts.add(new ProductManager(new Product("Jolly_Ranchers", 60), 4));
		InventoryManager.allProducts.add(new ProductManager(new Product("Oatmeal_Cookie", 100), 12));
		InventoryManager.allProducts.add(new ProductManager(new Product("Snickers", 50), 8));
		InventoryManager.allProducts.add(new ProductManager(new Product("Stride_Gum", 65), 3));
		InventoryManager.allProducts.add(new ProductManager(new Product("Beef_Jerky", 140), 1));
		InventoryManager.allProducts.add(new ProductManager(new Product("Chex_Mix", 70), 1));
		InventoryManager.allProducts.add(new ProductManager(new Product("Popcorn", 35), 5));
		}
	public void listen()
		{
		
		}
	public void turnOn()
		{
		initProducts();
		
		}
	}
