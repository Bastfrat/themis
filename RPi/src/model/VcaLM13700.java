package model;

import java.util.ArrayList;
import java.util.List;

public class VcaLM13700 {
	private DoubleParameter egDepth,kbdTracking;
	protected final List<SynthParameter<?>> parameterList = new ArrayList<SynthParameter<?>>();
	
	public VcaLM13700() {
		kbdTracking = new DoubleParameter("Keyboard");
		egDepth = new DoubleParameter("EG Depth");
		parameterList.add(kbdTracking);
		parameterList.add(egDepth);
	}

	public DoubleParameter getEnvGenDepth() {
		return egDepth;
	}

	public void setEnvGenDepth(DoubleParameter egDepth) {
		this.egDepth = egDepth;
	}

	public DoubleParameter getKbdTracking() {
		return kbdTracking;
	}

	public void setKbdTracking(DoubleParameter kbdTracking) {
		this.kbdTracking = kbdTracking;
	}
	
	public List<SynthParameter<?>> getParameters() {
		return parameterList;
	}
}
