package loop.model;

import java.util.ArrayList;

public class Looper
{
	/**
	 * This is an ArrayList<String> full of names that we can loop over
	 */
	private ArrayList<String> graveNameList;
	
	/**
	 * This is the constructor for the Looper object
	 */
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheNameList();
	}
	
	/**
	 * This is the getter for the GraveNameList
	 * @return This is the ArrayList<String> that is got
	 */
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	/**
	 * This method fills the ArrayList<String> graveNameList
	 */
	private void fillTheNameList()
	{
		graveNameList.add("Melba Ahlstrom");
		graveNameList.add("Lucille Lynn Myers");
		graveNameList.add("Joseph Lorenzo Pierson");
		graveNameList.add("Beatrice Smith Pierson");
		graveNameList.add("Barbara Ann Fincher Jacobs");
		graveNameList.add("Lennie Spears Orton Hardy");
		graveNameList.add("Florence G. Orton");
		graveNameList.add("Frank C. Orton");
	}

	/**
	 * This is the first method that tests a loop
	 * @return This prints out the number of times the loop went through
	 */
	public String loopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;

		for (int loopCounter = 0; loopCounter <= 10; loopCounter += 2)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}

		loopResult += "\nThe loop executed " + timesLooped + " times.";

		return loopResult;
	}

	/**
	 * This is the second method that tests a loop
	 * @return This returns the number of times the loop happened
	 */
	public String loopTestTwo()
	{
		String loopResult = "";
		int outerLoopTimes = 0;
		int timesLooped = 0;
		for (int weeks = 0; weeks < 52; weeks++)
		{
			for (int hours = 0; hours < 24; hours++)
			{
				for (int outerLoop = 0; outerLoop < 60; outerLoop++)
				{
					for (int loopCounter = 0; loopCounter < 60; loopCounter++)
					{
						loopResult += loopCounter + ", ";
						timesLooped++;
					}
					outerLoopTimes++;
				}
			}
		}
		loopResult += "\nThe loop executed " + timesLooped + " times.";

		return loopResult;
	}

	/**
	 * This is the third method that tests a loop
	 * @return This is the String that is produced by this loop
	 */
	public int loopTestThree()
	{
		String loopResult = "";
		int timesLooped = 0;
		for (double lightyears = 0.0; lightyears < 3.26163344; lightyears++)
		{
			for (double miles = 0.0; miles < 5878499810000.0; miles++)
			{
				for (int feet = 0; feet <= 5280; feet++)
				{
					for (int inches = 0; inches <= 12; inches++)
					{
						//loopResult += inches + ", ";
						timesLooped++;
					}
				}
			}
		}
		//loopResult += "\nThere are " + timesLooped + " inches in a lightyear.";

		return timesLooped;
	}
}
