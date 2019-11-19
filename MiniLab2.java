import java.lang.*;
import java.util.Scanner;

public class MiniLab2
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int []list = new int[20];
		/** Initalizing Variables **/
		System.out.println("");
		for(int a = 0; a < 20; a++)
		{
			list[a] = (int)(Math.random() * 101);
			System.out.println("Array Position: " + a + "\tHas a value of: " + list[a]);
		}	
		System.out.println("\nThe number of even numbers are: " + getEvenNumbers(list));
		System.out.println("Enter a number to check how many time(s) it occurs: ");
		int abc = keyboard.nextInt();
		System.out.println("\nThe number of times the number " + abc + " occurs are: " + getNumberOfNumbers(list, abc));
	}
	public static int getEvenNumbers(int[] list)
	{
		int checker = 0;
		for(int b = 0; b < 20; b++)
		{
			if(list[b] % 2 == 0)
				checker++;
		}
		return checker;
	}
	public static int getNumberOfNumbers(int[] list, int x)
	{
		int plslol = 0;
		for(int b = 0; b < 20; b++)
		{
			if(list[b] == x)
				plslol++;
		}
		return plslol;
	}
}
