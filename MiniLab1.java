import java.lang.*;

public class MiniLab1
{
	public static void main (String []args)
	{
		int []list = new int[10];
		double sum = 0;
		for(int k = 0; k < 10; k++)
		{
			list[k] = ((int)(Math.random() * 100));
			System.out.println("Array spot: " + k + "         Value: " + list[k]);
			sum += list[k];
		}
		int minValue = list[0];
		for(int a = 0; a < 10; a++)
		{
			/** Min **/
			if(list[a] < minValue)
			{
				minValue = list[a];

			}			
		}
		int maxValue = list[0];
		for(int b = 0; b < 10; b++)
		{
			/** Max **/
			if(list[b] > minValue)
			{
				minValue = list[b];

			}			
		}
		/** OCD so do \n\n\n\n **/		
		double avg = sum/10;
		System.out.println("\n\nThe Average is: " + avg);
		System.out.println("The Minimum is: " + minValue);
		System.out.println("The Maximum is: " + maxValue + "\n\n\n\n");			
	}
	
}