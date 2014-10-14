
public class Product
	{
	private String snackName;
	private int costInCents;
	public Product(String name, int price)
		{
		snackName = name;
		costInCents = price;
		}
	public String getSnackName()
		{
		return snackName;
		//work on other class 12
		}
	public int getCostInCents()
		{
		return costInCents;
		}
	public void setSnackName(String snackName)
		{
		this.snackName = snackName;
		}
	public void setCostInCents(int costInCents)
		{
		this.costInCents = costInCents;
		}
	
	}
