
public class Item {
	
	private String name;
	private int price;
	
	public Item(String name, int startingPrice){
		
		this.name = name;
		this.price = startingPrice;
	}
	
	public String getItem(){
		
		return this.name;
	}
	
	public void setItem(String name)
	{
		this.name = name;
	}
	

	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setPrice(int newPrice){
		
		this.price  = newPrice;
	}
	
	
	
	

}
