package model;

import controller.FrontPane;
import controller.PerformancePad;
import controller.component.PushButton;
import controller.event.PushButtonActionEvent;
import controller.event.PushButtonActionListener;

/**
 * 
 * @author Bastien Fratta
 *
 */
public class Vco implements PushButtonActionListener {
	protected double detune;
	protected Octave octave;
	
	Vco(){
		octave = Octave.FOUR_INCHES;
		detune = 0;
		PushButton pushBut = PerformancePad.getPerformancePadPushButton(5, 4);
		pushBut.addPushButtonActionListener(this);
	}
	
	public Octave getOctave() { // TODO Sylvain utiliser une enum
		return octave;
	}

	public void setOctave(Octave octave) {
		this.octave = octave;
	}
	
	public void setDetune(double detune) {
		this.detune = detune;
	}
	
	public double getDetune() {
		return detune;
	}
	

	@Override
	public void actionPerformed(PushButtonActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

}
