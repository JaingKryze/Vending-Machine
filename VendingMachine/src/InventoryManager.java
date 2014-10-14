import java.util.ArrayList;
public class InventoryManager
	{
	private ArrayList<ProductManager> allProducts;
	public void addProduct(Product product, int quantity)
		{
		allProducts.add(new ProductManager(product, quantity));
		}
	public boolean attemptPurchase()
		{
		if()
			{
			return true;
			}
		else
			{
			return false;
			}
		}
	public ProductManager find()
		{
		return;
		}
	public boolean isInStock()
		{
		if()
			{
			return true;
			}
		else
			{
			return false;
			}
		}
	public boolean isValidItemCode()
		{
		if()
			{
			return true;
			}
		else
			{
			return false;
			}
		}
	public ArrayList<ProductManager> listProducts()
		{
		return;
		}
	public ArrayList<Product> productsByPrice()
		{
		return;
		}
	}
