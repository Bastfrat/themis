package model;

import java.util.*;
//import controller.FrontPane;
//import controller.PerformancePad;
//import controller.component.Control;
//import controller.component.PushButton;
import controller.event.PushButtonActionEvent;
import controller.event.PushButtonActionListener;
import model.Octave;

/**
 * This class instantiate every parameters of a VCO type module and create a list of those parameters
 * The basic controls such as Octave and fine tuning and many more are set here.
 * It is completed by the 2 classes VcoCEM3340 and VxoLM13700 which add more specific controls for those VCOs.
 * 
 * @author Bastien Fratta
 */

public abstract class Vco extends AbstractModel implements PushButtonActionListener {
	
	protected DoubleParameter detune;
	protected EnumParameter<Octave> octave;
	
	public Vco(){
		detune = new DoubleParameter("Detune", 0, 0, 0);
		octave = new EnumParameter(Octave.class, "Octave");
		parameterList.add(detune);
		parameterList.add(octave);

		/*PushButton pushBut = PerformancePad.getPerformancePadPushButton(5, 4);
		pushBut.addPushButtonActionListener(this);
		*/
		
	}
	
	public EnumParameter<Octave> getOctave() { // TODO Sylvain utiliser une enum
		return octave;
	}

	public void setOctave(EnumParameter<Octave> octave) {
		this.octave = octave;
	}
	
	public DoubleParameter getDetune() {
		return detune;
	}

	public void setDetune(DoubleParameter detune) {
		this.detune = detune;
	}
	
	

	@Override
	public void actionPerformed(PushButtonActionEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public List<SynthParameter<?>> getParameters() {		
		return parameterList;
	}
	
}