
public class Dice {

	//Encapsulate card
			protected int m_CardPoint;
			private int m_CardNumber;
			
			//Class constructor
			public Dice(int s)
			{
				m_CardNumber = s;
				Deal();
			}
			
			//Get card number
			public int GetCardNumber()
			{
				return m_CardNumber;
			}
			
			public int Deal()
			{
				m_CardPoint = (int)(Math.random() * m_CardNumber * 11) + 1;
				return m_CardPoint;
			}
			
			//get Card Point
			public int GetCardPonit()
			{
				return m_CardPoint;
			}

}
