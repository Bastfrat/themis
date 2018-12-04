package view.frontpane;

public class BarGraph {

	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE = 10;
	
	public void setValue(int v) {
		if (v > MAX_VALUE)
			throw new IllegalArgumentException(v + " greater than " + MAX_VALUE);
		else if (v < MIN_VALUE)
			throw new IllegalArgumentException(v + " lower than " + MIN_VALUE);
	}
}
