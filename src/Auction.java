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
	//int counter = 3; //countdown of timer
	
	/*End Class Variables*/
	
	
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
	public Item query(Item item) {
		// TODO Auto-generated method stub
		return item;
	}
	
	//method when called starts the auction
	public void startAuction(){
		
		System.out.println("We have an amazing item up for bid!");  
		addItem();
		
	}
	
	private void addItem(){
		//get the input, and read it in
		//create the item
		//add to list
		
		System.out.print("We have the ");
		String name  = scanner.nextLine();
		System.out.println(name + " up for bid");
		System.out.println("The starting bid is set at");
		int startingBid = scanner.nextInt();
		currentBid = startingBid;
		System.out.println("$" + startingBid);
		Item newItem = new Item(name, startingBid);
		itemList.add(newItem);
		
		addParticipants();
		
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
	
	
	//bidding process of auction
	public void startBidding(){
		
		System.out.println("The current bid is set at " + itemList.get(0).getPrice());
		System.out.println("Would anyone else like to bid");
		System.out.println("Press b to bid");
		String input = scanner.next();
		
		System.out.println("Enter bidders name");
		String name = scanner.next().toLowerCase();
		
		if(name.equals(participants.get(1).getName())){
			
			System.out.println("What's your bid");
			int bid = scanner.nextInt();
			
			if(bid > currentBid){
				
				currentBid = bid;
				allowedBids --;
				
				System.out.println("Success! Would anyone else like to bid?");
			}
		}
		
		else{
			
			System.out.println("That participant doesn't exist, try again");
			startBidding();
		}
		//startTimer();
		
	}
	
	//toDo implement a timer at a later time
	
/*	 Timer timer = new Timer();
	 
		TimerTask task = new TimerTask(){
			
			public void run(){
				
				System.out.println("Going in " + counter);
				counter--;
				
				if(counter < 0){
					
					timer.cancel();
					System.out.println("sold!");
				}
			}
		};
	
	public void startTimer (){
		
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}*/
	
	/*End Class Methods*/
	
}
