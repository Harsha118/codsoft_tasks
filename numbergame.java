package codsoft_project;
import java.util.Scanner;
public class numbergame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chances=10;
		int finals=0;
		boolean playagain=true;
		System.out.println("HELLO Buddy!");
		System.out.println(" HEY Buddy you have about  " +chances+"  to win the game");
		while(playagain) {
			int rand =getrandN(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++)
			{
				System.out.println("chance"+(i+1) + "  Enter your guess:");
				int user =sc.nextInt();
						if (user==rand) {
							guess=true;
							finals+=1;
							System.out.println("you won the match.");
							break;
						}
						else if (user>rand) {
							System.out.println("Too high to find number");
						}
						else {
							System.out.println("Too low  to find the number");
						}
					}
			if(guess==false) {
				System.out.println("sorry buddy.you lost the chances.The Number is "+rand);
				}
			System.out.println("Do you want to play again(yes/no)");
			String pA=sc.next();
			playagain=pA.equalsIgnoreCase("yes");
		}
		System.out.println("Keep it up Buddy");
		System.out.println("Here your score"+finals);
	}
		public static int getrandN(int min,int max)
		{
			return (int)(Math.random()*(max-min+1)+min);
			
		}
	}



