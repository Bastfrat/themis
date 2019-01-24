package controller.event;

import java.util.EventListener;

import controller.component.Control;

/**
 * Manage and update the listener list to threw informations to modules interested in changes of certain push controls.
 * This is the link between Model and Controller packages.
 */

public interface PushButtonActionListener extends EventListener {
	
void actionPerformed(PushButtonActionEvent e);

Control createControl();

Control getControl();

}
