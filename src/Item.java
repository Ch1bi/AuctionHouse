
public class Item {
	
	private String name; // name of the item
	private int price;   // price of the item
	private String owner; // owner of the item
	
	public Item(String name, int startingPrice){
		
		this.name = name;
		this.price = startingPrice;
		this.owner = null; //at auction start there is no owner
	}
	
	public String getName(){
		
		return this.name;
	}
	

	
	public int getPrice()
	{
		return this.price;
	}
	
	public void setPrice(int newPrice){
		
	
			
			this.price  = newPrice;
	}
	
	public String owner(){
		
		return this.owner;
	}
	
	public void setOwner(String newOwner){
		
		this.owner = newOwner;
	}
	
	
	
	
	
	

}
