package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;

public class LoopPanel extends JPanel
{
	/**
	 * This is the controller that will hook to this panel
	 */
	private LoopController baseController;
	
	/**
	 * This is the layout that will define the space of this panel
	 */
	private SpringLayout baseLayout;
	
	/**
	 * This is a text Area that will display the results from the loops
	 */
	private JTextArea loopTextArea;
	
	/**
	 * This is the button that submits actions to the controller
	 */
	private JButton submitButton;
	
	/**
	 * This is the object that allows the text area created to be able to scroll
	 */
	private JScrollPane textPane;
	
	/**
	 * Creates a LoopPanel object linked via the controller for MVC paradigm.
	 * @param baseController The linked controller object.
	 */
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10, 20);
		submitButton = new JButton("Click Here :D");
		textPane = new JScrollPane(loopTextArea);

		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	/**
	 * Adds all components to the panel, sets color and component settings.
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(24, 76, 194));
		this.add(submitButton);
		this.add(textPane);
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
	}
	
	/**
	 * Places the components of the Panel in the places that they need to be
	 */
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 67, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, submitButton, -76, SpringLayout.EAST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 10, SpringLayout.WEST, this);
	}
		
	/**
	 * This sets up the listeners for certain actions that can happen using certain objects   on the panel
	 */
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						loopTextArea.append(baseController.getLoopResults());
					}
				});
	}
}
