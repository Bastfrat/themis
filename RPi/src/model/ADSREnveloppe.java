package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the parameters for an ADSR enveloppe, Attack, Decay, Sustain, Release
 *
 * @author sydxrey
 *
 */
public class ADSREnveloppe {
	
	protected final List<SynthParameter<?>> parameterList = new ArrayList<SynthParameter<?>>();
	private DoubleParameter attackMs, decayMs, sustainLevel, releaseMs;
	//what about attackLevel or decayLevel ?

	public ADSREnveloppe() {
		attackMs = new DoubleParameter("Attack");
		decayMs = new DoubleParameter("Decay");
		sustainLevel = new DoubleParameter("Sustain");
		releaseMs = new DoubleParameter("Release");
		parameterList.add(attackMs);
		parameterList.add(decayMs);
		parameterList.add(sustainLevel);
		parameterList.add(releaseMs);
	}
	
	public DoubleParameter getAttackMs() {
		return attackMs;
	}

	public void setAttackMs(DoubleParameter attackMs) {
		this.attackMs = attackMs;
	}

	public DoubleParameter getDecayMs() {
		return decayMs;
	}

	public void setDecayMs(DoubleParameter decayMs) {
		this.decayMs = decayMs;
	}

	public DoubleParameter getSustainLevel() {
		return sustainLevel;
	}

	public void setSustainLevel(DoubleParameter sustainLevel) {
		this.sustainLevel = sustainLevel;
	}

	public DoubleParameter getReleaseMs() {
		return releaseMs;
	}

	public void setReleaseMs(DoubleParameter releaseMs) {
		this.releaseMs = releaseMs;
	}

	public List<SynthParameter<?>> getParameters() {
		return parameterList;
	}
	
	
	
}
