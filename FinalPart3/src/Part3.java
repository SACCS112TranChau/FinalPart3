import java.util.Scanner;
public class Part3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String cont = "N";
		int cardNum = 2;
		//Make card number = 2
		DiceCard dc = new DiceCard(2);
		Dice d = new Dice(2);
		
		
		//Get player points
		int pPoint = 0;
		pPoint = dc.Deal();
		System.out.println("Player points " + pPoint);
		
		
		do
		{	
			System.out.print("Player do you want more card ");
			cont = in.next();
			if(cont.equalsIgnoreCase("y"))
			{
				cardNum = cardNum + 1;
				int TotalPoint = 0;
				TotalPoint = pPoint + dc.Deal();
				dc = new DiceCard(cardNum);
				System.out.println("Player points " + TotalPoint);
			}
			
			
		}while(cont.equalsIgnoreCase("y"));
		
		//Get dealer point.
		int dPoint = 0;
		dPoint = d.m_CardPoint;
		System.out.println("Dealer points " + dPoint);
		do
		{	
			System.out.print("Dealer do you want more card ");
			cont = in.next();
			if(cont.equalsIgnoreCase("y"))
			{
				cardNum = cardNum + 1;
				int totalPoint = 0;
				totalPoint = dPoint + d.m_CardPoint;
				d = new Dice(cardNum);
				System.out.println("Dealer points " + totalPoint);
			}
			
			
		}while(cont.equalsIgnoreCase("y"));
		
		
		
		
		
		System.out.print(dc.toString());
		
			//Start by getting player card number			
			/*System.out.print("Player, Please enter card number: ");
			cardNum = in.nextInt();			
			td = new DiceCard(cardNum);
			System.out.println("Your card point: " + td.Deal());
			
			//Get dealer card number;
			System.out.print("Dealer enter card number: ");
			cardNum = in.nextInt();
			Dice d = new Dice(cardNum);
			System.out.println("Dealer card point: " + d.Deal());*/
			
	
			
			//System.out.print(td.toString());
			
		

		
		//td.toString();
		//GameHistory history = new GameHistory();
		//history.toString();
		in.close();

	}

}
