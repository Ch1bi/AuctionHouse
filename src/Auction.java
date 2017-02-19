import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Auction implements IQuery {
	
	/*Class Variables*/
	
	private String name;
	
	private int currentBid = 0;
	private int allowedBids = 4; // only 4 bids are allowed
	
	/*End Class Variables*/
	
	public String currentBidder = null;
	
	/*Initializations*/
	 Scanner scanner = new Scanner(System.in);
	 List<Item> itemList = new ArrayList<Item>(); //item list
	 List<Participant> participants = new ArrayList<Participant>();
	
	public Auction(String name){
		
		this.name = name;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public void setName(String newName){
		
		this.name = newName;
	}
	
	 /*End Initializations*/
	
	
		
	/*Class Methods*/

	@Override
	public void query(Item item) {
		
		
	}
	
	//method when called starts the auction
	public void startAuction(){
		
		System.out.println("We have an amazing item up for bid!");  
		
	}
	
	public void addItem(){
		//get the input, and read it in
		//create the item
		//add to list
		
		System.out.print("We have the ");
		String name  = scanner.nextLine();
		System.out.println(name + " up for bid");
		
		System.out.println("The starting bid is set at");
		int startingBid = scanner.nextInt();
		System.out.println("$" + startingBid);
		currentBid = startingBid;
		
		Item newItem = new Item(name, startingBid);
		itemList.add(newItem);
				
	}
	
	//add participants part of the auction
	public void addParticipants(){
		
		
		while(scanner.hasNextLine()){
			
			System.out.println("Enter Participants followed by enter. When done, type done");
			String name = scanner.nextLine().toLowerCase();
			
			Participant bidder = new Participant(name);
			participants.add(bidder);
			
			if(name.equals("done")){
				
				//move to starting the bidding
				startBidding();
			}
			
		}
	}
	
	public void checkBid(){
		
		System.out.println("What's your bid?");
		int bid = scanner.nextInt();
		
		//add participants bid here
		
		for(Participant p : participants){
			
			if(currentBidder.equals(p.getName())){
				
				if(bid > currentBid){
					
					System.out.println("Bid Accepted!");
					p.setBid(bid);
					System.out.println("This is " + p.getName());
					System.out.println("The bid is " + p.getBid());
					currentBid = bid;
					allowedBids --;
					
				}
				
				else{
					
					System.out.println("Bid is too low!");
				}
				
				
				
			}
		}
	
		
		
	}
	
	
	//bidding process of auction
	public void startBidding(){
		
		while(allowedBids > 0)
		{
			System.out.println("allowed bids is at " + allowedBids);
			
			System.out.println("The current bid is set at " + currentBid);
			System.out.println("Would anyone like to bid");
			System.out.println("Press b to bid");
			String input = scanner.next().toLowerCase();
			
			System.out.println("Enter bidders name");
			String name = scanner.next().toLowerCase();
			
			//easier to use enhanced for to get Participant names 
			for(Participant p : participants)
			{
				if(name.equals(p.getName())){
					
					currentBidder = name;
					
					checkBid();
				
				}
				
				//if name isn't found the startBidding method is looped 
			
		}
		
		
		}
		
		auctionWinner();
		
	
}
	/*End of Bidding Method*/
	
	//announces winner of auction
	public void auctionWinner(){
		
	
	}
	

	
	/*End Class Methods*/
	
	
}
