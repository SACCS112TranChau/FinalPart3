
public class DiceCard extends Dice{
	private int m_CardValue;
	
	public DiceCard(int num)
	{
		super(num);
		Deal();
	}
	
	@Override
	public int Deal()
	{		
		m_CardValue = (int)(Math.random() * super.GetCardNumber() * 6 ) + 1;
		return m_CardValue;		
	}
	
	public int PlayerPoint()
	{
		return m_CardValue;
	}
	
	@Override 
	public String toString()
	{
		String result = "";
		
		if(Deal() > 21)
			result = "Player loses";
		if(super.GetCardPonit() > Deal())			
		{
			if(super.GetCardNumber() > 21)
				result = "Dealer lose";
			else
				result = "Player wins";
		}
		else if(super.GetCardPonit() < Deal())
		{
			if(Deal() > 21)
				result = "Player loses";
			else
				result = "Player wins";
		}
		else if(super.GetCardPonit() == Deal() )
			result = "Deuces";
		else if(super.GetCardPonit() == 21)
			result = "Dealer get 21, dealer wins";
		else if(PlayerPoint() == 21)
			result = "Player get 21, player wins";
		
		return result;
	}

}
