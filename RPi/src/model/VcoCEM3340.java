package model;

import controller.component.Control;

/** 
 * Specific controls for the 3340 : 
 * - A 4 wave shapes enum to select the output waveform
 * - ...
 */

public class VcoCEM3340 extends Vco{

	public static enum WaveShape {
		
		SQUARE,
		TRIANGLE,
		PULSE,
		SAWTOOTH;
	}
	
	private EnumParameter<WaveShape> shape;
	private BooleanParameter syncFrom13700;
	
	public VcoCEM3340() {
		super();
		shape = new EnumParameter<WaveShape>(WaveShape.class,"Shape");
		syncFrom13700 = new BooleanParameter("Shape");
		parameterList.add(shape);
		parameterList.add(syncFrom13700);
		// TODO : syncFrom13700
	}

	public BooleanParameter getSyncFrom13700() {
		return syncFrom13700;
	}

	public void setSyncFrom13700(BooleanParameter syncFrom13700) {
		this.syncFrom13700 = syncFrom13700;
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
