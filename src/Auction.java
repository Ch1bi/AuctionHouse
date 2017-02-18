import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Auction implements IQuery {
	
	/*Class Variables*/
	
	private String name;
	//private int currentBid = 0;
	int counter = 3; //countdown of timer
	
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
		System.out.println("$" + startingBid);
		Item newItem = new Item(name, startingBid);
		itemList.add(newItem);
		
		addParticipants();
		
		//toDO: need to fix count size issue later
	}
	
	//add participants part of the auction
	public void addParticipants(){
		
		
		while(scanner.hasNextLine()){
			
			System.out.println("Enter Participants followed by enter. When done enter -1");
			String name = scanner.nextLine().toLowerCase();
			Participant bidder = new Participant(name);
			participants.add(bidder);
			System.out.println("size of list is " + participants.size());
			
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
		startTimer();
		
	}
	
	 Timer timer = new Timer();
	 
		TimerTask task = new TimerTask(){
			
			public void run(){
				
				System.out.println("Going in " + counter);
				counter--;
			}
		};
	
	public void startTimer (){
		
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
	/*End Class Methods*/
	
}
