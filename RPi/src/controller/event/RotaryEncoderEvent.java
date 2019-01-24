package controller.event;

import java.util.EventObject;

/**
 * Gives informations about how a rotaryEncoder control is changed (direction, speed..)
 * This package is the link between messages from the SPI bus and the Controller package
 */

import controller.component.RotaryEncoderDirection;

public class RotaryEncoderEvent extends EventObject {

	private static final long serialVersionUID = 1L;
	
	RotaryEncoderDirection direction;

	public RotaryEncoderEvent(Object source, RotaryEncoderDirection direction) {
		super(source);
		this.direction = direction;
	}
	
	public RotaryEncoderDirection getDirection() {
		return direction;
	}
	
}