//Seth Novosel
public class ProductManager
	{
	// A static string keeping track of the last itemCode used.
	private static String nextItemCode = "A1";
	// The itemCode managed by each object.
	private String itemCode;
	// The Product this ProductManager is managing.
	private Product product;
	// The number of said Products loaded into the Vending Machine.
	private int quantity;
	public ProductManager(Product p, int q)
		{
		p = product;
		q = quantity;
		}
	public boolean vendItem()
		{
		if(quantity > 0)
			{
			return true;
			}
		else
			{
			return false;
			}
		}
	public java.lang.String getItemCode()
		{
		return itemCode;
		}
	public Product getProduct()
		{
		return product;
		}
	public boolean isInStock()
		{
		if(quantity > 0)
			{
			return true;
			}
		else
			{
			return false;
			}
		}
	public static void incrementItemCode()
		{
		char letter = nextItemCode.charAt(0);
		char number = nextItemCode.charAt(1);
		number++;
		if(number > 53)
			{
			number = '5';
			letter++;
			}
		nextItemCode = String.valueOf(letter) + String.valueOf(number);
		}
	}
