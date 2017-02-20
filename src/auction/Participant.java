package auction;

public class Participant implements IQuery {
	
	private String name;
	private int bid;
	
	public Participant(String name){
		
		this.name = name;
		this.bid = 0;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setName(String newName){
		
		this.name = newName;
	}
	
	public int getBid(){
		
		return this.bid;
	}
	
	public void setBid(int newBid){
		
		this.bid = newBid;
	}
	
	public String query(String itemName)
	{
		//toDo:implement method
		return "";
	}
	
}
