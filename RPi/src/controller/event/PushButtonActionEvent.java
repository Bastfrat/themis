package controller.event;

import java.util.EventObject;

import javafx.event.EventHandler;

/**
 * Gives informations about how a PushButton control is changed (direction, speed..)
 * This package is the link between messages from the SPI bus and the Controller package
 */

public class PushButtonActionEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	
	boolean state;

	public PushButtonActionEvent(Object source, boolean state) {
		super(source);
		this.state = state;
	}
	
	public boolean getState() {
		return state;
	}
}
