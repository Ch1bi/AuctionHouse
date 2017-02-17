import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Auction implements IQuery {
	
	public String name;
	
	public Auction(String name){
		
		this.name = name;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setName(String newName){
		
		this.name = newName;
	}
	
	 List<Item> itemList = new ArrayList<Item>(); //item list
	 List<Participant> participants = new ArrayList<Participant>();
	 
	 Scanner scanner = new Scanner(System.in);

	@Override
	public Item query(Item item) {
		// TODO Auto-generated method stub
		return item;
	}
	
	private void addItem(){
		//get the input, and read it in
		//create the item
		//add to list
		
		System.out.print("We have the ");
		String name  = scanner.nextLine();
		System.out.println(name + " up for bid");
		System.out.print("The starting bid is");
		int startingBid = scanner.nextInt();
		System.out.println("$" + startingBid);
		Item newItem = new Item(name, startingBid);
		itemList.add(newItem);
		
		//need to fix naming issue when creating Item object
	}
	
	private void addParticipants(){
		
		System.out.println("Enter Participants followed by enter. When done enter -1");
		
		//toDO implement method
		String name = scanner.nextLine();
		Participant bidder = new Participant(name);
		participants.add(bidder);
		
		while(name != "-1"){
			
			addParticipants();
		}
	}
	
	private void startAuction(){
		
		System.out.println("We have an amazing item up for bid!");  
		addItem();
		
		//Start the bid and add the participants
		addParticipants();
	}
	
}
