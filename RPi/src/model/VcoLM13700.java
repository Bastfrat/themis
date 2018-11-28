package model;

import model.VcoCEM3340.WaveShape;

/**
 * 
 * @author Bastien Fratta
 *
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
		shape = new EnumParameter<WaveShape>("WaveShape");
		parameterList.add(shape);
		// TODO : syncFrom13700
	}

	public EnumParameter<WaveShape> getWaveShape() {
		return shape;
	}
	
	public void setWaveShape(EnumParameter<WaveShape> waveshape) {
		this.shape = waveshape;
	}


}
