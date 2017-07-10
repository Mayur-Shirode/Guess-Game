
public class guessGame 
{
	Player p1,p2,p3;
	
	public void startGame()
	{
		p1=new Player();
		p2=new Player();
		p3=new Player();
		
		int guessp1=0,guessp2=0,guessp3=0;
		
		boolean p1isRight=false,p2isRight=false,p3isRight=false;
		
		int targetnumber=(int)(Math.random()*10);
		System.out.println("I am thinking about the number between 0 to 9");
		
		while(true)
		{
			System.out.println("Number to Guess is " +targetnumber );
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1=p1.number;
			System.out.println("Player 1 guess " +guessp1);
			
			guessp2=p2.number;
			System.out.println("Player 2 guess " +guessp2);
			
			
			guessp3=p3.number;
			System.out.println("Player 3 guess " +guessp3);
			
			if (guessp1==targetnumber)
			{
				p1isRight=true;
			}
			if (guessp2==targetnumber)
			{
				p2isRight=true;
			}
			if (guessp3==targetnumber)
			{
				p3isRight=true;
			}
			
			if(p1isRight||p2isRight||p3isRight)
			{
				System.out.println("We have a Winner!");
				System.out.println("Player 1 got it right " +p1isRight);
				System.out.println("Player 2 got it right " +p2isRight);
				System.out.println("Player 3 got it right " +p3isRight);
				
				System.out.println("Game is Over.");
				break;
			}
			else
			{
				System.out.println("Players will have to try again");
			}
		}
		
	}

}
