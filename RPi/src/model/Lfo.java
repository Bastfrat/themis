package model;

/**
 * This class instantiate every parameters of a LFO type module and create a list of those parameters
 * There is only 2 parameters : the wave shape and its frequency
 * Every LFOs have the same parameters.
 * A good feature to add is the sync type of the LFO (beat or time) and its triggering (keyboard, time or beat looped)
 * 
 * @author Bastien Fratta
 */
public class Lfo {
	private double frequency;
	enum WaveShape {
		
		SQUARE,
		TRIANGLE,
		PULSE,
		SAWTOOTH;
	}
	WaveShape shape;
	
	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
}
