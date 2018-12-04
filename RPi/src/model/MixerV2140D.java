package model;

import java.util.ArrayList;
import java.util.List;

public class MixerV2140D {

	private DoubleParameter gain1dB;
	private DoubleParameter gain2dB;
	private DoubleParameter gain3dB;
	private DoubleParameter gain4dB;
	protected final List<SynthParameter<?>> parameterList = new ArrayList<SynthParameter<?>>();
	
	public MixerV2140D(){
		gain1dB = new DoubleParameter("VCO1 Level");
		gain2dB = new DoubleParameter("VCO2 Level");
		gain3dB = new DoubleParameter("Sub Level");
		gain4dB = new DoubleParameter("VCO Detune");
		parameterList.add(gain1dB);
		parameterList.add(gain2dB);
		parameterList.add(gain3dB);
		parameterList.add(gain4dB);
	}
	
	public DoubleParameter getGain1dB() {
		return gain1dB;
	}
	public void setGain1dB(DoubleParameter gain1dB) {
		this.gain1dB = gain1dB;
	}
	public DoubleParameter getGain2dB() {
		return gain2dB;
	}
	public void setGain2dB(DoubleParameter gain2dB) {
		this.gain2dB = gain2dB;
	}
	public DoubleParameter getGain3dB() {
		return gain3dB;
	}
	public void setGain3dB(DoubleParameter gain3dB) {
		this.gain3dB = gain3dB;
	}
	public DoubleParameter getGain4dB() {
		return gain4dB;
	}
	public void setGain4dB(DoubleParameter gain4dB) {
		this.gain4dB = gain4dB;
	}
	public List<SynthParameter<?>> getParameters() {
		return parameterList;
	}
	
}
