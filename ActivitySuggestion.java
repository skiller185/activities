import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ActivitySuggestion
{
	public static void main(String[] args)
	{
		//input Scanner calls from console
		//fileRead Scanner calls from the File set by the first argument
		Scanner input = new Scanner(System.in);
		Scanner fileRead = new Scanner(new File(args[0]));
		
		ArrayList<String> activities = new ArrayList<String>(0);
		ArrayList<String> nopes = new ArrayList<String>(0);
		
		for(int i = 0;fileRead.hasNext();i++)
		{
			activities.add(fileRead.nextLine());
		}
		
		Random rand = new Random();
		boolean rejected = true;
		int remainingActivities;
		
		while(rejected)
		{
			remainingActivities = activities.size();
			int choice = rand.nextInt(remainingActivities);
			boolean responseInvalid = true;
			char response;
			while(responseInvalid)
			{
				System.out.println("Would you like to " + activities.get(choice) + " (y/n)?");
				String decision = input.nextLine();
				response = decision.charAt(0);
				if(response == 'y')
				{
					responseInvalid = false;
					rejected = false;
				}
				else if(response == 'n')
				{
					responseInvalid = false;
				}
				else
				{
					System.out.println("I'm sorry. I don't understand what you meant by that. Could you say that differently?");
					System.out.println("(Respond with the letter y or n.)");
				}
			}
			if(response == 'n')
			{
				nopes.add(activities.remove(choice));
			}
		}
	}
}