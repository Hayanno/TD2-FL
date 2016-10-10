package app;

public class Conversion {
	
	/* Farenheit To Celsius */
	public double convF2C(Double temperature) {
		return temperature - 32 * 5/9;
	}
	
	/* Celsius To Farenheit */
	public double convC2F(Double temperature) {
		return temperature * 9 / 5 + 32;
	}
}
