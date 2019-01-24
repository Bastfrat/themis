package model;

import controller.component.Control;
import model.VcoCEM3340.WaveShape;

/** 
 * Specific controls for the 3340 : 
 * - A 2 wave shapes enum to select the output waveform
 * - ...
 */

public class VcoLM13700 extends Vco {

	public static enum WaveShape {
		
		SQUARE,
		TRIANGLE;
	}

	
	private EnumParameter<WaveShape> shape;
	private BooleanParameter syncFrom3340;
	
	public VcoLM13700() {
		super();
		//shape = new EnumParameter<WaveShape>(null, "Shape");
		parameterList.add(shape);
		// TODO : syncFrom13700
	}

	public EnumParameter<WaveShape> getWaveShape() {
		return shape;
	}
	
	public void setWaveShape(EnumParameter<WaveShape> waveshape) {
		this.shape = waveshape;
	}

	@Override
	public Control createControl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Control getControl() {
		// TODO Auto-generated method stub
		return null;
	}


}
