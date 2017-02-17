
public class Item {
	
	private String name; // name of the item
	private int price;   // price of the item
	private String owner; // owner of the item
	
	public Item(String name, int startingPrice){
		
		this.name = name;
		this.price = startingPrice;
		this.owner = null; //at auction start there is no owner
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
		
		if(newPrice > this.price){
			
			this.price  = newPrice;
		}
		
		else{
			
			System.out.println("Your bid is too low, please bid higher");
		}
		
	}
	
	public String owner(){
		
		return this.owner;
	}
	
	public void setOwner(String newOwner){
		
		this.owner = newOwner;
	}
	
	
	
	
	
	

}
