
public class AuctionTest {

	public static void main(String[] args) {
		
		Auction auction = new Auction("diamonds");
		auction.startAuction();
		auction.addItem();
		auction.addParticipants();
		auction.auctionWinner();
	}

}
