package loop.controller;

import loop.model.Looper;
import loop.view.LoopFrame;

public class LoopController
{
	/**
	 * This is the LoopFrame object that will be used by the controller
	 */
	private LoopFrame appFrame;
	
	/**
	 * This is the Looper object used by the controller.
	 */
	private Looper myLooper;
	
	/**
	 * This is an int that counts the number of clicks on the button
	 */
	private int clickCount;

	/**
	 * Initializes values for the Controller object.
	 */
	public LoopController()
	{
		this.myLooper = new Looper();
		clickCount = 0;
	}

	/**
	 * Starts the application.
	 */
	public void start()
	{
		appFrame = new LoopFrame(this);
	}

	/**
	 * This is a method that returns a String based on a position
	 * @param position This is the position that we are going to return the String from.
	 * @return This is the String that is returned
	 */
	private String getText(int position)
	{
		String results = "";

		if (position > -1 && position < myLooper.getGraveNameList().size())
		{
			results = myLooper.getGraveNameList().get(position);
		}

		return results;
	}
	
	/**
	 * This method gets the results of the list and displays the String
	 * @return This is the String returned by this method
	 */
	public String getLoopResults()
	{
		String currentResults = loopBackwardOverList();

		return currentResults;
	}
	
	/**
	 * This method loops over a list and returns a string 
	 * @return This is what got looped over
	 */
	private String loopOverList()
	{
		String loopedData = "";
		
		for(int position = 0; position < myLooper.getGraveNameList().size(); position++)
		{
			loopedData += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return loopedData;
	}
	
	/**
	 * This method loops over a list but backwards
	 * @return This is the list that got looped over displayed backwards
	 */
	private String loopBackwardOverList()
	{
		String loopedData = "";
		
		for(int position = myLooper.getGraveNameList().size() - 1; position >= 0; position--)
		{
			loopedData += myLooper.getGraveNameList().get(position) + "\n";
		}
		
		return loopedData;
	}

	/**
	 * This method returns the results for a different loop
	 * @return This is the String that is returned from the other loop
	 */
	public String getOtherLoopResults()
	{
		int currentResults = myLooper.loopTestThree();
		String number = "" + currentResults;
		return number;
	}
}
