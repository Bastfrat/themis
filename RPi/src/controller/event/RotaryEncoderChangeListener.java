package controller.event;

import java.util.EventListener;
import controller.component.Control;

/**
 * Manage and update the listener list to threw information to modules interested in changes of certain rotary controls.
 * This is the link between Model and Controller packages.
 */

public interface RotaryEncoderChangeListener extends EventListener {

	void encoderRotated(RotaryEncoderEvent e);

	Control getControl();
	
}