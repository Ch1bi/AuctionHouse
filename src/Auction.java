import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Auction implements IQuery {
	
	 List<Item> itemList = new ArrayList<Item>();
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
	
	
	private void startAuction(){
		
		System.out.println("We have an amazing item up for bid!");  
		addItem();
		
		//Start the bid and add the participants
		addParticipants();
	}
	


}
