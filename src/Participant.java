
public class Participant implements IQuery {
	
	private String name;
	
	public Participant(String name){
		
		this.name = name;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setName(String newName){
		
		this.name = newName;
	}
	
	public Item query(Item item)
	{
		return item;
	}
}
