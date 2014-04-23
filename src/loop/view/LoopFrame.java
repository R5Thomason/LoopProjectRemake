package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;

public class LoopFrame extends JFrame
{
	/**
	 * The referenced controller object.
	 */
	private LoopController baseController;
	/**
	 * The application's main panel for GUI.
	 */
	private LoopPanel basePanel;
	
	/**
	 * Creates a LoopFrame object with a linked LoopController for the MVC paradigm.
	 * @param baseController The referring controller.
	 */
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Sets the content, size and visibility of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}
}
