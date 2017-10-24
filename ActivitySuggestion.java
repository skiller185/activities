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
		
		ArrayList<String> activities = new ArrayList<String>();
		int activitiesSize = activities.size();
		
		for(int i = 0;fileRead.hasNext();i++)
		{
			if(activiesSize - 1 <= i)
			{
				
			}
			else
			{
				activities.set(i, );
			}
		}
	}
}
